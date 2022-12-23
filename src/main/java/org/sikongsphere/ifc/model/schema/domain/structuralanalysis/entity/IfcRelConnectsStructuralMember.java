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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcElement;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.structuralload.entity.IfcBoundaryCondition;
import org.sikongsphere.ifc.model.schema.resource.structuralload.entity.IfcStructuralConnectionCondition;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author yiwei
 * @date 2022/12/23 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcRelConnectsStructuralMember extends IfcRelConnects {
    private IfcStructuralMember relatingStructuralMember;
    private IfcStructuralConnection relatedStructuralConnection;
    @IfcOptionField
    private IfcBoundaryCondition appliedCondition;
    @IfcOptionField
    private IfcStructuralConnectionCondition additionalConditions;
    @IfcOptionField
    private IfcLengthMeasure supportedLength;
    @IfcOptionField
    private IfcAxis2Placement3D conditionCoordinateSystem;

    public IfcRelConnectsStructuralMember(
        IfcStructuralMember relatingStructuralMember,
        IfcStructuralConnection relatedStructuralConnection,
        IfcBoundaryCondition appliedCondition,
        IfcStructuralConnectionCondition additionalConditions,
        IfcLengthMeasure supportedLength,
        IfcAxis2Placement3D conditionCoordinateSystem
    ) {
        this.relatingStructuralMember = relatingStructuralMember;
        this.relatedStructuralConnection = relatedStructuralConnection;
        this.appliedCondition = appliedCondition;
        this.additionalConditions = additionalConditions;
        this.supportedLength = supportedLength;
        this.conditionCoordinateSystem = conditionCoordinateSystem;
    }

    @IfcParserConstructor
    public IfcRelConnectsStructuralMember(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcStructuralMember relatingStructuralMember,
        IfcStructuralConnection relatedStructuralConnection,
        IfcBoundaryCondition appliedCondition,
        IfcStructuralConnectionCondition additionalConditions,
        IfcLengthMeasure supportedLength,
        IfcAxis2Placement3D conditionCoordinateSystem
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatingStructuralMember = relatingStructuralMember;
        this.relatedStructuralConnection = relatedStructuralConnection;
        this.appliedCondition = appliedCondition;
        this.additionalConditions = additionalConditions;
        this.supportedLength = supportedLength;
        this.conditionCoordinateSystem = conditionCoordinateSystem;
    }

    public IfcStructuralMember getRelatingStructuralMember() {
        return relatingStructuralMember;
    }

    public void setRelatingStructuralMember(IfcStructuralMember relatingStructuralMember) {
        this.relatingStructuralMember = relatingStructuralMember;
    }

    public IfcStructuralConnection getRelatedStructuralConnection() {
        return relatedStructuralConnection;
    }

    public void setRelatedStructuralConnection(
        IfcStructuralConnection relatedStructuralConnection
    ) {
        this.relatedStructuralConnection = relatedStructuralConnection;
    }

    public IfcBoundaryCondition getAppliedCondition() {
        return appliedCondition;
    }

    public void setAppliedCondition(IfcBoundaryCondition appliedCondition) {
        this.appliedCondition = appliedCondition;
    }

    public IfcStructuralConnectionCondition getAdditionalConditions() {
        return additionalConditions;
    }

    public void setAdditionalConditions(IfcStructuralConnectionCondition additionalConditions) {
        this.additionalConditions = additionalConditions;
    }

    public IfcLengthMeasure getSupportedLength() {
        return supportedLength;
    }

    public void setSupportedLength(IfcLengthMeasure supportedLength) {
        this.supportedLength = supportedLength;
    }

    public IfcAxis2Placement3D getConditionCoordinateSystem() {
        return conditionCoordinateSystem;
    }

    public void setConditionCoordinateSystem(IfcAxis2Placement3D conditionCoordinateSystem) {
        this.conditionCoordinateSystem = conditionCoordinateSystem;
    }
}
