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

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.model.IfcDataType;

import java.math.BigDecimal;

/**
 * In order to avoid mistake due to double, we have to use BigDecimal instead of Double.
 *
 * @author Wang Bohong
 * @date 2022/11/1 13:27
 * @modified stan
 */
public class DOUBLE extends IfcDataType {

    private BigDecimal value = new BigDecimal("0.0");

    public DOUBLE() {}

    public DOUBLE(double value) {
        this.value = new BigDecimal(value);
    }

    public DOUBLE(DOUBLE value) {
        this.value = value.value;
    }

    // todo init with scientificnotation

    public DOUBLE(BigDecimal value) {
        this.value = value;
    }

    public DOUBLE(STRING value) {
        this.value = DOUBLE.parseValue(value);
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public boolean isDefault() {
        int compare = this.value.compareTo(BigDecimal.ZERO);

        return compare == 0;
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

    public static BigDecimal parseValue(String value) {

        if (value.equals(StringConstant.ZERO_DOUBLE)) return BigDecimal.valueOf(
            Double.parseDouble(value)
        );
        else return DOUBLE.parseValue(new STRING(value));
    }

    public static BigDecimal parseValue(STRING value) {
        if (value.getValue().length() <= 15) {
            return BigDecimal.valueOf(Double.parseDouble(value.getValue()));
        } else return new BigDecimal(value.value);
    }

    public static BigDecimal parseValue(Integer value) {

        return new BigDecimal(value);
    }

    public static BigDecimal parseValue(INTEGER value) {

        return new BigDecimal(value.getValue());
    }

    public static DOUBLE parseValue(double value) {
        return new DOUBLE(BigDecimal.valueOf(value));
    }
}
