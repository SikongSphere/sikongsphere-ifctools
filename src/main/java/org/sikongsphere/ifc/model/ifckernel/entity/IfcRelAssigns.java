package org.sikongsphere.ifc.model.ifckernel.entity;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.ifckernel.enumeration.IfcObjectTypeEnum;

/**
 * IfcRelAssigns
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
public abstract class IfcRelAssigns extends IfcRelationship {
    private SET<IfcObjectDefinition> relatedObjects;
    private IfcObjectTypeEnum relatedObjectsType;
}
