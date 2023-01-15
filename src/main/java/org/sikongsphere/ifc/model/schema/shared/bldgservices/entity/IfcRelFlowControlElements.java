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
package org.sikongsphere.ifc.model.schema.shared.bldgservices.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * Objectified relationship between a distribution flow element and one-to-many control elements.
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENTITY)
public class IfcRelFlowControlElements extends IfcRelConnects {
    private SET<IfcDistributionControlElement> relatedControlElements;
    private IfcDistributionFlowElement relatingFlowElement;

    @IfcParserConstructor
    public IfcRelFlowControlElements(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        SET<IfcDistributionControlElement> relatedControlElements,
        IfcDistributionFlowElement relatingFlowElement
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatedControlElements = relatedControlElements;
        this.relatingFlowElement = relatingFlowElement;
    }

    public SET<IfcDistributionControlElement> getRelatedControlElements() {
        return relatedControlElements;
    }

    public void setRelatedControlElements(
        SET<IfcDistributionControlElement> relatedControlElements
    ) {
        this.relatedControlElements = relatedControlElements;
    }

    public IfcDistributionFlowElement getRelatingFlowElement() {
        return relatingFlowElement;
    }

    public void setRelatingFlowElement(IfcDistributionFlowElement relatingFlowElement) {
        this.relatingFlowElement = relatingFlowElement;
    }
}
