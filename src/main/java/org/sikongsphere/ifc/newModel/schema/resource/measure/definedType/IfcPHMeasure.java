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
package org.sikongsphere.ifc.newModel.schema.resource.measure.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.REAL;
import org.sikongsphere.ifc.newModel.datatype.STRING;

/**
 * A measure of the molar hydrogen ion concentration in a liquid (usually defined as the measure of acidity) in a range
 * from 0 to 14.
 * @author zaiyuan
 * @date 2022/12/07 21:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPHMeasure extends REAL {
    public IfcPHMeasure() {}

    public IfcPHMeasure(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcPHMeasure(STRING value) {
        super(value);
    }

    @Override
    public boolean illegal() {
        return getValue() >= 0.0 && getValue() <= 14.0;
    }
}
