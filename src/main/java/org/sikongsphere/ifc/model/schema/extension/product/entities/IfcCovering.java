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
package org.sikongsphere.ifc.model.schema.extension.product.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcCoveringTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author GaoSu
 * @date 2022/11/01 22:49
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcCovering extends IfcBuildingElement {
    private IfcCoveringTypeEnum predefinedType;

    @IfcInverseParameter
    private SET<IfcRelCoversSpaces> coversSpaces;
    @IfcInverseParameter
    private SET<IfcRelCoversBldgElements> covers;

    @IfcParserConstructor
    public IfcCovering(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcCoveringTypeEnum predefinedType
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            tag
        );
        this.predefinedType = predefinedType;
    }

    public IfcCoveringTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcCoveringTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public SET<IfcRelCoversSpaces> getCoversSpaces() {
        return coversSpaces;
    }

    public void setCoversSpaces(SET<IfcRelCoversSpaces> coversSpaces) {
        this.coversSpaces = coversSpaces;
    }

    public SET<IfcRelCoversBldgElements> getCovers() {
        return covers;
    }

    public void setCovers(SET<IfcRelCoversBldgElements> covers) {
        this.covers = covers;
    }
}
