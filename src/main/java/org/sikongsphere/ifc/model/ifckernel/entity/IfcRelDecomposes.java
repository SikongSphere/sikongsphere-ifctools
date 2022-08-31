package org.sikongsphere.ifc.model.ifckernel.entity;

import org.sikongsphere.ifc.model.basic.SET;

/**
 * IfcRelDecomposes
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
public abstract class IfcRelDecomposes extends IfcRelationship {
    private IfcObjectDefinition relatingObject;
    private SET<IfcObjectDefinition> relatedObjects;
}
