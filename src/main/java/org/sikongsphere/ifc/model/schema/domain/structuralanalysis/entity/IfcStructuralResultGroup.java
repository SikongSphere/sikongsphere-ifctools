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

import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration.IfcAnalysisTheoryTypeEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcGroup;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Yiwei
 * @date 2022/12/23
 */
public class IfcStructuralResultGroup extends IfcGroup {
    private IfcAnalysisTheoryTypeEnum theoryType;
    @IfcOptionField
    private IfcStructuralLoadGroup resultForLoadGroup;
    private BOOLEAN isLinear;
    @IfcInverseParameter
    private SET<IfcStructuralAnalysisModel> resultGroupFor;

    public IfcStructuralResultGroup(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcAnalysisTheoryTypeEnum theoryType,
        IfcStructuralLoadGroup resultForLoadGroup,
        BOOLEAN isLinear
    ) {
        super(globalId, ownerHistory, name, description, objectType);
        this.theoryType = theoryType;
        this.resultForLoadGroup = resultForLoadGroup;
        this.isLinear = isLinear;
    }

    public IfcAnalysisTheoryTypeEnum getTheoryType() {
        return theoryType;
    }

    public void setTheoryType(IfcAnalysisTheoryTypeEnum theoryType) {
        this.theoryType = theoryType;
    }

    public IfcStructuralLoadGroup getResultForLoadGroup() {
        return resultForLoadGroup;
    }

    public void setResultForLoadGroup(IfcStructuralLoadGroup resultForLoadGroup) {
        this.resultForLoadGroup = resultForLoadGroup;
    }

    public BOOLEAN getIsLinear() {
        return isLinear;
    }

    public void setIsLinear(BOOLEAN isLinear) {
        this.isLinear = isLinear;
    }

    public SET<IfcStructuralAnalysisModel> getResultGroupFor() {
        return resultGroupFor;
    }

    public void setResultGroupFor(SET<IfcStructuralAnalysisModel> resultGroupFor) {
        this.resultGroupFor = resultGroupFor;
    }
}
