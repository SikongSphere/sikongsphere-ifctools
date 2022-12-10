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
package org.sikongsphere.ifc.model.schema.resource.constraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.property.entity.IfcProperty;

/**
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPropertyConstraintRelationship extends IfcAbstractClass {
    private IfcConstraint relatingConstraint;
    private SET<IfcProperty> relatedProperties;
    @IfcOptionField
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;

    @IfcParserConstructor
    public IfcPropertyConstraintRelationship(
        IfcConstraint relatingConstraint,
        SET<IfcProperty> relatedProperties,
        IfcLabel name,
        IfcText description
    ) {
        this.relatingConstraint = relatingConstraint;
        this.relatedProperties = relatedProperties;
        this.name = name;
        this.description = description;
    }

    public IfcConstraint getRelatingConstraint() {
        return relatingConstraint;
    }

    public void setRelatingConstraint(IfcConstraint relatingConstraint) {
        this.relatingConstraint = relatingConstraint;
    }

    public SET<IfcProperty> getRelatedProperties() {
        return relatedProperties;
    }

    public void setRelatedProperties(SET<IfcProperty> relatedProperties) {
        this.relatedProperties = relatedProperties;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }
}
