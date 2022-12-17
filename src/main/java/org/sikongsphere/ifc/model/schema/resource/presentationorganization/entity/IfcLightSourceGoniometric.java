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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLuminousFluxMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcThermodynamicTemperatureMeasure;
import org.sikongsphere.ifc.model.schema.resource.presentation.entity.IfcColourRgb;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.enumeration.IfcLightEmissionSourceEnum;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.selecttype.IfcLightDistributionDataSourceSelect;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcLightSourceGoniometric extends IfcLightSource {
    private IfcAxis2Placement3D position;
    @IfcOptionField
    private IfcColourRgb colourAppearance;
    private IfcThermodynamicTemperatureMeasure colourTemperature;
    private IfcLuminousFluxMeasure luminousFlux;
    private IfcLightEmissionSourceEnum lightEmissionSource;
    private IfcLightDistributionDataSourceSelect lightDistributionDataSource;

    @IfcParserConstructor
    public IfcLightSourceGoniometric(
        IfcLabel name,
        IfcColourRgb lightColour,
        IfcNormalisedRatioMeasure ambientIntensity,
        IfcNormalisedRatioMeasure intensity,
        IfcAxis2Placement3D position,
        IfcColourRgb colourAppearance,
        IfcThermodynamicTemperatureMeasure colourTemperature,
        IfcLuminousFluxMeasure luminousFlux,
        IfcLightEmissionSourceEnum lightEmissionSource,
        IfcLightDistributionDataSourceSelect lightDistributionDataSource
    ) {
        super(name, lightColour, ambientIntensity, intensity);
        this.position = position;
        this.colourAppearance = colourAppearance;
        this.colourTemperature = colourTemperature;
        this.luminousFlux = luminousFlux;
        this.lightEmissionSource = lightEmissionSource;
        this.lightDistributionDataSource = lightDistributionDataSource;
    }

    public IfcAxis2Placement3D getPosition() {
        return position;
    }

    public void setPosition(IfcAxis2Placement3D position) {
        this.position = position;
    }

    public IfcColourRgb getColourAppearance() {
        return colourAppearance;
    }

    public void setColourAppearance(IfcColourRgb colourAppearance) {
        this.colourAppearance = colourAppearance;
    }

    public IfcThermodynamicTemperatureMeasure getColourTemperature() {
        return colourTemperature;
    }

    public void setColourTemperature(IfcThermodynamicTemperatureMeasure colourTemperature) {
        this.colourTemperature = colourTemperature;
    }

    public IfcLuminousFluxMeasure getLuminousFlux() {
        return luminousFlux;
    }

    public void setLuminousFlux(IfcLuminousFluxMeasure luminousFlux) {
        this.luminousFlux = luminousFlux;
    }

    public IfcLightEmissionSourceEnum getLightEmissionSource() {
        return lightEmissionSource;
    }

    public void setLightEmissionSource(IfcLightEmissionSourceEnum lightEmissionSource) {
        this.lightEmissionSource = lightEmissionSource;
    }

    public IfcLightDistributionDataSourceSelect getLightDistributionDataSource() {
        return lightDistributionDataSource;
    }

    public void setLightDistributionDataSource(
        IfcLightDistributionDataSourceSelect lightDistributionDataSource
    ) {
        this.lightDistributionDataSource = lightDistributionDataSource;
    }
}
