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
package org.sikongsphere.ifc.model.datatype;

import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

import java.math.BigDecimal;

/**
 * @author zaiyuan
 * @date 2022/12/07 21:45
 */
public class REAL extends DOUBLE implements IfcValue {

    public REAL() {}

    public REAL(double value) {
        super(value);
    }

    public REAL(BigDecimal value) {
        super(value);
    }

    // todo init with scientificnotation

    public REAL(INTEGER value) {
        super(DOUBLE.parseValue(value));
    }

    public REAL(DOUBLE value) {
        super(value);
    }

    public REAL(String value) {
        super(DOUBLE.parseValue(value));
    }

    @IfcParserConstructor
    public REAL(STRING value) {
        super(DOUBLE.parseValue(value));
    }

}
