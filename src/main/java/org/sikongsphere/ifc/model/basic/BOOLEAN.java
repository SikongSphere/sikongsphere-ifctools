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
package org.sikongsphere.ifc.model.basic;

import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;

/**
 * @author Wang Bohong
 * @date 2022/10/25 12:08
 */
public class BOOLEAN extends IfcBodyTemplate {
    private boolean value;

    public BOOLEAN() {}

    public BOOLEAN(boolean value) {
        this.value = value;
    }

    @IfcParserConstructor
    public BOOLEAN(STRING value) {
        String str = value.value;
        if (str != null) {
            if(str.indexOf("T") != -1) {
                this.value = true;
            }
        }
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
