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
package org.sikongsphere.ifc.ifc4add2tc1.extension.ifcprocessextension.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcProcedureTypeEnum defines the range of different types of procedure that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcProcedureTypeEnum {
    /**
      * A caution that should be taken note of as a procedure or when carrying out a procedure.
      */
    ADVICE_CAUTION,

    /**
      * Additional information or advice that should be taken note of as a procedure or when carrying out a procedure.
      */
    ADVICE_NOTE,

    /**
      * A warning of potential danger that should be taken note of as a procedure or when carrying out a procedure.
      */
    ADVICE_WARNING,

    /**
      * A procedure undertaken to calibrate an artifact.
      */
    CALIBRATION,

    DIAGNOSTIC,

    /**
      * A procedure undertaken to shutdown the operation an artifact.
      */
    SHUTDOWN,

    /**
      * A procedure undertaken to start up the operation an artifact.
      */
    STARTUP,

    USERDEFINED,

    NOTDEFINED

}
