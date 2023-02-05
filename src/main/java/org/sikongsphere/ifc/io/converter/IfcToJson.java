/*
 * Copyright 2022 SikongSphere
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
*/
package org.sikongsphere.ifc.io.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.sikongsphere.ifc.io.IfcFileReader;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelationship;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRoot;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcSIUnit;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcGeometricRepresentationContext;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcShapeRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

import java.io.IOException;
import java.util.*;

import static org.sikongsphere.ifc.io.converter.CvtUtils.*;

/**
 * @author:stan
 * @date:2023/2/5 10:01
 */
public class IfcToJson {

    private ArrayList<Object> jsonObjects = new ArrayList<>();
    private ArrayList<IfcAbstractClass> relationShips = new ArrayList<>();
    private HashMap<Integer, Object> rootObjects = new HashMap<>();
    private IfcFileModel ifcFileModel;

    public IfcToJson(IfcFileModel ifcFileModel) {
        this.ifcFileModel = ifcFileModel;
    }

    private void getAllEntityContainsglobalId() {
        CvtUtils.getAllChildNodesFrom(this.ifcFileModel, IfcRoot.class).forEach(x -> {
            if (isBelongTo(x, IfcRelationship.class)) this.relationShips.add(x);
            else {
                IfcRoot entity = (IfcRoot) x;
                this.rootObjects.put(
                    x.getStepNumber(),
                    Guid.split(Guid.expand(entity.getGlobalId().getValue()))
                );
            }
        });
    }

    private void getSeparateEntity() {
        CvtUtils.getAllChildNodesFrom(this.ifcFileModel, IfcShapeRepresentation.class)
            .forEach(
                x -> { this.rootObjects.put(x.getStepNumber(), UUID.randomUUID().toString()); }
            );
        CvtUtils.getAllChildNodesFrom(this.ifcFileModel, IfcOwnerHistory.class)
            .forEach(
                x -> { this.rootObjects.put(x.getStepNumber(), UUID.randomUUID().toString()); }
            );
        CvtUtils.getAllChildNodesFrom(this.ifcFileModel, IfcGeometricRepresentationContext.class)
            .forEach(
                x -> { this.rootObjects.put(x.getStepNumber(), UUID.randomUUID().toString()); }
            );
    }

    private void getSeparateRelationship() {
        this.relationShips.forEach(x -> {
            IfcRelationship entity = (IfcRelationship) x;
            String split = Guid.split(Guid.expand(entity.getGlobalId().getValue()));
            this.rootObjects.put(entity.getStepNumber(), split);
        });
    }

    private void getRootObjects() {
        this.rootObjects.forEach((key, value) -> {
            IfcAbstractClass entity = CvtUtils.getEntityByStepNumber(this.ifcFileModel, key);
            HashMap<Object, Object> entityAttributes = CvtUtils.jsonifyEntity(entity);

            entityAttributes.put("globalId", this.rootObjects.get(entity.getStepNumber()));
            this.jsonObjects.add(this.createFullObject(entityAttributes));
        });
    }

    /**
     * Recursive method that walks through all nested objects of an attribute
     * and returns a ifcJSON-4 model structure
     *
     * @param value
     * @return
     */
    private Object getAttributeValue(Object value) {
        Object jsonValue = null;

        if (value == null | value == "") {
            jsonValue = null;
        } else if (value instanceof IfcAbstractClass) {
            IfcAbstractClass entity = (IfcAbstractClass) value;
            HashMap<Object, Object> entityAttributes = jsonifyEntity(entity);

            // ToDo remove empty properties

            if (isBelongTo(entity, IfcSIUnit.class)) {
                entityAttributes.put("dimensions", getDimensionsForSiUnit(entity));
            }

            if (this.rootObjects.containsKey(entity.getStepNumber())) {
                entityAttributes.put("globalId", this.rootObjects.get(entity.getStepNumber()));
                return CvtUtils.createReferencedObject(entityAttributes);
            } else {
                if (entityAttributes.containsKey("globalId")) {
                    IfcRoot ifcRoot = (IfcRoot) entity;
                    entityAttributes.put(
                        "globalId",
                        Guid.split(Guid.expand(ifcRoot.getGlobalId().getValue()))
                    );
                }
            }
            return createFullObject(entityAttributes);
        } else if (value instanceof SET) {
            SET temp = (SET) value;
            Set set = temp.getObjects();
            ArrayList<Object> list = new ArrayList<>();
            for (Object o : set) {
                Object attributeValue = this.getAttributeValue(o);
                list.add(attributeValue);
            }
            jsonValue = list;
        } else jsonValue = value;

        return jsonValue;
    }

    /**
     * 构建符合标准的IfcJSON格式
     *
     * @param entityAttributes
     * @return
     */
    public HashMap<Object, Object> createFullObject(HashMap<Object, Object> entityAttributes) {
        HashMap<Object, Object> fullObject = new HashMap<>();
        for (Object attr : entityAttributes.keySet()) {

            if (attr.equals("id")) {
                continue;
            }

            if (attr.equals("warppedValue")) {
                attr = "value";
            }

            Object jsonValue = this.getAttributeValue(entityAttributes.get(attr));
            if (!(jsonValue == null)) {
                fullObject.put(attr, jsonValue);
            }
        }
        return fullObject;
    }

    public HashMap<String, Object> transform() {
        getAllEntityContainsglobalId();
        getSeparateEntity();
        getSeparateRelationship();
        getRootObjects();

        HashMap<String, Object> map = new HashMap<>();
        map.put("type", "ifcJSON");
        map.put("organization", "sikongsphere");
        map.put("version", "ifctools-0.1.0-beta");
        map.put("data", this.jsonObjects);

        return map;
    }
}
