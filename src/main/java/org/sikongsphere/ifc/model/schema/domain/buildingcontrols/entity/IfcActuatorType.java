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
package org.sikongsphere.ifc.model.schema.domain.buildingcontrols.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.domain.architecture.enumeration.IfcPermeableCoveringOperationEnum;
import org.sikongsphere.ifc.model.schema.domain.buildingcontrols.enumeration.IfcActuatorTypeEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcShapeAspect;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.sharedbldgelements.enumeration.IfcWindowPanelPositionEnum;
import org.sikongsphere.ifc.model.schema.shared.sharedbldgservices.entity.IfcDistributionControlElementType;

/**
 * @author yiwei
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcActuatorType extends IfcDistributionControlElementType {
    private IfcActuatorTypeEnum predefinedType;

    @IfcParserConstructor
    public IfcActuatorType(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel applicableOccurrence,
        SET<IfcPropertySetDefinition> hasPropertySets,
        LIST<IfcRepresentationMap> representationMaps,
        IfcLabel tag,
        IfcLabel elementType,
        IfcActuatorTypeEnum predefinedType
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            applicableOccurrence,
            hasPropertySets,
            representationMaps,
            tag,
            elementType
        );
        this.predefinedType = predefinedType;
    }

    public IfcActuatorTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcActuatorTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
