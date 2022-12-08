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
package org.sikongsphere.ifc.newModel.schema.shared.sharedbldelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.BOOLEAN;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.core.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.newModel.schema.core.kernel.entity.IfcTypeProduct;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.newModel.schema.shared.sharedbldelements.enumeration.IfcDoorStyleConstructionEnum;
import org.sikongsphere.ifc.newModel.schema.shared.sharedbldelements.enumeration.IfcDoorStyleOperationEnum;

/**
 * The door style, IfcDoorStyle, defines a particular style of doors, which may be included into the spatial context of the building model through an (or multiple) instances of IfcDoor.
 * @author Wang Bohong
 * @date 2022/10/25 11:59
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcDoorStyle extends IfcTypeProduct {
    private IfcDoorStyleOperationEnum operationType;
    private IfcDoorStyleConstructionEnum constructionType;
    private BOOLEAN parameterTakesPrecedence;
    private BOOLEAN sizeable;

    public IfcDoorStyle() {}

    @IfcParserConstructor
    public IfcDoorStyle(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel applicableOccurrence,
        SET<IfcPropertySetDefinition> hasPropertySets,
        LIST<IfcRepresentationMap> representationMaps,
        IfcLabel tag,
        IfcDoorStyleOperationEnum operationType,
        IfcDoorStyleConstructionEnum constructionType,
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
        this.operationType = operationType;
        this.constructionType = constructionType;
        this.parameterTakesPrecedence = parameterTakesPrecedence;
        this.sizeable = sizeable;
    }

    public IfcDoorStyleOperationEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(IfcDoorStyleOperationEnum operationType) {
        this.operationType = operationType;
    }

    public IfcDoorStyleConstructionEnum getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(IfcDoorStyleConstructionEnum constructionType) {
        this.constructionType = constructionType;
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
