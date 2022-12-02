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
package org.sikongsphere.ifc.newModel.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.basic.SET;
import org.sikongsphere.ifc.newModel.resource.material.entity.IfcMaterial;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcText;

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
        SET<IfcRepresentation> representations,
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
}
