/*
 * Copyright 2022 SikongSphere
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
*/
package org.sikongsphere.ifc.model.schema.resource.approval.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.property.entity.IfcProperty;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcApprovalPropertyRelationship extends IfcAbstractClass {
    private SET<IfcProperty> approvedProperties;
    private IfcApproval approval;

    @IfcParserConstructor
    public IfcApprovalPropertyRelationship(
        SET<IfcProperty> approvedProperties,
        IfcApproval approval
    ) {
        this.approvedProperties = approvedProperties;
        this.approval = approval;
    }

    public SET<IfcProperty> getApprovedProperties() {
        return approvedProperties;
    }

    public void setApprovedProperties(SET<IfcProperty> approvedProperties) {
        this.approvedProperties = approvedProperties;
    }

    public IfcApproval getApproval() {
        return approval;
    }

    public void setApproval(IfcApproval approval) {
        this.approval = approval;
    }
}
