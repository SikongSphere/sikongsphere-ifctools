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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.material.entity.IfcMaterial;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * @author zhongqi
 * @date 2022/10/26
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMaterialDefinitionRepresentation extends IfcProductRepresentation {
    private IfcMaterial representedMaterial;

    public IfcMaterialDefinitionRepresentation() {}

    @IfcParserConstructor
    public IfcMaterialDefinitionRepresentation(
        IfcLabel name,
        IfcText description,
        LIST<IfcRepresentation> representations,
        IfcMaterial representedMaterial
    ) {
        super(name, description, representations);
        this.representedMaterial = representedMaterial;
    }

    public IfcMaterial getRepresentedMaterial() {
        return representedMaterial;
    }

    public void setRepresentedMaterial(IfcMaterial representedMaterial) {
        this.representedMaterial = representedMaterial;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
