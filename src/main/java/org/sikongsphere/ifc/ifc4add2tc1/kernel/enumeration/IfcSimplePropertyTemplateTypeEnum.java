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
 * This enumeration defines the correct subtype of instances of IfcSimpleProperty or IfcPhysicalSimpleQuantity that are created and are assigned to this IfcSimplePropertyTemplate. It also determines how the attributes of IfcPropertyTemplate, PrimaryUnit, SecondaryUnit, Enumerators, PrimaryDataType, SecondaryDataType, should be used.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcSimplePropertyTemplateTypeEnum {
    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcPropertySingleValue.
      */
    P_SINGLEVALUE,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcPropertyEnumeratedValue.
      */
    P_ENUMERATEDVALUE,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcPropertyBoundedValue.
      */
    P_BOUNDEDVALUE,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcPropertyListValue.
      */
    P_LISTVALUE,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcPropertyTableValue.
      */
    P_TABLEVALUE,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcPropertyReferenceValue.
      */
    P_REFERENCEVALUE,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcQuantityLength.
      */
    Q_LENGTH,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcQuantityArea.
      */
    Q_AREA,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcQuantityVolume.
      */
    Q_VOLUME,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcQuantityCount.
      */
    Q_COUNT,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcQuantityWeight.
      */
    Q_WEIGHT,

    /**
      * The properties defined by this IfcPropertyTemplate are of type IfcQuantityTime.
      */
    Q_TIME

}
