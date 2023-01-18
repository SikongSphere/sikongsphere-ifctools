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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * An IfcApproval represents information about approval processes for a plan, a design, a proposal, a change order, etc, in a construction or facilities management project. IfcApproval is referenced by IfcRelAssociatesApproval in IfcControlExtension schema, and thereby can be related to all subtypes of IfcRoot.
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcApproval extends IfcAbstractClass {
    @IfcOptionField
    private IfcText description;
    private IfcDateTimeSelect approvalDateTime;
    @IfcOptionField
    private IfcLabel approvalStatus;
    @IfcOptionField
    private IfcLabel approvalLevel;
    @IfcOptionField
    private IfcText approvalQualifier;
    private IfcLabel name;
    private IfcIdentifier identifier;

    @IfcInverseParameter
    private SET<IfcApprovalActorRelationship> actors;
    @IfcInverseParameter
    private SET<IfcApprovalRelationship> isRelatedWith;
    @IfcInverseParameter
    private SET<IfcApprovalRelationship> relates;

    @IfcParserConstructor
    public IfcApproval(
        IfcText description,
        IfcDateTimeSelect approvalDateTime,
        IfcLabel approvalStatus,
        IfcLabel approvalLevel,
        IfcText approvalQualifier,
        IfcLabel name,
        IfcIdentifier identifier
    ) {
        this.description = description;
        this.approvalDateTime = approvalDateTime;
        this.approvalStatus = approvalStatus;
        this.approvalLevel = approvalLevel;
        this.approvalQualifier = approvalQualifier;
        this.name = name;
        this.identifier = identifier;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public IfcDateTimeSelect getApprovalDateTime() {
        return approvalDateTime;
    }

    public void setApprovalDateTime(IfcDateTimeSelect approvalDateTime) {
        this.approvalDateTime = approvalDateTime;
    }

    public IfcLabel getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(IfcLabel approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public IfcLabel getApprovalLevel() {
        return approvalLevel;
    }

    public void setApprovalLevel(IfcLabel approvalLevel) {
        this.approvalLevel = approvalLevel;
    }

    public IfcText getApprovalQualifier() {
        return approvalQualifier;
    }

    public void setApprovalQualifier(IfcText approvalQualifier) {
        this.approvalQualifier = approvalQualifier;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(IfcIdentifier identifier) {
        this.identifier = identifier;
    }

    public SET<IfcApprovalActorRelationship> getActors() {
        return actors;
    }

    public void setActors(SET<IfcApprovalActorRelationship> actors) {
        this.actors = actors;
    }

    public SET<IfcApprovalRelationship> getIsRelatedWith() {
        return isRelatedWith;
    }

    public void setIsRelatedWith(SET<IfcApprovalRelationship> isRelatedWith) {
        this.isRelatedWith = isRelatedWith;
    }

    public SET<IfcApprovalRelationship> getRelates() {
        return relates;
    }

    public void setRelates(SET<IfcApprovalRelationship> relates) {
        this.relates = relates;
    }
}
