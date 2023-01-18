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
package org.sikongsphere.ifc.model.schema.resource.materialproperty.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.material.entity.IfcMaterial;

/**
 *  Abstract supertype of all container classes with material properties, both those defined in IFC
 *  specification and those defined by users as extended material properties.
 *
 * @author:stan
 * @date:2023/1/10 21:23
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcMaterialProperties extends IfcAbstractClass {

    private IfcMaterial material;

    @IfcParserConstructor
    public IfcMaterialProperties(IfcMaterial material) {
        this.material = material;
    }

    public IfcMaterial getMaterial() {
        return material;
    }

    public void setMaterial(IfcMaterial material) {
        this.material = material;
    }
}
