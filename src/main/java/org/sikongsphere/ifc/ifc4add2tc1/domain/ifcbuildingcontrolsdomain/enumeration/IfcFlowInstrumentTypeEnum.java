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
 * The IfcFlowInstrumentTypeEnum defines the range of different types of flow instrument that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcFlowInstrumentTypeEnum {
    /**
      * A device that reads and displays a pressure value at a point or the pressure difference between two points.
      */
    PRESSUREGAUGE,

    /**
      * A device that reads and displays a temperature value at a point.
      */
    THERMOMETER,

    /**
      * A device that reads and displays the current flow in a circuit.
      */
    AMMETER,

    /**
      * A device that reads and displays the electrical frequency of an alternating current circuit.
      */
    FREQUENCYMETER,

    /**
      * A device that reads and displays the power factor of an electrical circuit.
      */
    POWERFACTORMETER,

    /**
      * A device that reads and displays the phase angle of a phase in a polyphase electrical circuit.
      */
    PHASEANGLEMETER,

    /**
      * A device that reads and displays the peak voltage in an electrical circuit.
      */
    VOLTMETER_PEAK,

    /**
      * A device that reads and displays the RMS (mean) voltage in an electrical circuit.
      */
    VOLTMETER_RMS,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
