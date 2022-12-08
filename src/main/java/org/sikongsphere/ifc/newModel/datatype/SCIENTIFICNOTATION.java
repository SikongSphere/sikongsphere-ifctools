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
package org.sikongsphere.ifc.newModel.datatype;

import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.newModel.IfcDataType;

/**
 * @author Wang Bohong
 * @date 2022/10/25 12:08
 */
public class SCIENTIFICNOTATION extends DOUBLE {
    private double mantissa;
    private int index;

    public SCIENTIFICNOTATION() {}

    @IfcParserConstructor
    public SCIENTIFICNOTATION(STRING value) {
        String[] es = value.getValue().split(StringConstant.SCI_NOTATION);
        this.mantissa = Double.parseDouble(es[0].trim());
        this.index = Integer.parseInt(es[1].trim());
    }

    public SCIENTIFICNOTATION(double mantissa, int index) {
        this.mantissa = mantissa;
        this.index = index;
    }

    public double getMantissa() {
        return mantissa;
    }

    public void setMantissa(double mantissa) {
        this.mantissa = mantissa;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Integer getInteger() {
        return (int) (mantissa * Math.pow(10, index));
    }

    public Double getDouble() {
        return mantissa * Math.pow(10, index);
    }

    @Override
    public String toString() {
        return mantissa + StringConstant.SCI_NOTATION + StringConstant.DIFFER + index;
    }
}
