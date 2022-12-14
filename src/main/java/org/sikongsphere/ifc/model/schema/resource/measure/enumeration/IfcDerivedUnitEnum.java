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
package org.sikongsphere.ifc.model.schema.resource.measure.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * An enumeration type for allowed types of derived units.
 *
 * @author Wang Bohong
 * @date 2022/8/29 15:28
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcDerivedUnitEnum {
    ANGULARVELOCITYUNIT,
    COMPOUNDPLANEANGLEUNIT,
    DYNAMICVISCOSITYUNIT,
    HEATFLUXDENSITYUNIT,
    INTEGERCOUNTRATEUNIT,
    ISOTHERMALMOISTURECAPACITYUNIT,
    KINEMATICVISCOSITYUNIT,
    LINEARVELOCITYUNIT,
    MASSDENSITYUNIT,
    MASSFLOWRATEUNIT,
    MOISTUREDIFFUSIVITYUNIT,
    MOLECULARWEIGHTUNIT,
    SPECIFICHEATCAPACITYUNIT,
    THERMALADMITTANCEUNIT,
    THERMALCONDUCTANCEUNIT,
    THERMALRESISTANCEUNIT,
    THERMALTRANSMITTANCEUNIT,
    VAPORPERMEABILITYUNIT,
    VOLUMETRICFLOWRATEUNIT,
    ROTATIONALFREQUENCYUNIT,
    TORQUEUNIT,
    MOMENTOFINERTIAUNIT,
    LINEARMOMENTUNIT,
    LINEARFORCEUNIT,
    PLANARFORCEUNIT,
    MODULUSOFELASTICITYUNIT,
    SHEARMODULUSUNIT,
    LINEARSTIFFNESSUNIT,
    ROTATIONALSTIFFNESSUNIT,
    MODULUSOFSUBGRADEREACTIONUNIT,
    ACCELERATIONUNIT,
    CURVATUREUNIT,
    HEATINGVALUEUNIT,
    IONCONCENTRATIONUNIT,
    LUMINOUSINTENSITYDISTRIBUTIONUNIT,
    MASSPERLENGTHUNIT,
    MODULUSOFLINEARSUBGRADEREACTIONUNIT,
    MODULUSOFROTATIONALSUBGRADEREACTIONUNIT,
    PHUNIT,
    ROTATIONALMASSUNIT,
    SECTIONAREAINTEGRALUNIT,
    SECTIONMODULUSUNIT,
    SOUNDPOWERUNIT,
    SOUNDPRESSUREUNIT,
    TEMPERATUREGRADIENTUNIT,
    THERMALEXPANSIONCOEFFICIENTUNIT,
    WARPINGCONSTANTUNIT,
    WARPINGMOMENTUNIT,
    /**
     * User defined derived unit
     * @author Wang Bohong
     */
    USERDEFINED
}
