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
package org.sikongsphere.ifc.model.schema.resource.presentationorganization.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLuminousIntensityDistributionMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPlaneAngleMeasure;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity.IfcAnnotationOccurrence;
import org.sikongsphere.ifc.model.schema.resource.presentationdimension.selecttype.IfcDraughtingCalloutElement;

/**
 * The IfcLightDistributionData defines the luminous intensity of a light source given at a particular
 * main plane angle.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcLightDistributionData extends IfcAbstractClass {
    private IfcPlaneAngleMeasure mainPlaneAngle;
    private LIST<IfcPlaneAngleMeasure> secondaryPlaneAngle;
    private LIST<IfcLuminousIntensityDistributionMeasure> luminousIntensity;

    @IfcParserConstructor
    public IfcLightDistributionData(
        IfcPlaneAngleMeasure mainPlaneAngle,
        LIST<IfcPlaneAngleMeasure> secondaryPlaneAngle,
        LIST<IfcLuminousIntensityDistributionMeasure> luminousIntensity
    ) {
        this.mainPlaneAngle = mainPlaneAngle;
        this.secondaryPlaneAngle = secondaryPlaneAngle;
        this.luminousIntensity = luminousIntensity;
    }

    public IfcPlaneAngleMeasure getMainPlaneAngle() {
        return mainPlaneAngle;
    }

    public void setMainPlaneAngle(IfcPlaneAngleMeasure mainPlaneAngle) {
        this.mainPlaneAngle = mainPlaneAngle;
    }

    public LIST<IfcPlaneAngleMeasure> getSecondaryPlaneAngle() {
        return secondaryPlaneAngle;
    }

    public void setSecondaryPlaneAngle(LIST<IfcPlaneAngleMeasure> secondaryPlaneAngle) {
        this.secondaryPlaneAngle = secondaryPlaneAngle;
    }

    public LIST<IfcLuminousIntensityDistributionMeasure> getLuminousIntensity() {
        return luminousIntensity;
    }

    public void setLuminousIntensity(
        LIST<IfcLuminousIntensityDistributionMeasure> luminousIntensity
    ) {
        this.luminousIntensity = luminousIntensity;
    }
}
