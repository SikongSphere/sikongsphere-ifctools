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
package org.sikongsphere.ifc.newModel;

import org.sikongsphere.ifc.common.exception.SikongSphereException;

import java.util.ArrayList;
import java.util.List;

/**
 *  This abstract class is mainly used to encapsulate file element
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
public abstract class IfcFileElement implements IfcInterface {
    protected List<IfcInterface> params = new ArrayList<>();

    public IfcFileElement() {}

    public IfcFileElement(List<IfcInterface> params) {
        this.params = params;
    }

    public List<IfcInterface> getParams() {
        return params;
    }

    public void setParams(List<IfcInterface> params) {
        this.params = params;
    }

    @Override
    public void check() {
        if (!illegal()) {
            throw new SikongSphereException("Value is illegal");
        }
    }

    @Override
    public boolean illegal() {
        return true;
    }
}
