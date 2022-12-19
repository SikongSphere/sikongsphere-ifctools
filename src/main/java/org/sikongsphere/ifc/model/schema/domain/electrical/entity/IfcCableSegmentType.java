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
import org.sikongsphere.ifc.model.schema.domain.electrical.enumeration.IfcCableCarrierSegmentTypeEnum;
import org.sikongsphere.ifc.model.schema.domain.electrical.enumeration.IfcCableSegmentTypeEnum;
import org.sikongsphere.ifc.model.schema.shared.sharedbldgservices.entity.IfcFlowSegmentType;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcCableSegmentType extends IfcFlowSegmentType {
    private IfcCableSegmentTypeEnum predefinedType;

    @IfcParserConstructor
    public IfcCableSegmentType(IfcCableSegmentTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public IfcCableSegmentTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcCableSegmentTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
