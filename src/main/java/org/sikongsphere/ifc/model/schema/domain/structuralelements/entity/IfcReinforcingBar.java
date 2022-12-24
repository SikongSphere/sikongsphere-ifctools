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
package org.sikongsphere.ifc.model.schema.domain.structuralelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.domain.structuralelements.enumeration.IfcPileConstructionEnum;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuildingElement;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcReinforcingBarRoleEnum;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcReinforcingBarSurfaceEnum;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author yiwei
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcReinforcingBar extends IfcReinforcingElement {
    private IfcPositiveLengthMeasure nominalDiameter;
    private IfcAreaMeasure crossSectionArea;
    @IfcOptionField
    private IfcPositiveLengthMeasure barLength;
    private IfcReinforcingBarRoleEnum barRole;
    @IfcOptionField
    private IfcReinforcingBarSurfaceEnum barSurface;

    public IfcReinforcingBar(
        IfcLabel steelGrade,
        IfcPositiveLengthMeasure nominalDiameter,
        IfcAreaMeasure crossSectionArea,
        IfcPositiveLengthMeasure barLength,
        IfcReinforcingBarRoleEnum barRole,
        IfcReinforcingBarSurfaceEnum barSurface
    ) {
        super(steelGrade);
        this.nominalDiameter = nominalDiameter;
        this.crossSectionArea = crossSectionArea;
        this.barLength = barLength;
        this.barRole = barRole;
        this.barSurface = barSurface;
    }

    @IfcParserConstructor
    public IfcReinforcingBar(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcLabel steelGrade,
        IfcPositiveLengthMeasure nominalDiameter,
        IfcAreaMeasure crossSectionArea,
        IfcPositiveLengthMeasure barLength,
        IfcReinforcingBarRoleEnum barRole,
        IfcReinforcingBarSurfaceEnum barSurface
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            tag,
            steelGrade
        );
        this.nominalDiameter = nominalDiameter;
        this.crossSectionArea = crossSectionArea;
        this.barLength = barLength;
        this.barRole = barRole;
        this.barSurface = barSurface;
    }

    public IfcPositiveLengthMeasure getNominalDiameter() {
        return nominalDiameter;
    }

    public void setNominalDiameter(IfcPositiveLengthMeasure nominalDiameter) {
        this.nominalDiameter = nominalDiameter;
    }

    public IfcAreaMeasure getCrossSectionArea() {
        return crossSectionArea;
    }

    public void setCrossSectionArea(IfcAreaMeasure crossSectionArea) {
        this.crossSectionArea = crossSectionArea;
    }

    public IfcPositiveLengthMeasure getBarLength() {
        return barLength;
    }

    public void setBarLength(IfcPositiveLengthMeasure barLength) {
        this.barLength = barLength;
    }

    public IfcReinforcingBarRoleEnum getBarRole() {
        return barRole;
    }

    public void setBarRole(IfcReinforcingBarRoleEnum barRole) {
        this.barRole = barRole;
    }

    public IfcReinforcingBarSurfaceEnum getBarSurface() {
        return barSurface;
    }

    public void setBarSurface(IfcReinforcingBarSurfaceEnum barSurface) {
        this.barSurface = barSurface;
    }
}
