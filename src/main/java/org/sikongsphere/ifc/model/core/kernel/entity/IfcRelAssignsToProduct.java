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
package org.sikongsphere.ifc.model.core.kernel.entity;

/**
 * This objectified relationship IfcRelAssignsToProduct handles the assignment of objects (subtypes of IfcObject)
 * to a product (subtypes of IfcProduct).
 *
 * @author stan
 * @date 2022/09/02 13:33
 */
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
