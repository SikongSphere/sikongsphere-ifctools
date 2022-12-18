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
package org.sikongsphere.ifc.model.schema.shared.sharedbldgelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuildingElementType;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.sharedbldgelements.enumeration.IfcRailingTypeEnum;

/**
 * The element type (IfcRailingType) defines a list of commonly shared property set definitions of a railing element and
 * an optional set of product representations. It is used to define a railing specification (i.e. the specific product
 * information, that is common to all occurrences of that product type).
 * @author Kuang Tianyu
 * @date 2022/12/18 16:47
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcRailingType extends IfcBuildingElementType {
    private IfcRailingTypeEnum predefinedType;

    public IfcRailingType() {}

    @IfcParserConstructor
    public IfcRailingType(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel applicableOccurrence,
        SET<IfcPropertySetDefinition> hasPropertySets,
        LIST<IfcRepresentationMap> representationMaps,
        IfcLabel tag,
        IfcLabel elementType,
        IfcRailingTypeEnum predefinedType
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            applicableOccurrence,
            hasPropertySets,
            representationMaps,
            tag,
            elementType
        );
        this.predefinedType = predefinedType;
    }

    public IfcRailingTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcRailingTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
