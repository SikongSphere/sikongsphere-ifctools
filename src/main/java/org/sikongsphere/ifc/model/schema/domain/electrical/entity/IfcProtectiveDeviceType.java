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
package org.sikongsphere.ifc.model.schema.domain.electrical.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.domain.electrical.enumeration.IfcProtectiveDeviceTypeEnum;
import org.sikongsphere.ifc.model.schema.shared.sharedbldgservices.entity.IfcFlowControllerType;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcProtectiveDeviceType extends IfcFlowControllerType {
    private IfcProtectiveDeviceTypeEnum predefinedType;

    @IfcParserConstructor
    public IfcProtectiveDeviceType(IfcProtectiveDeviceTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public IfcProtectiveDeviceTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcProtectiveDeviceTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
