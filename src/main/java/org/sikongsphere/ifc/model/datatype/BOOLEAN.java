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

/**
 * @author Wang Bohong
 * @date 2022/10/25 12:08
 */
public class BOOLEAN extends IfcDataType {
    private boolean value;

    public BOOLEAN() {}

    public BOOLEAN(boolean value) {
        this.value = value;
    }

    @IfcParserConstructor
    public BOOLEAN(STRING value) {
        String str = value.value;
        if (str != null) {
            if (str.contains("T")) {
                this.value = true;
            }
        }
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(STRING value) {
        String str = value.value;
        if (str != null) {
            if (str.contains("T")) {
                this.value = true;
            }
        }
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String flag;
        if (value) {
            flag = StringConstant.TRUE;
        } else {
            flag = StringConstant.FALSE;
        }
        return String.format(".%s.", flag);
    }
}
