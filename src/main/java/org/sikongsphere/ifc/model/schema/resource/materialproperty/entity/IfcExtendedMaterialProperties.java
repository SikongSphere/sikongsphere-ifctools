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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.material.entity.IfcMaterial;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.property.entity.IfcProperty;

/**
 * A container class for user defined properties of associated material.
 *
 * @author:stan
 * @date:2023/1/10 23:17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcExtendedMaterialProperties extends IfcMaterialProperties {

    private SET<IfcProperty> extendedProperties;

    @IfcOptionField
    private IfcText description;

    private IfcLabel name;

    public IfcExtendedMaterialProperties(
        IfcMaterial material,
        SET<IfcProperty> extendedProperties,
        IfcText description,
        IfcLabel name
    ) {
        super(material);
        this.extendedProperties = extendedProperties;
        this.description = description;
        this.name = name;
    }

    public SET<IfcProperty> getExtendedProperties() {
        return extendedProperties;
    }

    public void setExtendedProperties(SET<IfcProperty> extendedProperties) {
        this.extendedProperties = extendedProperties;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }
}
