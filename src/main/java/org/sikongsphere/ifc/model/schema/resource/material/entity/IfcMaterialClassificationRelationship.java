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
package org.sikongsphere.ifc.model.schema.resource.material.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.externalreference.selectType.IfcClassificationNotationSelect;

/**
 * Relationship assigning classifications to materials.
 *
 * @author Gao Su
 * @date 2022/10/14 22:24
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMaterialClassificationRelationship extends IfcAbstractClass {

    private SET<IfcClassificationNotationSelect> materialClassifications;

    private IfcMaterial classifiedMaterial;

    public IfcMaterialClassificationRelationship() {}

    @IfcParserConstructor
    public IfcMaterialClassificationRelationship(
        SET<IfcClassificationNotationSelect> materialClassifications,
        IfcMaterial classifiedMaterial
    ) {
        this.materialClassifications = materialClassifications;
        this.classifiedMaterial = classifiedMaterial;
    }

    public SET<IfcClassificationNotationSelect> getMaterialClassifications() {
        return materialClassifications;
    }

    public void setMaterialClassifications(
        SET<IfcClassificationNotationSelect> materialClassifications
    ) {
        this.materialClassifications = materialClassifications;
    }

    public IfcMaterial getClassifiedMaterial() {
        return classifiedMaterial;
    }

    public void setClassifiedMaterial(IfcMaterial classifiedMaterial) {
        this.classifiedMaterial = classifiedMaterial;
    }
}
