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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcReinforcingBarRoleEnum;

/**
 * This is a collection of structural properties applicable to all linear structural members having a profile definition.
 *
 * @author GaoSu
 * @date 2022/12/18 14:51
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuralProfileProperties extends IfcGeneralProfileProperties {
    @IfcOptionField
    private IfcMomentOfInertiaMeasure torsionalConstantX;
    @IfcOptionField
    private IfcMomentOfInertiaMeasure momentOfInertiaYZ;
    @IfcOptionField
    private IfcMomentOfInertiaMeasure momentOfInertiaY;
    @IfcOptionField
    private IfcMomentOfInertiaMeasure momentOfInertiaZ;
    @IfcOptionField
    private IfcWarpingConstantMeasure warpingConstant;
    @IfcOptionField
    private IfcLengthMeasure shearCentreZ;
    @IfcOptionField
    private IfcLengthMeasure shearCentreY;
    @IfcOptionField
    private IfcAreaMeasure shearDeformationAreaZ;
    @IfcOptionField
    private IfcAreaMeasure shearDeformationAreaY;
    @IfcOptionField
    private IfcSectionModulusMeasure maximumSectionModulusY;
    @IfcOptionField
    private IfcSectionModulusMeasure minimumSectionModulusY;
    @IfcOptionField
    private IfcSectionModulusMeasure maximumSectionModulusZ;
    @IfcOptionField
    private IfcSectionModulusMeasure minimumSectionModulusZ;
    @IfcOptionField
    private IfcSectionModulusMeasure torsionalSectionModulus;
    @IfcOptionField
    private IfcLengthMeasure centreOfGravityInX;
    @IfcOptionField
    private IfcLengthMeasure centreOfGravityInY;

    @IfcParserConstructor
    public IfcStructuralProfileProperties(
        IfcLabel profileName,
        IfcProfileDef profileDefinition,
        IfcMassPerLengthMeasure physicalWeight,
        IfcPositiveLengthMeasure perimeter,
        IfcPositiveLengthMeasure minimumPlateThickness,
        IfcPositiveLengthMeasure maximumPlateThickness,
        IfcAreaMeasure crossSectionArea,
        IfcMomentOfInertiaMeasure torsionalConstantX,
        IfcMomentOfInertiaMeasure momentOfInertiaYZ,
        IfcMomentOfInertiaMeasure momentOfInertiaY,
        IfcMomentOfInertiaMeasure momentOfInertiaZ,
        IfcWarpingConstantMeasure warpingConstant,
        IfcLengthMeasure shearCentreZ,
        IfcLengthMeasure shearCentreY,
        IfcAreaMeasure shearDeformationAreaZ,
        IfcAreaMeasure shearDeformationAreaY,
        IfcSectionModulusMeasure maximumSectionModulusY,
        IfcSectionModulusMeasure minimumSectionModulusY,
        IfcSectionModulusMeasure maximumSectionModulusZ,
        IfcSectionModulusMeasure minimumSectionModulusZ,
        IfcSectionModulusMeasure torsionalSectionModulus,
        IfcLengthMeasure centreOfGravityInX,
        IfcLengthMeasure centreOfGravityInY
    ) {
        super(
            profileName,
            profileDefinition,
            physicalWeight,
            perimeter,
            minimumPlateThickness,
            maximumPlateThickness,
            crossSectionArea
        );
        this.torsionalConstantX = torsionalConstantX;
        this.momentOfInertiaYZ = momentOfInertiaYZ;
        this.momentOfInertiaY = momentOfInertiaY;
        this.momentOfInertiaZ = momentOfInertiaZ;
        this.warpingConstant = warpingConstant;
        this.shearCentreZ = shearCentreZ;
        this.shearCentreY = shearCentreY;
        this.shearDeformationAreaZ = shearDeformationAreaZ;
        this.shearDeformationAreaY = shearDeformationAreaY;
        this.maximumSectionModulusY = maximumSectionModulusY;
        this.minimumSectionModulusY = minimumSectionModulusY;
        this.maximumSectionModulusZ = maximumSectionModulusZ;
        this.minimumSectionModulusZ = minimumSectionModulusZ;
        this.torsionalSectionModulus = torsionalSectionModulus;
        this.centreOfGravityInX = centreOfGravityInX;
        this.centreOfGravityInY = centreOfGravityInY;
    }

    public IfcMomentOfInertiaMeasure getTorsionalConstantX() {
        return torsionalConstantX;
    }

    public void setTorsionalConstantX(IfcMomentOfInertiaMeasure torsionalConstantX) {
        this.torsionalConstantX = torsionalConstantX;
    }

    public IfcMomentOfInertiaMeasure getMomentOfInertiaYZ() {
        return momentOfInertiaYZ;
    }

    public void setMomentOfInertiaYZ(IfcMomentOfInertiaMeasure momentOfInertiaYZ) {
        this.momentOfInertiaYZ = momentOfInertiaYZ;
    }

    public IfcMomentOfInertiaMeasure getMomentOfInertiaY() {
        return momentOfInertiaY;
    }

    public void setMomentOfInertiaY(IfcMomentOfInertiaMeasure momentOfInertiaY) {
        this.momentOfInertiaY = momentOfInertiaY;
    }

    public IfcMomentOfInertiaMeasure getMomentOfInertiaZ() {
        return momentOfInertiaZ;
    }

    public void setMomentOfInertiaZ(IfcMomentOfInertiaMeasure momentOfInertiaZ) {
        this.momentOfInertiaZ = momentOfInertiaZ;
    }

    public IfcWarpingConstantMeasure getWarpingConstant() {
        return warpingConstant;
    }

    public void setWarpingConstant(IfcWarpingConstantMeasure warpingConstant) {
        this.warpingConstant = warpingConstant;
    }

    public IfcLengthMeasure getShearCentreZ() {
        return shearCentreZ;
    }

    public void setShearCentreZ(IfcLengthMeasure shearCentreZ) {
        this.shearCentreZ = shearCentreZ;
    }

    public IfcLengthMeasure getShearCentreY() {
        return shearCentreY;
    }

    public void setShearCentreY(IfcLengthMeasure shearCentreY) {
        this.shearCentreY = shearCentreY;
    }

    public IfcAreaMeasure getShearDeformationAreaZ() {
        return shearDeformationAreaZ;
    }

    public void setShearDeformationAreaZ(IfcAreaMeasure shearDeformationAreaZ) {
        this.shearDeformationAreaZ = shearDeformationAreaZ;
    }

    public IfcAreaMeasure getShearDeformationAreaY() {
        return shearDeformationAreaY;
    }

    public void setShearDeformationAreaY(IfcAreaMeasure shearDeformationAreaY) {
        this.shearDeformationAreaY = shearDeformationAreaY;
    }

    public IfcSectionModulusMeasure getMaximumSectionModulusY() {
        return maximumSectionModulusY;
    }

    public void setMaximumSectionModulusY(IfcSectionModulusMeasure maximumSectionModulusY) {
        this.maximumSectionModulusY = maximumSectionModulusY;
    }

    public IfcSectionModulusMeasure getMinimumSectionModulusY() {
        return minimumSectionModulusY;
    }

    public void setMinimumSectionModulusY(IfcSectionModulusMeasure minimumSectionModulusY) {
        this.minimumSectionModulusY = minimumSectionModulusY;
    }

    public IfcSectionModulusMeasure getMaximumSectionModulusZ() {
        return maximumSectionModulusZ;
    }

    public void setMaximumSectionModulusZ(IfcSectionModulusMeasure maximumSectionModulusZ) {
        this.maximumSectionModulusZ = maximumSectionModulusZ;
    }

    public IfcSectionModulusMeasure getMinimumSectionModulusZ() {
        return minimumSectionModulusZ;
    }

    public void setMinimumSectionModulusZ(IfcSectionModulusMeasure minimumSectionModulusZ) {
        this.minimumSectionModulusZ = minimumSectionModulusZ;
    }

    public IfcSectionModulusMeasure getTorsionalSectionModulus() {
        return torsionalSectionModulus;
    }

    public void setTorsionalSectionModulus(IfcSectionModulusMeasure torsionalSectionModulus) {
        this.torsionalSectionModulus = torsionalSectionModulus;
    }

    public IfcLengthMeasure getCentreOfGravityInX() {
        return centreOfGravityInX;
    }

    public void setCentreOfGravityInX(IfcLengthMeasure centreOfGravityInX) {
        this.centreOfGravityInX = centreOfGravityInX;
    }

    public IfcLengthMeasure getCentreOfGravityInY() {
        return centreOfGravityInY;
    }

    public void setCentreOfGravityInY(IfcLengthMeasure centreOfGravityInY) {
        this.centreOfGravityInY = centreOfGravityInY;
    }
}
