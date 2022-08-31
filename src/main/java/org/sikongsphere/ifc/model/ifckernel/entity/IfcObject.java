package org.sikongsphere.ifc.model.ifckernel.entity;

import org.sikongsphere.ifc.model.basic.IfcLabel;
import org.sikongsphere.ifc.model.basic.SET;

/**
 * IfcObject
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
public abstract class IfcObject extends IfcObjectDefinition {
    private IfcLabel objectType;
    private SET<IfcRelDefines> isDefinedBy;
}
