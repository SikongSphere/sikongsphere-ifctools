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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.material.selectType.IfcMaterialSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcMaterialDefinitionRepresentation;

/**
 * A homogenious substance that can be used to form elements.
 *
 * @author Gao Su
 * @date 2022/10/14 22:24
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMaterial extends IfcAbstractClass
    implements
        IfcMaterialSelect,
        IfcObjectReferenceSelect {

    private IfcLabel name;
    @IfcInverseParameter
    private SET<IfcMaterialDefinitionRepresentation> hasRepresentation;
    @IfcInverseParameter
    private SET<IfcMaterialClassificationRelationship> classifiedAs;

    public IfcMaterial() {}

    @IfcParserConstructor
    public IfcMaterial(IfcLabel name) {
        this.name = name;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public SET<IfcMaterialDefinitionRepresentation> getHasRepresentation() {
        return hasRepresentation;
    }

    public void setHasRepresentation(SET<IfcMaterialDefinitionRepresentation> hasRepresentation) {
        this.hasRepresentation = hasRepresentation;
    }

    public SET<IfcMaterialClassificationRelationship> getClassifiedAs() {
        return classifiedAs;
    }

    public void setClassifiedAs(SET<IfcMaterialClassificationRelationship> classifiedAs) {
        this.classifiedAs = classifiedAs;
    }
}
