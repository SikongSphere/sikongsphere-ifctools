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
import org.sikongsphere.ifc.model.datatype.LOGICAL;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * @author Wang Bohong
 * @date 2022/10/25 13:30
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcShapeAspect extends IfcAbstractClass {
    private LIST<IfcShapeModel> shapeRepresentations;
    private IfcLabel name;
    private IfcText description;
    private LOGICAL productDefinitional;
    private IfcProductDefinitionShape partOfProductDefinitionShape;

    public IfcShapeAspect() {}

    @IfcParserConstructor
    public IfcShapeAspect(
        LIST<IfcShapeModel> shapeRepresentations,
        IfcLabel name,
        IfcText description,
        LOGICAL productDefinitional,
        IfcProductDefinitionShape partOfProductDefinitionShape
    ) {
        this.shapeRepresentations = shapeRepresentations;
        this.name = name;
        this.description = description;
        this.productDefinitional = productDefinitional;
        this.partOfProductDefinitionShape = partOfProductDefinitionShape;
    }

    public LIST<IfcShapeModel> getShapeRepresentations() {
        return shapeRepresentations;
    }

    public void setShapeRepresentations(LIST<IfcShapeModel> shapeRepresentations) {
        this.shapeRepresentations = shapeRepresentations;
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

    public LOGICAL getProductDefinitional() {
        return productDefinitional;
    }

    public void setProductDefinitional(LOGICAL productDefinitional) {
        this.productDefinitional = productDefinitional;
    }

    public IfcProductDefinitionShape getPartOfProductDefinitionShape() {
        return partOfProductDefinitionShape;
    }

    public void setPartOfProductDefinitionShape(
        IfcProductDefinitionShape partOfProductDefinitionShape
    ) {
        this.partOfProductDefinitionShape = partOfProductDefinitionShape;
    }
}
