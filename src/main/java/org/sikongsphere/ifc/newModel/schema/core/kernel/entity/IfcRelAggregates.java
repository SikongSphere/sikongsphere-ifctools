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
package org.sikongsphere.ifc.newModel.schema.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;

import java.util.*;

/**
 * IfcRelAggregates
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRelAggregates extends IfcRelDecomposes {
    public IfcRelAggregates() {}

    @IfcParserConstructor
    public IfcRelAggregates(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcObjectDefinition relatingObject,
        SET<IfcObjectDefinition> relatedObjects
    ) {
        super(globalId, ownerHistory, name, description, relatingObject, relatedObjects);
    }

    @Override
    public String toString() {

        Iterator<IfcObjectDefinition> iterator = getRelatedObjects().getObjects().iterator();
        ArrayList<Integer> list = new ArrayList<>();

        while (iterator.hasNext()) {
            IfcAbstractClass element = iterator.next();
            list.add(element.getStepNumber());
        }

        list.sort(Comparator.comparingInt(x -> x));
        LIST<String> strings = new LIST<>();

        list.forEach(x -> strings.add(StringConstant.WELL + x));

        String format = String.format(
            "#%s=%s(%s,%s,%s,%s,%s,%s);",
            this.stepNumber,
            this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            getGlobalId(),
            StringConstant.WELL + getOwnerHistory().getStepNumber(),
            Optional.ofNullable(getName())
                .map(x -> getName().toString())
                .orElse(StringConstant.DOLLAR),
            Optional.ofNullable(getDescription())
                .map(x -> getDescription().toString())
                .orElse(StringConstant.DOLLAR),
            StringConstant.WELL + getRelatingObject().getStepNumber(),
            strings
        );

        return format;
    }
}
