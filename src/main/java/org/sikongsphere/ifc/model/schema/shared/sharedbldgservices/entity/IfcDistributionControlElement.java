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
package org.sikongsphere.ifc.model.schema.shared.sharedbldgservices.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcDistributionElement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENTITY)
public class IfcDistributionControlElement extends IfcDistributionElement {
    private IfcIdentifier controlElmentId;
    @IfcInverseParameter
    private SET<IfcRelFlowControlElements> assignedToFlowElement;

    @IfcParserConstructor
    public IfcDistributionControlElement(IfcIdentifier controlElmentId) {
        this.controlElmentId = controlElmentId;
    }

    public IfcIdentifier getControlElmentId() {
        return controlElmentId;
    }

    public void setControlElmentId(IfcIdentifier controlElmentId) {
        this.controlElmentId = controlElmentId;
    }

    public SET<IfcRelFlowControlElements> getAssignedToFlowElement() {
        return assignedToFlowElement;
    }

    public void setAssignedToFlowElement(SET<IfcRelFlowControlElements> assignedToFlowElement) {
        this.assignedToFlowElement = assignedToFlowElement;
    }
}
