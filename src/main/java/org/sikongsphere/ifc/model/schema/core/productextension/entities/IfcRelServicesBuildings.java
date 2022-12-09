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
package org.sikongsphere.ifc.model.schema.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.core.kernel.entity.IfcRelConnects;

/**
 * An objectified relationship that
 * defines the relationship between a system and the sites, buildings, storeys or spaces, it serves.
 *
 * @author stan
 * @date 2022/09/02 13:35
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcRelServicesBuildings extends IfcRelConnects {
    private IfcSystem relatingSystem;
    private SET<IfcSpatialStructureElement> relatedBuildings;

    public IfcRelServicesBuildings() {}

    public IfcRelServicesBuildings(
        IfcSystem relatingSystem,
        SET<IfcSpatialStructureElement> relatedBuildings
    ) {
        this.relatingSystem = relatingSystem;
        this.relatedBuildings = relatedBuildings;
    }

    public IfcSystem getRelatingSystem() {
        return relatingSystem;
    }

    public void setRelatingSystem(IfcSystem relatingSystem) {
        this.relatingSystem = relatingSystem;
    }

    public SET<IfcSpatialStructureElement> getRelatedBuildings() {
        return relatedBuildings;
    }

    public void setRelatedBuildings(SET<IfcSpatialStructureElement> relatedBuildings) {
        this.relatedBuildings = relatedBuildings;
    }
}
