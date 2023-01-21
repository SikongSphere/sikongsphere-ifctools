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
import org.sikongsphere.ifc.model.IfcDataType;

import java.math.BigDecimal;

/**
 * @author Wang Bohong
 * @date 2022/11/13 11:45
 */
public class NUMBER extends IfcDataType {
    private BigDecimal value = new BigDecimal("0.0");

    public NUMBER() {}

    public NUMBER(DOUBLE value) {
        this.value = value.getValue();
    }

    @IfcParserConstructor
    public NUMBER(STRING value) {
        this.value = DOUBLE.parseValue(value);
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String str = this.value.toString();
        if (str.contains(StringConstant.DOT_U)) {
            String[] split = str.split(StringConstant.DOT_T);

            if (Double.parseDouble(split[1]) == 0) {
                return split[0] + StringConstant.DOT_U;
            } else return str;
        } else return str;
    }
}
