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

import org.sikongsphere.ifc.common.algorithm.GlobalUniqueID;
import org.sikongsphere.ifc.common.environment.ConfigProvider;
import org.sikongsphere.ifc.io.constant.MetaConstant;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.IfcInterface;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelationship;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRoot;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcSIUnit;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcGeometricRepresentationContext;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcShapeRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

import java.util.*;

import static org.sikongsphere.ifc.io.converter.ConvertUtils.*;

/**
 * @author:stan
 * @date:2023/2/5 10:01
 */
public class IfcToJson {

    private ArrayList<Object> jsonObjects = new ArrayList<>();
    private ArrayList<IfcAbstractClass> relationShips = new ArrayList<>();
    private LinkedHashMap<Integer, Object> rootObjects = new LinkedHashMap<>();
    private IfcFileModel ifcFileModel;

    public IfcToJson(IfcFileModel ifcFileModel) {
        this.ifcFileModel = ifcFileModel;
    }

    private void getAllEntityContainsglobalId() {
        ConvertUtils.getAllChildNodesFrom(this.ifcFileModel, IfcRoot.class).forEach(x -> {
            if (isBelongTo(x, IfcRelationship.class)) this.relationShips.add(x);
            else {
                IfcRoot entity = (IfcRoot) x;
                this.rootObjects.put(
                    x.getStepNumber(),
                    GlobalUniqueID.split(GlobalUniqueID.expand(entity.getGlobalId().getValue()))
                );
            }
        });
    }

    private void getSeparateEntity() {
        ConvertUtils.getAllChildNodesFrom(this.ifcFileModel, IfcShapeRepresentation.class)
            .forEach(
                x -> { this.rootObjects.put(x.getStepNumber(), UUID.randomUUID().toString()); }
            );
        ConvertUtils.getAllChildNodesFrom(this.ifcFileModel, IfcOwnerHistory.class)
            .forEach(
                x -> { this.rootObjects.put(x.getStepNumber(), UUID.randomUUID().toString()); }
            );
        ConvertUtils.getAllChildNodesFrom(
            this.ifcFileModel,
            IfcGeometricRepresentationContext.class
        ).forEach(x -> { this.rootObjects.put(x.getStepNumber(), UUID.randomUUID().toString()); });
    }

    private void getSeparateRelationship() {
        this.relationShips.forEach(x -> {
            IfcRelationship entity = (IfcRelationship) x;
            String split = GlobalUniqueID.split(
                GlobalUniqueID.expand(entity.getGlobalId().getValue())
            );
            this.rootObjects.put(entity.getStepNumber(), split);
        });
    }

    private void getRootObjects() {
        this.rootObjects.forEach((key, value) -> {
            IfcAbstractClass entity = ConvertUtils.getEntityByStepNumber(this.ifcFileModel, key);
            LinkedHashMap<Object, Object> entityAttributes = ConvertUtils.jsonifyEntity(entity);

            entityAttributes.put(
                MetaConstant.GLOBAL_ID,
                this.rootObjects.get(entity.getStepNumber())
            );
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

        if (value == null | value == MetaConstant.BLANK) {
            jsonValue = null;
        } else if (value instanceof IfcAbstractClass) {
            IfcAbstractClass entity = (IfcAbstractClass) value;
            LinkedHashMap<Object, Object> entityAttributes = jsonifyEntity(entity);

            // ToDo remove empty properties

            if (isBelongTo(entity, IfcSIUnit.class)) {
                entityAttributes.put(MetaConstant.DIM, getDimensionsForSiUnit(entity));
            }

            if (this.rootObjects.containsKey(entity.getStepNumber())) {
                entityAttributes.put(
                    MetaConstant.GLOBAL_ID,
                    this.rootObjects.get(entity.getStepNumber())
                );
                return ConvertUtils.createReferencedObject(entityAttributes);
            } else {
                if (entityAttributes.containsKey(MetaConstant.GLOBAL_ID)) {
                    IfcRoot ifcRoot = (IfcRoot) entity;
                    entityAttributes.put(
                        MetaConstant.GLOBAL_ID,
                        GlobalUniqueID.split(
                            GlobalUniqueID.expand(ifcRoot.getGlobalId().getValue())
                        )
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
    public LinkedHashMap<Object, Object> createFullObject(
        LinkedHashMap<Object, Object> entityAttributes
    ) {
        LinkedHashMap<Object, Object> fullObject = new LinkedHashMap<>();
        for (Object attr : entityAttributes.keySet()) {

            if (attr.equals(MetaConstant.ID)) {
                continue;
            }

            if (attr.equals(MetaConstant.WRAPPED_VALUE)) {
                attr = MetaConstant.VALUE;
            }

            Object jsonValue = this.getAttributeValue(entityAttributes.get(attr));
            if (!(jsonValue == null)) {
                fullObject.put(attr, jsonValue);
            }
        }
        return fullObject;
    }

    public LinkedHashMap<String, Object> transform(IfcFileModel ifcFileModel) {
        getAllEntityContainsglobalId();
        getSeparateEntity();
        getSeparateRelationship();
        getRootObjects();

        LIST list = (LIST) ifcFileModel.getHeader().getFileSchema().getParams().get(0);
        LIST o = (LIST) list.getObjects().get(0);
        STRING value = (STRING) o.getObjects().get(0);

        LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
        map.put(MetaConstant.TYPE, MetaConstant.IFC_TOOLS_NAME);
        map.put(MetaConstant.ORG, MetaConstant.ORG_NAME);
        map.put(MetaConstant.SCHEMA_IDENTIFIER, value.getValue());
        map.put(MetaConstant.VERSION, ConfigProvider.getVersion());
        map.put(
            MetaConstant.ORIGINATING_SYSTEM,
            MetaConstant.PROCESSOR_SYSTEM + ConfigProvider.getVersion()
        );
        map.put(MetaConstant.PREPROCESSOR_VERSION, MetaConstant.PROCESSOR_NAME);
        map.put(MetaConstant.TIME_STAMP, ConfigProvider.getUTCTime());
        map.put(MetaConstant.DATA, this.jsonObjects);

        return map;
    }
}
