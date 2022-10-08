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
package org.sikongsphere.ifc.model.resource.measure.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * An enumeration type for allowed unit types of IfcNamedUnit.
 *
 * @author Wang Bohong
 * @date 2022/8/29 15:27
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcUnitEnum {
    ABSORBEDDOSEUNIT,
    AMOUNTOFSUBSTANCEUNIT,
    AREAUNIT,
    DOSEEQUIVALENTUNIT,
    ELECTRICCAPACITANCEUNIT,
    ELECTRICCHARGEUNIT,
    ELECTRICCONDUCTANCEUNIT,
    ELECTRICCURRENTUNIT,
    ELECTRICRESISTANCEUNIT,
    ELECTRICVOLTAGEUNIT,
    ENERGYUNIT,
    FORCEUNIT,
    FREQUENCYUNIT,
    ILLUMINANCEUNIT,
    INDUCTANCEUNIT,
    LENGTHUNIT,
    LUMINOUSFLUXUNIT,
    LUMINOUSINTENSITYUNIT,
    MAGNETICFLUXDENSITYUNIT,
    MAGNETICFLUXUNIT,
    MASSUNIT,
    PLANEANGLEUNIT,
    POWERUNIT,
    PRESSUREUNIT,
    RADIOACTIVITYUNIT,
    SOLIDANGLEUNIT,
    THERMODYNAMICTEMPERATUREUNIT,
    TIMEUNIT,
    VOLUMEUNIT,
    /**
     * User defined unit.
     * @author Wang Bohong
     */
    USERDEFINED
}
