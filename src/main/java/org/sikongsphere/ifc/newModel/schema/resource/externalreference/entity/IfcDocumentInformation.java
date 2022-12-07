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
package org.sikongsphere.ifc.newModel.schema.resource.externalreference.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.newModel.schema.resource.datetime.entity.IfcCalendarDate;
import org.sikongsphere.ifc.newModel.schema.resource.datetime.entity.IfcDateAndTime;
import org.sikongsphere.ifc.newModel.schema.resource.externalreference.enumeration.IfcDocumentConfidentialityEnum;
import org.sikongsphere.ifc.newModel.schema.resource.externalreference.enumeration.IfcDocumentStatusEnum;
import org.sikongsphere.ifc.newModel.schema.resource.externalreference.selectType.IfcDocumentSelect;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcText;

/**
 * @author zaiyuan
 * @date 2022/10/26
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDocumentInformation extends IfcAbstractClass implements IfcDocumentSelect {
    private IfcIdentifier documentId;
    private IfcLabel name;
    private IfcText description;
    @IfcOptionField
    private SET<IfcDocumentReference> documentReferences;
    @IfcOptionField
    private IfcText purpose;
    @IfcOptionField
    private IfcText intendedUse;
    @IfcOptionField
    private IfcText scope;
    @IfcOptionField
    private IfcLabel revision;
    @IfcOptionField
    private IfcActorSelect documentOwner;
    @IfcOptionField
    private SET<IfcActorSelect> editors;
    @IfcOptionField
    private IfcDateAndTime creationTime;
    @IfcOptionField
    private IfcDateAndTime lastRevisionTime;
    @IfcOptionField
    private IfcDocumentElectronicFormat electronicFormat;
    @IfcOptionField
    private IfcCalendarDate validFrom;
    @IfcOptionField
    private IfcCalendarDate validUntil;
    @IfcOptionField
    private IfcDocumentConfidentialityEnum confidentiality;
    @IfcOptionField
    private IfcDocumentStatusEnum status;

    @IfcInverseParameter
    private SET<IfcDocumentInformationRelationship> isPointedTo;
    @IfcInverseParameter
    private SET<IfcDocumentInformationRelationship> isPointer;

    public IfcDocumentInformation(
        IfcIdentifier documentId,
        IfcLabel name,
        IfcText description,
        SET<IfcDocumentReference> documentReferences,
        IfcText purpose,
        IfcText intendedUse,
        IfcText scope,
        IfcLabel revision,
        IfcActorSelect documentOwner,
        SET<IfcActorSelect> editors,
        IfcDateAndTime creationTime,
        IfcDateAndTime lastRevisionTime,
        IfcDocumentElectronicFormat electronicFormat,
        IfcCalendarDate validFrom,
        IfcCalendarDate validUntil,
        IfcDocumentConfidentialityEnum confidentiality,
        IfcDocumentStatusEnum status
    ) {
        this.documentId = documentId;
        this.name = name;
        this.description = description;
        this.documentReferences = documentReferences;
        this.purpose = purpose;
        this.intendedUse = intendedUse;
        this.scope = scope;
        this.revision = revision;
        this.documentOwner = documentOwner;
        this.editors = editors;
        this.creationTime = creationTime;
        this.lastRevisionTime = lastRevisionTime;
        this.electronicFormat = electronicFormat;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.confidentiality = confidentiality;
        this.status = status;
    }

    public IfcIdentifier getDocumentId() {
        return documentId;
    }

    public void setDocumentId(IfcIdentifier documentId) {
        this.documentId = documentId;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public SET<IfcDocumentReference> getDocumentReferences() {
        return documentReferences;
    }

    public void setDocumentReferences(SET<IfcDocumentReference> documentReferences) {
        this.documentReferences = documentReferences;
    }

    public IfcText getPurpose() {
        return purpose;
    }

    public void setPurpose(IfcText purpose) {
        this.purpose = purpose;
    }

    public IfcText getIntendedUse() {
        return intendedUse;
    }

    public void setIntendedUse(IfcText intendedUse) {
        this.intendedUse = intendedUse;
    }

    public IfcText getScope() {
        return scope;
    }

    public void setScope(IfcText scope) {
        this.scope = scope;
    }

    public IfcLabel getRevision() {
        return revision;
    }

    public void setRevision(IfcLabel revision) {
        this.revision = revision;
    }

    public IfcActorSelect getDocumentOwner() {
        return documentOwner;
    }

    public void setDocumentOwner(IfcActorSelect documentOwner) {
        this.documentOwner = documentOwner;
    }

    public SET<IfcActorSelect> getEditors() {
        return editors;
    }

    public void setEditors(SET<IfcActorSelect> editors) {
        this.editors = editors;
    }

    public IfcDateAndTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(IfcDateAndTime creationTime) {
        this.creationTime = creationTime;
    }

    public IfcDateAndTime getLastRevisionTime() {
        return lastRevisionTime;
    }

    public void setLastRevisionTime(IfcDateAndTime lastRevisionTime) {
        this.lastRevisionTime = lastRevisionTime;
    }

    public IfcDocumentElectronicFormat getElectronicFormat() {
        return electronicFormat;
    }

    public void setElectronicFormat(IfcDocumentElectronicFormat electronicFormat) {
        this.electronicFormat = electronicFormat;
    }

    public IfcCalendarDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(IfcCalendarDate validFrom) {
        this.validFrom = validFrom;
    }

    public IfcCalendarDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(IfcCalendarDate validUntil) {
        this.validUntil = validUntil;
    }

    public IfcDocumentConfidentialityEnum getConfidentiality() {
        return confidentiality;
    }

    public void setConfidentiality(IfcDocumentConfidentialityEnum confidentiality) {
        this.confidentiality = confidentiality;
    }

    public IfcDocumentStatusEnum getStatus() {
        return status;
    }

    public void setStatus(IfcDocumentStatusEnum status) {
        this.status = status;
    }

    public SET<IfcDocumentInformationRelationship> getIsPointedTo() {
        return isPointedTo;
    }

    public void setIsPointedTo(SET<IfcDocumentInformationRelationship> isPointedTo) {
        this.isPointedTo = isPointedTo;
    }

    public SET<IfcDocumentInformationRelationship> getIsPointer() {
        return isPointer;
    }

    public void setIsPointer(SET<IfcDocumentInformationRelationship> isPointer) {
        this.isPointer = isPointer;
    }
}
