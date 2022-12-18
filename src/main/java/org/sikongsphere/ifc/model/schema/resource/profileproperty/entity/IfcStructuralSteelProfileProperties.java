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
 *
 *
 * @author GaoSu
 * @date 2022/12/18 15:24
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuralSteelProfileProperties extends IfcStructuralProfileProperties {
    @IfcOptionField
    private IfcAreaMeasure shearAreaZ;
    @IfcOptionField
    private IfcAreaMeasure shearAreaY;
    @IfcOptionField
    private IfcPositiveRatioMeasure plasticShapeFactorY;
    @IfcOptionField
    private IfcPositiveRatioMeasure plasticShapeFactorZ;

    @IfcParserConstructor
    public IfcStructuralSteelProfileProperties(
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
        IfcLengthMeasure centreOfGravityInY,
        IfcAreaMeasure shearAreaZ,
        IfcAreaMeasure shearAreaY,
        IfcPositiveRatioMeasure plasticShapeFactorY,
        IfcPositiveRatioMeasure plasticShapeFactorZ
    ) {
        super(
            profileName,
            profileDefinition,
            physicalWeight,
            perimeter,
            minimumPlateThickness,
            maximumPlateThickness,
            crossSectionArea,
            torsionalConstantX,
            momentOfInertiaYZ,
            momentOfInertiaY,
            momentOfInertiaZ,
            warpingConstant,
            shearCentreZ,
            shearCentreY,
            shearDeformationAreaZ,
            shearDeformationAreaY,
            maximumSectionModulusY,
            minimumSectionModulusY,
            maximumSectionModulusZ,
            minimumSectionModulusZ,
            torsionalSectionModulus,
            centreOfGravityInX,
            centreOfGravityInY
        );
        this.shearAreaZ = shearAreaZ;
        this.shearAreaY = shearAreaY;
        this.plasticShapeFactorY = plasticShapeFactorY;
        this.plasticShapeFactorZ = plasticShapeFactorZ;
    }

    public IfcAreaMeasure getShearAreaZ() {
        return shearAreaZ;
    }

    public void setShearAreaZ(IfcAreaMeasure shearAreaZ) {
        this.shearAreaZ = shearAreaZ;
    }

    public IfcAreaMeasure getShearAreaY() {
        return shearAreaY;
    }

    public void setShearAreaY(IfcAreaMeasure shearAreaY) {
        this.shearAreaY = shearAreaY;
    }

    public IfcPositiveRatioMeasure getPlasticShapeFactorY() {
        return plasticShapeFactorY;
    }

    public void setPlasticShapeFactorY(IfcPositiveRatioMeasure plasticShapeFactorY) {
        this.plasticShapeFactorY = plasticShapeFactorY;
    }

    public IfcPositiveRatioMeasure getPlasticShapeFactorZ() {
        return plasticShapeFactorZ;
    }

    public void setPlasticShapeFactorZ(IfcPositiveRatioMeasure plasticShapeFactorZ) {
        this.plasticShapeFactorZ = plasticShapeFactorZ;
    }
}
