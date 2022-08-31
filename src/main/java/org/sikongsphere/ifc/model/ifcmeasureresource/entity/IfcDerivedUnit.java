package org.sikongsphere.ifc.model.ifcmeasureresource.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.IfcLabel;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.ifcmeasureresource.enumeration.IfcDerivedUnitEnum;

/**
 * This class is used to encapsulate derived unit information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public class IfcDerivedUnit extends IfcNonLeafNode {
    private SET<IfcDerivedUnitElement> elements;
    private IfcDerivedUnitEnum unitType;
    private IfcLabel userDefinedType;

    public IfcDerivedUnit(SET<IfcDerivedUnitElement> elements, IfcDerivedUnitEnum unitType) {
        this.elements = elements;
        this.unitType = unitType;
    }

    public IfcDerivedUnit(SET<IfcDerivedUnitElement> elements, IfcDerivedUnitEnum unitType, IfcLabel userDefinedType) {
        this.elements = elements;
        this.unitType = unitType;
        this.userDefinedType = userDefinedType;
    }

    /** TODO
     * DERIVE
     * Dimensions	 : 	IfcDimensionalExponents :=  IfcDeriveDimensionalExponents(SELF);
     */

    public SET<IfcDerivedUnitElement> getElements() {
        return elements;
    }

    public void setElements(SET<IfcDerivedUnitElement> elements) {
        this.elements = elements;
    }

    public IfcDerivedUnitEnum getUnitType() {
        return unitType;
    }

    public void setUnitType(IfcDerivedUnitEnum unitType) {
        this.unitType = unitType;
    }

    public IfcLabel getUserDefinedType() {
        return userDefinedType;
    }

    public void setUserDefinedType(IfcLabel userDefinedType) {
        this.userDefinedType = userDefinedType;
    }
}
