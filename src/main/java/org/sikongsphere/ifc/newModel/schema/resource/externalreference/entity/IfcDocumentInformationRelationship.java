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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.externalreference.selectType.IfcClassificationNotationSelect;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;

/**
 * @author zaiyuan
 * @date 2022/10/26
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDocumentInformationRelationship extends IfcAbstractClass {
    private IfcDocumentInformation relatingDocument;
    private SET<IfcDocumentInformation> relatedDocuments;
    @IfcOptionField
    private IfcLabel relationshipType;

    @IfcParserConstructor
    public IfcDocumentInformationRelationship(
        IfcDocumentInformation relatingDocument,
        SET<IfcDocumentInformation> relatedDocuments,
        IfcLabel relationshipType
    ) {
        this.relatingDocument = relatingDocument;
        this.relatedDocuments = relatedDocuments;
        this.relationshipType = relationshipType;
    }

    public IfcDocumentInformation getRelatingDocument() {
        return relatingDocument;
    }

    public void setRelatingDocument(IfcDocumentInformation relatingDocument) {
        this.relatingDocument = relatingDocument;
    }

    public SET<IfcDocumentInformation> getRelatedDocuments() {
        return relatedDocuments;
    }

    public void setRelatedDocuments(SET<IfcDocumentInformation> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
    }

    public IfcLabel getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(IfcLabel relationshipType) {
        this.relationshipType = relationshipType;
    }
}
