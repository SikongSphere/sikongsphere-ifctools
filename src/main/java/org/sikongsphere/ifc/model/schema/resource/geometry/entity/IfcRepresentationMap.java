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
package org.sikongsphere.ifc.model.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcAxis2Placement;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcRepresentation;

/**
 * IfcRepresentationMap
 *
 * @author GaoSu
 * @date 2022/10/20 15:18
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRepresentationMap extends IfcAbstractClass {

    private IfcAxis2Placement mappingOrigin;

    private IfcRepresentation mappedRepresentation;

    public IfcRepresentationMap() {}

    @IfcParserConstructor
    public IfcRepresentationMap(
        IfcAxis2Placement mappingOrigin,
        IfcRepresentation mappedRepresentation
    ) {
        this.mappingOrigin = mappingOrigin;
        this.mappedRepresentation = mappedRepresentation;
    }

    public IfcRepresentation getMappedRepresentation() {
        return mappedRepresentation;
    }

    public void setMappedRepresentation(IfcRepresentation mappedRepresentation) {
        this.mappedRepresentation = mappedRepresentation;
    }

    public IfcAxis2Placement getMappingOrigin() {
        return mappingOrigin;
    }

    public void setMappingOrigin(IfcAxis2Placement mappingOrigin) {
        this.mappingOrigin = mappingOrigin;
    }
}
