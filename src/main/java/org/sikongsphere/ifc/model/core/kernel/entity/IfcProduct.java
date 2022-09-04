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

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.resource.representation.entity.IfcProductRepresentation;

/**
 * Any object, or any aid to define, organize and annotate an object,
 * that relates to a geometric or spatial context.
 * Subtypes of IfcProduct usually hold a shape representation
 * and a local placement within the project structure.
 *
 * @author stan
 * @date 2022/09/01 22:56
 */
public class IfcProduct extends IfcObject {
    private IfcObjectPlacement objectPlacement;
    private IfcProductRepresentation representation;

    private SET<IfcRelAssignsToProduct> referencedBy;

    public IfcProduct() {}

    public IfcProduct(
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        SET<IfcRelAssignsToProduct> referencedBy
    ) {
        this.objectPlacement = objectPlacement;
        this.representation = representation;
        this.referencedBy = referencedBy;
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

    public SET<IfcRelAssignsToProduct> getReferencedBy() {
        return referencedBy;
    }

    public void setReferencedBy(SET<IfcRelAssignsToProduct> referencedBy) {
        this.referencedBy = referencedBy;
    }
}
