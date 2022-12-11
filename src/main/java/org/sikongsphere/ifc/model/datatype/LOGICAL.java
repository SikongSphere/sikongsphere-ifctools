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

import org.sikongsphere.ifc.common.constant.IntegerConstant;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.model.IfcDataType;

/**
 * Boolean
 * @author Wang Bohong
 * @date 2022/9/1 16:09
 */
public class LOGICAL extends IfcDataType {
    private int value;

    public LOGICAL() {}

    public LOGICAL(int value) {
        this.value = value;
    }

    public LOGICAL(STRING value) {
        String str = value.value;
        if (str == null) return;
        if (str.contains("T")) {
            this.value = IntegerConstant.TRUE;
        } else if (str.contains("F")) {
            this.value = IntegerConstant.FALSE;
        } else if (str.contains("U")) {
            this.value = IntegerConstant.UNKNOWN;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {

        String flag = null;

        switch (value) {
            case IntegerConstant.TRUE:
                flag = StringConstant.TRUE;
                break;

            case IntegerConstant.FALSE:
                flag = StringConstant.FALSE;
                break;

            case IntegerConstant.UNKNOWN:
                flag = StringConstant.UNKNOWN;
                break;
        }

        return String.format(".%s.", flag);
    }
}
