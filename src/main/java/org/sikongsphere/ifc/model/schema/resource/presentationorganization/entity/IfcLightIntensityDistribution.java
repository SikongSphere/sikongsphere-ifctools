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
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.enumeration.IfcLightDistributionCurveEnum;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.selecttype.IfcLightDistributionDataSourceSelect;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcLightIntensityDistribution extends IfcAbstractClass
    implements
        IfcLightDistributionDataSourceSelect {
    private IfcLightDistributionCurveEnum lightDistributionCurve;
    private LIST<IfcLightDistributionData> distributionData;

    @IfcParserConstructor
    public IfcLightIntensityDistribution(
        IfcLightDistributionCurveEnum lightDistributionCurve,
        LIST<IfcLightDistributionData> distributionData
    ) {
        this.lightDistributionCurve = lightDistributionCurve;
        this.distributionData = distributionData;
    }

    public IfcLightDistributionCurveEnum getLightDistributionCurve() {
        return lightDistributionCurve;
    }

    public void setLightDistributionCurve(IfcLightDistributionCurveEnum lightDistributionCurve) {
        this.lightDistributionCurve = lightDistributionCurve;
    }

    public LIST<IfcLightDistributionData> getDistributionData() {
        return distributionData;
    }

    public void setDistributionData(LIST<IfcLightDistributionData> distributionData) {
        this.distributionData = distributionData;
    }
}
