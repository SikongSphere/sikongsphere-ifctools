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
package org.sikongsphere.ifc.model.schema.resource.profileproperty.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcReinforcingBarSurfaceEnum;

/**
 *
 *
 * @author GaoSu
 * @date 2022/12/18 13:29
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcReinforcementBarProperties extends IfcAbstractClass {
    private IfcAreaMeasure totalCrossSectionArea;
    private IfcLabel steelGrade;
    @IfcOptionField
    private IfcReinforcingBarSurfaceEnum barSurface;
    @IfcOptionField
    private IfcLengthMeasure effectiveDepth;
    @IfcOptionField
    private IfcPositiveLengthMeasure nominalBarDiameter;
    @IfcOptionField
    private IfcCountMeasure barCount;

    @IfcParserConstructor
    public IfcReinforcementBarProperties(
        IfcAreaMeasure totalCrossSectionArea,
        IfcLabel steelGrade,
        IfcReinforcingBarSurfaceEnum barSurface,
        IfcLengthMeasure effectiveDepth,
        IfcPositiveLengthMeasure nominalBarDiameter,
        IfcCountMeasure barCount
    ) {
        this.totalCrossSectionArea = totalCrossSectionArea;
        this.steelGrade = steelGrade;
        this.barSurface = barSurface;
        this.effectiveDepth = effectiveDepth;
        this.nominalBarDiameter = nominalBarDiameter;
        this.barCount = barCount;
    }

    public IfcAreaMeasure getTotalCrossSectionArea() {
        return totalCrossSectionArea;
    }

    public void setTotalCrossSectionArea(IfcAreaMeasure totalCrossSectionArea) {
        this.totalCrossSectionArea = totalCrossSectionArea;
    }

    public IfcLabel getSteelGrade() {
        return steelGrade;
    }

    public void setSteelGrade(IfcLabel steelGrade) {
        this.steelGrade = steelGrade;
    }

    public IfcReinforcingBarSurfaceEnum getBarSurface() {
        return barSurface;
    }

    public void setBarSurface(IfcReinforcingBarSurfaceEnum barSurface) {
        this.barSurface = barSurface;
    }

    public IfcLengthMeasure getEffectiveDepth() {
        return effectiveDepth;
    }

    public void setEffectiveDepth(IfcLengthMeasure effectiveDepth) {
        this.effectiveDepth = effectiveDepth;
    }

    public IfcPositiveLengthMeasure getNominalBarDiameter() {
        return nominalBarDiameter;
    }

    public void setNominalBarDiameter(IfcPositiveLengthMeasure nominalBarDiameter) {
        this.nominalBarDiameter = nominalBarDiameter;
    }

    public IfcCountMeasure getBarCount() {
        return barCount;
    }

    public void setBarCount(IfcCountMeasure barCount) {
        this.barCount = barCount;
    }
}
