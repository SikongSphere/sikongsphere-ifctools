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
import org.sikongsphere.ifc.model.schema.domain.electrical.enumeration.IfcElectricHeaterTypeEnum;
import org.sikongsphere.ifc.model.schema.shared.sharedbldgservices.entity.IfcFlowTerminalType;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcElectricHeaterType extends IfcFlowTerminalType {
    private IfcElectricHeaterTypeEnum predefinedType;

    @IfcParserConstructor
    public IfcElectricHeaterType(IfcElectricHeaterTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public IfcElectricHeaterTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcElectricHeaterTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
