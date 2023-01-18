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
package org.sikongsphere.ifc.model.schema.domain.structuralanalysis.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration.IfcActionSourceTypeEnum;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration.IfcActionTypeEnum;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration.IfcLoadGroupTypeEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcGroup;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author yiwei
 * @date 2022/12/23
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcStructuralLoadGroup extends IfcGroup {
    private IfcLoadGroupTypeEnum predefinedType;
    private IfcActionTypeEnum actionType;
    private IfcActionSourceTypeEnum actionSource;
    @IfcOptionField
    private IfcPositiveRatioMeasure coefficient;
    @IfcOptionField
    private IfcLabel purpose;
    @IfcInverseParameter
    private SET<IfcStructuralResultGroup> sourceOfResultGroup;
    @IfcInverseParameter
    private SET<IfcStructuralAnalysisModel> loadGroupFor;

    @IfcParserConstructor
    public IfcStructuralLoadGroup(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcLoadGroupTypeEnum predefinedType,
        IfcActionTypeEnum actionType,
        IfcActionSourceTypeEnum actionSource,
        IfcPositiveRatioMeasure coefficient,
        IfcLabel purpose
    ) {
        super(globalId, ownerHistory, name, description, objectType);
        this.predefinedType = predefinedType;
        this.actionType = actionType;
        this.actionSource = actionSource;
        this.coefficient = coefficient;
        this.purpose = purpose;
    }

    public IfcLoadGroupTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcLoadGroupTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public IfcActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(IfcActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public IfcActionSourceTypeEnum getActionSource() {
        return actionSource;
    }

    public void setActionSource(IfcActionSourceTypeEnum actionSource) {
        this.actionSource = actionSource;
    }

    public IfcPositiveRatioMeasure getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(IfcPositiveRatioMeasure coefficient) {
        this.coefficient = coefficient;
    }

    public IfcLabel getPurpose() {
        return purpose;
    }

    public void setPurpose(IfcLabel purpose) {
        this.purpose = purpose;
    }

    public SET<IfcStructuralResultGroup> getSourceOfResultGroup() {
        return sourceOfResultGroup;
    }

    public void setSourceOfResultGroup(SET<IfcStructuralResultGroup> sourceOfResultGroup) {
        this.sourceOfResultGroup = sourceOfResultGroup;
    }

    public SET<IfcStructuralAnalysisModel> getLoadGroupFor() {
        return loadGroupFor;
    }

    public void setLoadGroupFor(SET<IfcStructuralAnalysisModel> loadGroupFor) {
        this.loadGroupFor = loadGroupFor;
    }
}
