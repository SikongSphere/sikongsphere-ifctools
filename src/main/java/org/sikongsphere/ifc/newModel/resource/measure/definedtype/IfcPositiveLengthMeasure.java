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
package org.sikongsphere.ifc.newModel.resource.measure.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.basic.DOUBLE;
import org.sikongsphere.ifc.newModel.basic.STRING;
import org.sikongsphere.ifc.newModel.resource.measure.selecttypes.IfcValue;

/**
 * A positive length measure is a length measure that is greater than zero.
 *
 * @author stan
 * @date 2022/09/01 23:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE)
public class IfcPositiveLengthMeasure extends DOUBLE implements IfcValue {

    public IfcPositiveLengthMeasure() {}

    public IfcPositiveLengthMeasure(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcPositiveLengthMeasure(STRING value) {
        super(value);
    }
}
