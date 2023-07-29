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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcmeasureresource.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * IfcDerivedUnitEnum is an enumeration type for allowed types of derived units.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcDerivedUnitEnum {
    ANGULARVELOCITYUNIT,

    AREADENSITYUNIT,

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

    SOUNDPOWERLEVELUNIT,

    SOUNDPOWERUNIT,

    SOUNDPRESSURELEVELUNIT,

    SOUNDPRESSUREUNIT,

    TEMPERATUREGRADIENTUNIT,

    TEMPERATURERATEOFCHANGEUNIT,

    THERMALEXPANSIONCOEFFICIENTUNIT,

    WARPINGCONSTANTUNIT,

    WARPINGMOMENTUNIT,

    /**
      * User defined derived unit.
      */
    USERDEFINED

}
