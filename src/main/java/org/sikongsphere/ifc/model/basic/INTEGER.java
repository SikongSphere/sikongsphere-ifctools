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

import org.sikongsphere.ifc.model.IfcLeafNode;

/**
 * This class is used to encapsulate Integer information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public class INTEGER extends IfcLeafNode {
    public Integer value = 0;

    public INTEGER(Integer value) {
        this.value = value;
    }

    public INTEGER(STRING value) {
        this.value = new Integer(Integer.valueOf(value.value));
    }

}
