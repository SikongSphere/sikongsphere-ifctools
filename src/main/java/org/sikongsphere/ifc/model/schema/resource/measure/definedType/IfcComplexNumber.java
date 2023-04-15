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
package org.sikongsphere.ifc.model.schema.resource.measure.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcDataType;
import org.sikongsphere.ifc.model.datatype.INTEGER;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.REAL;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcMeasureValue;

/**
 * Representation of a complex number expressed as an array with two elements.
 * @author yiwei
 * @date 2023/1/13 21:38
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcComplexNumber extends LIST<REAL> implements IfcMeasureValue {

    private LIST<REAL> value;

    @IfcParserConstructor
    public IfcComplexNumber(LIST<IfcDataType> objs) {
        LIST<REAL> list = new LIST<>();
        for (int i = 0; i < list.size(); i++) {
            if (objs.get(i) instanceof STRING) {
                list.add(new REAL((STRING) objs.get(i)));
            } else if (objs.get(i) instanceof INTEGER) {
                list.add(new REAL((INTEGER) objs.get(i)));
            }
        }

        this.value = list;
    }
}
