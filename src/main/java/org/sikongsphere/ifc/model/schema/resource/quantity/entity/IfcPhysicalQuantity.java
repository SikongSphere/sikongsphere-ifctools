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
package org.sikongsphere.ifc.model.schema.resource.quantity.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * The physical quantity, IfcPhysicalQuantity, is an abstract entity that holds a complex or simple quantity measure
 * together with a semantic definition of the usage for the single or several measure value.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:29
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public abstract class IfcPhysicalQuantity extends IfcAbstractClass {
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;

    @IfcInverseParameter
    private SET<IfcPhysicalComplexQuantity> partOfcComplex;

    @IfcParserConstructor
    public IfcPhysicalQuantity(IfcLabel name, IfcText description) {
        this.name = name;
        this.description = description;
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

    public SET<IfcPhysicalComplexQuantity> getPartOfcComplex() {
        return partOfcComplex;
    }

    public void setPartOfcComplex(SET<IfcPhysicalComplexQuantity> partOfcComplex) {
        this.partOfcComplex = partOfcComplex;
    }
}
