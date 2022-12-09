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
 * @author zaiyuan
 * @date 2022/12/07 21:45
 */
public class COMPLEX extends IfcDataType {
    private REAL[] value;

    public REAL[] getValue() {
        return value;
    }

    public void setValue(REAL[] value) {
        this.value = value;
    }
}
