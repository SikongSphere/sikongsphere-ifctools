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
package org.sikongsphere.ifc.newModel.schema.resource.material.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.material.select_type.IfcMaterialSelect;

/**
 * A list of the different materials that are used in an element.
 * @author Wang Bohong
 * @date 2022/10/25 11:50
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcMaterialList extends IfcAbstractClass implements IfcMaterialSelect {
    private LIST<IfcMaterial> materials;

    public IfcMaterialList() {}

    @IfcParserConstructor
    public IfcMaterialList(LIST<IfcMaterial> materials) {
        this.materials = materials;
    }

    public LIST<IfcMaterial> getMaterials() {
        return materials;
    }

    public void setMaterials(LIST<IfcMaterial> materials) {
        this.materials = materials;
    }
}
