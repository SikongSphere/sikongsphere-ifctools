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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcelectricaldomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * Defines the range of different types of communications appliance that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCommunicationsApplianceTypeEnum {
    /**
      * A transducer designed to transmit or receive electromagnetic waves.
      */
    ANTENNA,

    /**
      * A desktop, laptop, tablet, or other type of computer that can be moved from one place to another and connected to an electrical supply via a plugged outlet.
      */
    COMPUTER,

    /**
      * A machine that has the primary function of transmitting a facsimile copy of printed matter using a telephone line.
      */
    FAX,

    /**
      * A gateway connects multiple network segments with different protocols at all layers (layers 1-7) of the Open Systems Interconnection (OSI) model.
      */
    GATEWAY,

    /**
      * A modem (from modulator-demodulator) is a device that modulates an analog carrier signal to encode digital information, and also demodulates such a carrier signal to decode the transmitted information.
      */
    MODEM,

    /**
      * A network appliance performs a dedicated function such as firewall protection, content filtering, load balancing, or equipment management.
      */
    NETWORKAPPLIANCE,

    /**
      * A network bridge connects multiple network segments at the data link layer (layer 2) of the OSI model, and the term layer 2 switch is very often used interchangeably with bridge.
      */
    NETWORKBRIDGE,

    /**
      * A network hub connects multiple network segments at the physical layer (layer 1) of the OSI model.
      */
    NETWORKHUB,

    /**
      * A machine that has the primary function of printing text and/or graphics onto paper or other media.
      */
    PRINTER,

    /**
      * A repeater is an electronic device that receives a signal and retransmits it at a higher level and/or higher power, or onto the other side of an obstruction, so that the signal can cover longer distances without degradation.
      */
    REPEATER,

    /**
      * A router is a networking device whose software and hardware are usually tailored to the tasks of routing and forwarding information. For example, on the Internet, information is directed to various paths by routers.
      */
    ROUTER,

    /**
      * A machine that has the primary function of scanning the content of printed matter and converting it to digital format that can be stored in a computer.
      */
    SCANNER,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
