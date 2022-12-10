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
package org.sikongsphere.ifc.model.schema.shared.sharedbldelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcTypeProduct;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.sharedbldelements.enumeration.IfcWindowStyleConstructionEnum;
import org.sikongsphere.ifc.model.schema.shared.sharedbldelements.enumeration.IfcWindowStyleOperationEnum;

/**
 * @author GaoSU
 * @date 2022/10/25 13:06
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcWindowStyle extends IfcTypeProduct {
    private IfcWindowStyleConstructionEnum constructionType;
    private IfcWindowStyleOperationEnum operationType;
    private BOOLEAN parameterTakesPrecedence;
    private BOOLEAN sizeable;

    public IfcWindowStyle() {}

    @IfcParserConstructor
    public IfcWindowStyle(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel applicableOccurrence,
        SET<IfcPropertySetDefinition> hasPropertySets,
        LIST<IfcRepresentationMap> representationMaps,
        IfcLabel tag,
        IfcWindowStyleConstructionEnum constructionType,
        IfcWindowStyleOperationEnum operationType,
        BOOLEAN parameterTakesPrecedence,
        BOOLEAN sizeable
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            applicableOccurrence,
            hasPropertySets,
            representationMaps,
            tag
        );
        this.constructionType = constructionType;
        this.operationType = operationType;
        this.parameterTakesPrecedence = parameterTakesPrecedence;
        this.sizeable = sizeable;
    }

    public IfcWindowStyleConstructionEnum getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(IfcWindowStyleConstructionEnum constructionType) {
        this.constructionType = constructionType;
    }

    public IfcWindowStyleOperationEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(IfcWindowStyleOperationEnum operationType) {
        this.operationType = operationType;
    }

    public BOOLEAN getParameterTakesPrecedence() {
        return parameterTakesPrecedence;
    }

    public void setParameterTakesPrecedence(BOOLEAN parameterTakesPrecedence) {
        this.parameterTakesPrecedence = parameterTakesPrecedence;
    }

    public BOOLEAN getSizeable() {
        return sizeable;
    }

    public void setSizeable(BOOLEAN sizeable) {
        this.sizeable = sizeable;
    }
}
