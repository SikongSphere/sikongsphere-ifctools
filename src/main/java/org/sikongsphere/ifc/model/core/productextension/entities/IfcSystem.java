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
package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcGroup;

/**
 * Organized combination of related parts within an AEC product, composed for a common purpose or function
 * or to provide a service. System is essentially a functionally related aggregation of products.
 *
 * @author stan
 * @date 2022/09/02 13:36
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcSystem extends IfcGroup {
    private SET<IfcRelServicesBuildings> serviceBuildings;

    public IfcSystem() {}

    public IfcSystem(SET<IfcRelServicesBuildings> serviceBuildings) {
        this.serviceBuildings = serviceBuildings;
    }

    public SET<IfcRelServicesBuildings> getServiceBuildings() {
        return serviceBuildings;
    }

    public void setServiceBuildings(SET<IfcRelServicesBuildings> serviceBuildings) {
        this.serviceBuildings = serviceBuildings;
    }
}
