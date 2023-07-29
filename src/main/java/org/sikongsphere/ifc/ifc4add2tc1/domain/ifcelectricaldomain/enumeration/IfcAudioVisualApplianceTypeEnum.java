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
 * Defines the range of different types of audio-video devices that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcAudioVisualApplianceTypeEnum {
    /**
      * A device that receives an audio signal and amplifies it to play through speakers.
      */
    AMPLIFIER,

    /**
      * A device that records images, either as a still photograph or as moving images known as videos or movies. Note that a camera may operate with light from the visible spectrum or from other parts of the electromagnetic spectrum such as infrared or ultraviolet.
      */
    CAMERA,

    /**
      * An electronic device that represents information in visual form such as a flat-panel display or television.
      */
    DISPLAY,

    /**
      * An acoustic-to-electric transducer or sensor that converts sound into an electrical signal. Microphones types in use include electromagnetic induction (dynamic microphones), capacitance change (condenser microphones) or piezoelectric generation to produce the signal from mechanical vibration.
      */
    MICROPHONE,

    /**
      * A device that plays audio and/or video content directly or to another device, having fixed or removable storage media.
      */
    PLAYER,

    /**
      * An apparatus for projecting a picture on a screen. Whether the device is an overhead, slide projector, or a film projector, it is usually referred to as simply a projector.
      */
    PROJECTOR,

    /**
      * A device that receives audio and/or video signals, switches sources, and amplifies signals to play through speakers.
      */
    RECEIVER,

    /**
      * A loudspeaker, speaker, or speaker system is an electroacoustical transducer that converts an electrical signal to sound.
      */
    SPEAKER,

    /**
      * A device that receives audio and/or video signals, switches sources, and transmits signals to downstream devices.
      */
    SWITCHER,

    /**
      * A telecommunications device that is used to transmit and receive sound, and optionally video.
      */
    TELEPHONE,

    /**
      * An electronic receiver that detects, demodulates, and amplifies transmitted signals.
      */
    TUNER,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
