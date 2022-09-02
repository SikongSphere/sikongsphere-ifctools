package org.sikongsphere.ifc.model.core.kernel.entity;

/**
 * This objectified relationship IfcRelAssignsToProduct handles the assignment of objects (subtypes of IfcObject)
 * to a product (subtypes of IfcProduct).
 *
 * @author stan
 * @date 2022/09/02 13:33
 */
public class IfcRelAssignsToProduct extends IfcRelAssigns{
    private IfcProduct relatingProduct;

    public IfcRelAssignsToProduct() {
    }

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
