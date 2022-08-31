package org.sikongsphere.ifc.model.ifcmeasureresource.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.INTEGER;

/**
 * This class is used to encapsulate derived unit element information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public class IfcDerivedUnitElement extends IfcNonLeafNode {
    private IfcNamedUnit unit;
    private INTEGER exponent;
}
