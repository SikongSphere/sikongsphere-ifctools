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
 * This enumeration defines the type of thermal load for spaces or zones, as derived from various use cases.
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/18 15:34
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcThermalLoadTypeEnum {
    /**
     * Energy added or removed from air that affects its temperature.
     */
    SENSIBLE,
    /**
     * Energy added or removed from air that affects its humidity or concentration of water vapor.
     */
    LATENT,
    /**
     * Electromagnetic energy added or removed by emmission or absorption.
     */
    RADIANT,
    /**
     * Undefined thermal load type.
     */
    NOTDEFINED
}
