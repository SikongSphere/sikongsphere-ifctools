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
package org.sikongsphere.ifc.model.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;

/**
 * Any object, or any aid to define, organize and annotate an object,
 * that relates to a geometric or spatial context.
 * Subtypes of IfcProduct usually hold a shape representation
 * and a local placement within the project structure.
 *
 * @author stan
 * @date 2022/09/01 22:56
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcProduct extends IfcObject {
    private IfcObjectPlacement objectPlacement;
    private IfcProductRepresentation representation;

    // private SET<IfcRelAssignsToProduct> referencedBy;

    public IfcProduct() {}

    public IfcProduct(IfcObjectPlacement objectPlacement, IfcProductRepresentation representation) {
        this.objectPlacement = objectPlacement;
        this.representation = representation;
    }

    @IfcParserConstructor
    public IfcProduct(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation
    ) {
        super(globalId, ownerHistory, name, description, objectType);
        this.objectPlacement = objectPlacement;
        this.representation = representation;
    }

    public IfcObjectPlacement getObjectPlacement() {
        return objectPlacement;
    }

    public void setObjectPlacement(IfcObjectPlacement objectPlacement) {
        this.objectPlacement = objectPlacement;
    }

    public IfcProductRepresentation getRepresentation() {
        return representation;
    }

    public void setRepresentation(IfcProductRepresentation representation) {
        this.representation = representation;
    }

    // public SET<IfcRelAssignsToProduct> getReferencedBy() {
    // return referencedBy;
    // }
    //
    // public void setReferencedBy(SET<IfcRelAssignsToProduct> referencedBy) {
    // this.referencedBy = referencedBy;
    // }
}
