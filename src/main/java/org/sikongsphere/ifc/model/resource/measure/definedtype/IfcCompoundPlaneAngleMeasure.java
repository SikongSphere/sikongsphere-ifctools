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
package org.sikongsphere.ifc.model.resource.measure.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.exception.SikongSphereException;
import org.sikongsphere.ifc.model.basic.INTEGER;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.STRING;

/**
 * @author Wang Bohong
 * @date 2022/10/14 16:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcCompoundPlaneAngleMeasure {
    private LIST<INTEGER> value;

    public LIST<INTEGER> getValue() {
        return value;
    }

    public IfcCompoundPlaneAngleMeasure() {}

    // public IfcCompoundPlaneAngleMeasure(LIST<INTEGER> value) {
    // if (!isValid(value)) throw new SikongSphereException();
    // this.value = value;
    // }

    /* TODO 如果通过Integer类型传参，如何处理？*/
    @IfcParserConstructor
    public IfcCompoundPlaneAngleMeasure(LIST<STRING> strs) {
        LIST<INTEGER> list = new LIST<>();
        for (int i = 0; i < strs.size(); i++) {
            list.add(new INTEGER(Integer.valueOf(strs.get(i).value)));
        }
        if (!isValid(list)) throw new SikongSphereException();
        this.value = list;
    }

    private boolean isValid(LIST<INTEGER> value) {
        // if (value.size() != 3) return false;
        if (value.get(0).value < -360 || value.get(0).value >= 360) return false;
        if (value.get(1).value < -60 || value.get(1).value >= 60) return false;
        if (value.get(2).value < -60 || value.get(2).value >= 60) return false;
        if (value.get(0).value >= 0 && value.get(1).value >= 0 && value.get(2).value >= 0)
            return true;
        if (value.get(0).value <= 0 && value.get(1).value <= 0 && value.get(2).value <= 0)
            return true;
        return false;
    }
}
