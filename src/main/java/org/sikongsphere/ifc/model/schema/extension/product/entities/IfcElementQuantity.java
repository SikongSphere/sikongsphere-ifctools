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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcAssemblyPlaceEnum;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcElementAssemblyTypeEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.quantity.entity.IfcPhysicalQuantity;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcElementQuantity extends IfcPropertySetDefinition {
    @IfcOptionField
    private IfcLabel methodOfMeasurement;
    private SET<IfcPhysicalQuantity> quantities;

    @IfcParserConstructor
    public IfcElementQuantity(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel methodOfMeasurement,
        SET<IfcPhysicalQuantity> quantities
    ) {
        super(globalId, ownerHistory, name, description);
        this.methodOfMeasurement = methodOfMeasurement;
        this.quantities = quantities;
    }

    public IfcLabel getMethodOfMeasurement() {
        return methodOfMeasurement;
    }

    public void setMethodOfMeasurement(IfcLabel methodOfMeasurement) {
        this.methodOfMeasurement = methodOfMeasurement;
    }

    public SET<IfcPhysicalQuantity> getQuantities() {
        return quantities;
    }

    public void setQuantities(SET<IfcPhysicalQuantity> quantities) {
        this.quantities = quantities;
    }
}
