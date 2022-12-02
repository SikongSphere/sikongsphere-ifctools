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
package org.sikongsphere.ifc.newModel.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This objectified relationship IfcRelAssignsToProduct handles the assignment of objects (subtypes of IfcObject)
 * to a product (subtypes of IfcProduct).
 *
 * @author stan
 * @date 2022/09/02 13:33
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelAssignsToProduct extends IfcRelAssigns {
    private IfcProduct relatingProduct;

    public IfcRelAssignsToProduct() {}

    public IfcRelAssignsToProduct(IfcProduct relatingProduct) {
        this.relatingProduct = relatingProduct;
    }

    public IfcProduct getRelatingProduct() {
        return relatingProduct;
    }

    public void setRelatingProduct(IfcProduct relatingProduct) {
        this.relatingProduct = relatingProduct;
    }
}
