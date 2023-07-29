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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcbuildingcontrolsdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcUnitaryControlElementTypeEnum defines the range of different types and/or functions of unitary control elements possible.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcUnitaryControlElementTypeEnum {
    /**
      * A control element at which alarms are annunciated.
      */
    ALARMPANEL,

    /**
      * A control element at which devices that control or monitor the operation of a site, building or part of a building are located
      */
    CONTROLPANEL,

    /**
      * A control element at which the detection of gas is annunciated.
      */
    GASDETECTIONPANEL,

    /**
      * A control element at which equipment operational status, condition, safety state or other required parameters are indicated.
      */
    INDICATORPANEL,

    /**
      * A control element at which information that is available elsewhere is repeated or 'mimicked'.
      */
    MIMICPANEL,

    /**
      * A control element that senses and regulates the humidity of a system or space so that the humidity is maintained near a desired setpoint.
      */
    HUMIDISTAT,

    /**
      * A control element that senses and regulates the temperature of an element, system or space so that the temperature is maintained near a desired setpoint.
      */
    THERMOSTAT,

    /**
      * A control element that senses multiple climate properties such as temperature, humidity, pressure, wind, and rain.
      */
    WEATHERSTATION,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
