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
package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;

/**
 * The IfcProductRepresentation defines a representation of a product,
 * including its (geometric or topological) representation.
 *
 * @author stan
 * @date 2022/09/02 13:32
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcProductRepresentation extends IfcBodyTemplate {
    private IfcLabel name;
    private IfcText description;
    private SET<IfcRepresentation> representations;

    public IfcProductRepresentation() {}

    public IfcProductRepresentation(
        IfcLabel name,
        IfcText description,
        SET<IfcRepresentation> representations
    ) {
        this.name = name;
        this.description = description;
        this.representations = representations;
    }
}
