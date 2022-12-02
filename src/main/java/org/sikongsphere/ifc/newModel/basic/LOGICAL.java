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
package org.sikongsphere.ifc.newModel.basic;

import org.sikongsphere.ifc.newModel.body.IfcBodyTemplate;

/**
 * Boolean
 * @author Wang Bohong
 * @date 2022/9/1 16:09
 */
public class LOGICAL extends IfcBodyTemplate {
    private boolean value;

    public LOGICAL() {}

    public LOGICAL(boolean value) {
        this.value = value;
    }

    public LOGICAL(STRING value) {
        String str = value.value;
        if (str == null) return;
        if (str.indexOf("T") != -1) {
            this.value = true;
        } else if (str.indexOf("F") != -1) {
            this.value = false;
        }
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
