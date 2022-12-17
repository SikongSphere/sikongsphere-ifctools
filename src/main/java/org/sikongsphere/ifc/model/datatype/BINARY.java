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

import org.sikongsphere.ifc.model.IfcDataType;

/**
 * This class is used to encapsulate BINARY information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public class BINARY extends IfcDataType {
    public Integer value = 0;

    public BINARY(Integer value) {
        this.value = value;
    }

    public BINARY(BINARY value) {
        this.value = value.value;
    }

    public BINARY(STRING value) {
        this.value = Integer.valueOf(value.value);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean isDefault() {
        return this.value == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
