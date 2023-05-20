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

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.sikongsphere.ifc.io.serializer.INTEGERSerializer;
import org.sikongsphere.ifc.model.IfcDataType;

/**
 * This class is used to encapsulate Integer information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@JsonSerialize(using = INTEGERSerializer.class)
public class INTEGER extends IfcDataType {
    public Integer value = 0;

    public INTEGER(){}

    public INTEGER(Integer value) {
        this.value = value;
    }

    public INTEGER(INTEGER value) {
        this.value = value.value;
    }

    public INTEGER(STRING value) {
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
