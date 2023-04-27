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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * A product definition shape identifies a product’s shape as the conceptual idea of the form of a product.
 * @author Wang Bohong
 * @date 2022/10/21 12:32
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcProductDefinitionShape extends IfcProductRepresentation {

    @IfcInverseParameter
    private SET<IfcProduct> shapeOfProduct;

    @IfcInverseParameter
    private SET<IfcShapeAspect> hasShapeAspects;

    @IfcParserConstructor
    public IfcProductDefinitionShape(
        IfcLabel name,
        IfcText description,
        LIST<IfcRepresentation> representations
    ) {
        super(name, description, representations);
    }

    public IfcProductDefinitionShape() {super();}

    public SET<IfcProduct> getShapeOfProduct() {
        return shapeOfProduct;
    }

    public void setShapeOfProduct(SET<IfcProduct> shapeOfProduct) {
        this.shapeOfProduct = shapeOfProduct;
    }

    public SET<IfcShapeAspect> getHasShapeAspects() {
        return hasShapeAspects;
    }

    public void setHasShapeAspects(SET<IfcShapeAspect> hasShapeAspects) {
        this.hasShapeAspects = hasShapeAspects;
    }
}
