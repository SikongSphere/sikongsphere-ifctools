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

/**
 * This class is used to encapsulate string information
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
public class STRING extends IfcDataType {
    public String value = "";

    public STRING() {}

    public STRING(String value) {
        this.value = value;
    }

    public STRING(DOUBLE value) {
        this.value = value.getValue() + "";
    }

    public STRING(INTEGER value) {
        this.value = value.getValue() + "";
    }

    public STRING(STRING value) {
        this.value = value.value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return StringConstant.QUOTE + value + StringConstant.QUOTE;
    }
}
