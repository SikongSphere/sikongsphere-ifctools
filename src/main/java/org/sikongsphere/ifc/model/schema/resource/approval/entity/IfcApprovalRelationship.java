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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcApprovalRelationship extends IfcAbstractClass {
    private IfcApproval relatedApproval;
    private IfcApproval relatingApproval;
    @IfcOptionField
    private IfcText description;
    private IfcLabel name;

    @IfcParserConstructor
    public IfcApprovalRelationship(
        IfcApproval relatedApproval,
        IfcApproval relatingApproval,
        IfcText description,
        IfcLabel name
    ) {
        this.relatedApproval = relatedApproval;
        this.relatingApproval = relatingApproval;
        this.description = description;
        this.name = name;
    }

    public IfcApproval getRelatedApproval() {
        return relatedApproval;
    }

    public void setRelatedApproval(IfcApproval relatedApproval) {
        this.relatedApproval = relatedApproval;
    }

    public IfcApproval getRelatingApproval() {
        return relatingApproval;
    }

    public void setRelatingApproval(IfcApproval relatingApproval) {
        this.relatingApproval = relatingApproval;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }
}
