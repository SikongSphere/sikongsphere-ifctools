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
package org.sikongsphere.ifc.ifc4add2tc1.kernel.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the generalapplicability of instances of IfcPropertySet, orIfcElementQuantity defined by thisIfcPropertySetTemplate, to subtypes ofIfcObjectDefinition.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcPropertySetTemplateTypeEnum {
    /**
      * The property sets defined by this IfcPropertySetTemplate can only be assigned to subtypes of IfcTypeObject.
      */
    PSET_TYPEDRIVENONLY,

    /**
      * The property sets defined by this IfcPropertySetTemplate can be assignedto subtypes of IfcTypeObject and can be overridden by aproperty set with same name at subtypes of IfcObject.
      */
    PSET_TYPEDRIVENOVERRIDE,

    /**
      * The property sets defined by this IfcPropertySetTemplate can only be assigned to subtypes of IfcObject.
      */
    PSET_OCCURRENCEDRIVEN,

    /**
      * The property sets defined by this IfcPropertySetTemplate can only be assigned to IfcPerformanceHistory.
      */
    PSET_PERFORMANCEDRIVEN,

    /**
      * The element quantity defined by this IfcPropertySetTemplate can only be assigned to subtypes of IfcTypeObject.
      */
    QTO_TYPEDRIVENONLY,

    /**
      * The element quantity defined by this IfcPropertySetTemplate can beassigned to subtypes of IfcTypeObject and can be overriddenby an element quantity with same name at subtypes of IfcObject.
      */
    QTO_TYPEDRIVENOVERRIDE,

    /**
      * The element quantity defined by this IfcPropertySetTemplate can only beassigned to subtypes of IfcObject.
      */
    QTO_OCCURRENCEDRIVEN,

    /**
      * No restriction provided, the property sets defined by this IfcPropertySetTemplate can be assigned to any entity, if nototherwise restricted by the ApplicableEntity attribute.
      */
    NOTDEFINED

}
