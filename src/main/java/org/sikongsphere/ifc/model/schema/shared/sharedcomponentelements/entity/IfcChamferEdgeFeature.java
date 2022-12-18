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
package org.sikongsphere.ifc.model.schema.shared.sharedcomponentelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * An edge feature with a chamfered cross section shape.
 * @author Kuang Tianyu
 * @date 2022/12/18 16:47
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcChamferEdgeFeature extends IfcEdgeFeature {
    @IfcOptionField
    private IfcPositiveLengthMeasure width;
    @IfcOptionField
    private IfcPositiveLengthMeasure height;

    @IfcParserConstructor
    public IfcChamferEdgeFeature(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcPositiveLengthMeasure featureLength,
        IfcPositiveLengthMeasure width,
        IfcPositiveLengthMeasure height
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            tag,
            featureLength
        );
        this.width = width;
        this.height = height;
    }

    public IfcPositiveLengthMeasure getWidth() {
        return width;
    }

    public void setWidth(IfcPositiveLengthMeasure width) {
        this.width = width;
    }

    public IfcPositiveLengthMeasure getHeight() {
        return height;
    }

    public void setHeight(IfcPositiveLengthMeasure height) {
        this.height = height;
    }
}
