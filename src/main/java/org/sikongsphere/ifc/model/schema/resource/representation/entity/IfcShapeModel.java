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
package org.sikongsphere.ifc.model.schema.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * The IfcShapeModel represents the concept of a particular geometric and/or topological representation of a product's shape or a product component's shape within a representation context.
 * @author Wang Bohong
 * @date 2022/10/21 11:49
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public abstract class IfcShapeModel extends IfcRepresentation {

    @IfcInverseParameter
    private SET<IfcShapeAspect> ofShapeAspect;

    public IfcShapeModel() {}

    @IfcParserConstructor
    public IfcShapeModel(
        IfcRepresentationContext contextContextOfItems,
        IfcLabel representationIdentifier,
        IfcLabel representationType,
        SET<IfcRepresentationItem> items
    ) {
        super(contextContextOfItems, representationIdentifier, representationType, items);
    }

    public SET<IfcShapeAspect> getOfShapeAspect() {
        return ofShapeAspect;
    }

    public void setOfShapeAspect(SET<IfcShapeAspect> ofShapeAspect) {
        this.ofShapeAspect = ofShapeAspect;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
