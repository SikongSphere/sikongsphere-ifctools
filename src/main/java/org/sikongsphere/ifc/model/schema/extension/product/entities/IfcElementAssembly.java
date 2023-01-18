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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcAssemblyPlaceEnum;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcElementAssemblyTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcElementAssembly extends IfcElement {
    @IfcOptionField
    private IfcAssemblyPlaceEnum assemblyPlace;
    private IfcElementAssemblyTypeEnum predefinedType;

    @IfcParserConstructor
    public IfcElementAssembly(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcAssemblyPlaceEnum assemblyPlace,
        IfcElementAssemblyTypeEnum predefinedType
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
        this.assemblyPlace = assemblyPlace;
        this.predefinedType = predefinedType;
    }

    public IfcAssemblyPlaceEnum getAssemblyPlace() {
        return assemblyPlace;
    }

    public void setAssemblyPlace(IfcAssemblyPlaceEnum assemblyPlace) {
        this.assemblyPlace = assemblyPlace;
    }

    public IfcElementAssemblyTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcElementAssemblyTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
