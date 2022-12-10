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
package org.sikongsphere.ifc.model.schema.extension.product.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcGroup;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * Organized combination of related parts within an AEC product, composed for a common purpose or function
 * or to provide a service. System is essentially a functionally related aggregation of products.
 *
 * @author stan
 * @date 2022/09/02 13:36
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcSystem extends IfcGroup {
    @IfcInverseParameter
    private SET<IfcRelServicesBuildings> serviceBuildings;

    @IfcParserConstructor
    public IfcSystem(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType
    ) {
        super(globalId, ownerHistory, name, description, objectType);
    }

    public SET<IfcRelServicesBuildings> getServiceBuildings() {
        return serviceBuildings;
    }

    public void setServiceBuildings(SET<IfcRelServicesBuildings> serviceBuildings) {
        this.serviceBuildings = serviceBuildings;
    }
}
