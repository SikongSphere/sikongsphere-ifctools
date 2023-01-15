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
package org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This enumeration is used to qualify the life-cycle or design state of the properties contained in the entity and contains the following:
 * DESIGN: Properties are all design values.
 * DESIGNMAXIMUM: Properties are all maximum design values.
 * DESIGNMINIMUM: Properties are all minimum design values.
 * SIMULATED: Property values are all the results of a simulation.
 * ASBUILT: Properties are all AS-BUILT values.
 * COMMISSIONING: Properties are all commissioning values.
 * MEASURED: Property values are all the results of a measurement device, either automated or manual.
 * USERDEFINED: Property values are defined by the user.
 * NOTDEFINED: Property values are not defined.
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/18 15:34
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcPropertySourceEnum {
    DESIGN,
    DESIGNMAXIMUM,
    DESIGNMINIMUM,
    SIMULATED,
    ASBUILT,
    COMMISSIONING,
    MEASURED,
    USERDEFINED,
    NOTKNOWN
}
