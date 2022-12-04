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

import org.sikongsphere.ifc.newModel.IfcDataType;

/**
 * @author Wang Bohong
 * @date 2022/11/1 13:27
 */
public class DOUBLE extends IfcDataType {
    public double value = 0.0;

    public DOUBLE() {}

    public DOUBLE(double value) {
        this.value = value;
    }

    public DOUBLE(DOUBLE value) {
        this.value = value.value;
    }

    public DOUBLE(SCIENTIFICNOTATION value) {
        this.value = value.getDouble();
    }

    public DOUBLE(STRING value) {
        String str = value.value;
        if (str != null && str.charAt(str.length() - 1) == '.') {
            str = str.substring(0, str.length() - 1);
        }

        this.value = (str == null) ? 0.0 : Double.parseDouble(str);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
