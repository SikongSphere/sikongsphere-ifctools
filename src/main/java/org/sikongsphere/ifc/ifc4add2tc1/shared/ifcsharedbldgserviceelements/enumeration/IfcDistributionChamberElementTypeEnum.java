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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedbldgserviceelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration identifies different types of distribution chambers.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcDistributionChamberElementTypeEnum {
    /**
      * Space formed in the ground for the passage of pipes, cables, ducts.
      */
    FORMEDDUCT,

    /**
      * Chamber constructed on a drain, sewer or pipeline with a removable cover that permits visble inspection.
      */
    INSPECTIONCHAMBER,

    /**
      * Recess or chamber formed to permit access for inspection of substructure and services.
      */
    INSPECTIONPIT,

    /**
      * hamber constructed on a drain, sewer or pipeline with a removable cover that permits the entry of a person.
      */
    MANHOLE,

    /**
      * Chamber that houses a meter(s).
      */
    METERCHAMBER,

    /**
      * Recessed or small chamber into which liquid is drained to facilitate its collection for removal.
      */
    SUMP,

    /**
      * Excavated chamber, the length of which typically exceeds the width.
      */
    TRENCH,

    /**
      * Chamber that houses a valve(s).
      */
    VALVECHAMBER,

    /**
      * User-defined chamber type.
      */
    USERDEFINED,

    /**
      * Undefined chamber type.
      */
    NOTDEFINED

}
