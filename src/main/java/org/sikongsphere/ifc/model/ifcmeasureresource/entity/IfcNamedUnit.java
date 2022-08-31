package org.sikongsphere.ifc.model.ifcmeasureresource.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.ifcmeasureresource.enumeration.IfcUnitEnum;

/**
 * This class is used to encapsulate named unit information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public abstract class IfcNamedUnit extends IfcNonLeafNode {
    protected IfcDimensionalExponents dimensions;
    protected IfcUnitEnum unitType;
}
