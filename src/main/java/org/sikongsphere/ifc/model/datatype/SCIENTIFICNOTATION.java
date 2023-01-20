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

import java.math.BigDecimal;

/**
 * @author Wang Bohong
 * @date 2022/10/25 12:08
 */
public class SCIENTIFICNOTATION extends REAL {
    private BigDecimal mantissa;
    private Integer index;

    public SCIENTIFICNOTATION() {}

    @IfcParserConstructor
    public SCIENTIFICNOTATION(STRING value) {
        String[] es = value.getValue().split(StringConstant.SCI_NOTATION);
        this.mantissa = DOUBLE.parseValue(es[0].trim());
        this.index = Integer.parseInt(es[1].trim());
    }

    public SCIENTIFICNOTATION(BigDecimal mantissa, int index) {
        this.mantissa = mantissa;
        this.index = index;
    }

    public BigDecimal getMantissa() {
        return mantissa;
    }

    public void setMantissa(BigDecimal mantissa) {
        this.mantissa = mantissa;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public BigDecimal getValue() {

        return mantissa.multiply(BigDecimal.valueOf(Math.pow(10, index)));
    }

    @Override
    public String toString() {
        String format = String.format("%sE%s%s", mantissa, index >= 0 ? "+" : "-", Math.abs(index));

        return format;
    }
}
