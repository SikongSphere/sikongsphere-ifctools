package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcRelConnects;

/**
 * This objectified relationship, IfcRelContainedInSpatialStructure,
 * is used to assign elements to a certain level of the spatial project structure.
 * Any element can only be assigned once to a certain level of the spatial structure.
 *
 * @author stan
 * @date 2022/09/02 13:38
 */
public class IfcRelContainedInSpatialStructure extends IfcRelConnects {
    private SET<IfcProduct> relatedElements;
    private IfcSpatialStructureElement relatingStructure;

    public IfcRelContainedInSpatialStructure() {
    }

    public IfcRelContainedInSpatialStructure(SET<IfcProduct> relatedElements, IfcSpatialStructureElement relatingStructure) {
        this.relatedElements = relatedElements;
        this.relatingStructure = relatingStructure;
    }

    public SET<IfcProduct> getRelatedElements() {
        return relatedElements;
    }

    public void setRelatedElements(SET<IfcProduct> relatedElements) {
        this.relatedElements = relatedElements;
    }

    public IfcSpatialStructureElement getRelatingStructure() {
        return relatingStructure;
    }

    public void setRelatingStructure(IfcSpatialStructureElement relatingStructure) {
        this.relatingStructure = relatingStructure;
    }
}
