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
package org.sikongsphere.ifc.newModel.schema.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;

import java.util.List;
import java.util.Locale;
import java.util.Set;

/**
 * @author Wang Bohong
 * @date 2022/10/21 11:52
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcShapeRepresentation extends IfcShapeModel {
    public IfcShapeRepresentation() {}

    @IfcParserConstructor
    public IfcShapeRepresentation(
        IfcRepresentationContext contextContextOfItems,
        IfcLabel representationIdentifier,
        IfcLabel representationType,
        SET<IfcRepresentationItem> items
    ) {
        super(contextContextOfItems, representationIdentifier, representationType, items);
    }

    @Override
    public String toIfc() {

        String format = String.format("#%s=%s(%s,%s,%s,%s)",
                this.stepNumber,
                this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
                StringConstant.WELL + getContextContextOfItems().getStepNumber(),
                getRepresentationIdentifier(),
                getRepresentationType(),
                getItems()
        );

        return format;
    }
}
