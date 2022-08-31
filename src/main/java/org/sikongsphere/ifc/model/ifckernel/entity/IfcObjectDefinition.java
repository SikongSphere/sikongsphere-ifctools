package org.sikongsphere.ifc.model.ifckernel.entity;

import org.sikongsphere.ifc.model.basic.SET;

/**
 * IfcObjectDefinition
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
public abstract class IfcObjectDefinition extends IfcRoot {
    private SET<IfcRelAssigns> hasAssignments;
    private SET<IfcRelDecomposes> isDecomposedBy;
    private SET<IfcRelDecomposes> decomposes;
    private SET<IfcRelAssociates> hasAssociations;
}
