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
package org.sikongsphere.ifc.model.schema.resource.topology.entity;

import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcSurface;

/**
 * @author:stan
 * @date:2023/1/15 0:26
 */
public class IfcFaceSurface extends IfcFace {

    private IfcSurface faceSurface;

    private BOOLEAN sameSense;

    @IfcParserConstructor
    public IfcFaceSurface(SET<IfcFaceBound> bounds, IfcSurface faceSurface, BOOLEAN sameSense) {
        super(bounds);
        this.faceSurface = faceSurface;
        this.sameSense = sameSense;
    }

    public IfcSurface getFaceSurface() {
        return faceSurface;
    }

    public void setFaceSurface(IfcSurface faceSurface) {
        this.faceSurface = faceSurface;
    }

    public BOOLEAN getSameSense() {
        return sameSense;
    }

    public void setSameSense(BOOLEAN sameSense) {
        this.sameSense = sameSense;
    }
}
