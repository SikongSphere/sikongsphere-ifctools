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
package org.sikongsphere.ifc.model;

import org.sikongsphere.ifc.common.exception.SikongSphereException;

/**
 * This abstract class is mainly used to encapsulate data type
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
public abstract class IfcDataType implements IfcInterface {

    public boolean isDefault() {
        return false;
    }

    @Override
    public boolean illegal() {
        return true;
    }

    @Override
    public void check() {
        if (!illegal()) {
            throw new SikongSphereException("Value is illegal");
        }
    }
}
