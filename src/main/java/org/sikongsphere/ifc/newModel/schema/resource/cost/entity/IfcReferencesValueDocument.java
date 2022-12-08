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
package org.sikongsphere.ifc.newModel.schema.resource.cost.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.cost.enumeration.IfcArithmeticOperatorEnum;
import org.sikongsphere.ifc.newModel.schema.resource.externalreference.selectType.IfcDocumentSelect;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcText;

/**
 * An IfcReferencesValueDocument is a means of referencing many instances of IfcAppliedValue to a single document
 * where the document is a price list, quotation, list of environmental impact values or other source of information.
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcReferencesValueDocument extends IfcAbstractClass {
    private IfcDocumentSelect referencedDocument;
    private SET<IfcAppliedValue> referencingValue;
    @IfcOptionField
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;

    @IfcParserConstructor
    public IfcReferencesValueDocument(
        IfcDocumentSelect referencedDocument,
        SET<IfcAppliedValue> referencingValue,
        IfcLabel name,
        IfcText description
    ) {
        this.referencedDocument = referencedDocument;
        this.referencingValue = referencingValue;
        this.name = name;
        this.description = description;
    }

    public IfcDocumentSelect getReferencedDocument() {
        return referencedDocument;
    }

    public void setReferencedDocument(IfcDocumentSelect referencedDocument) {
        this.referencedDocument = referencedDocument;
    }

    public SET<IfcAppliedValue> getReferencingValue() {
        return referencingValue;
    }

    public void setReferencingValue(SET<IfcAppliedValue> referencingValue) {
        this.referencingValue = referencingValue;
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
}
