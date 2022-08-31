package org.sikongsphere.ifc.model.ifckernel.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.IfcLabel;
import org.sikongsphere.ifc.model.basic.IfcText;
import org.sikongsphere.ifc.model.ifcutilityresource.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.ifcutilityresource.entity.IfcOwnerHistory;

/**
 * IfcRoot
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
public abstract class IfcRoot extends IfcNonLeafNode {
    private IfcGloballyUniqueId globalId;
    private IfcOwnerHistory ownerHistory;
    private IfcLabel name;
    private IfcText description;
}
