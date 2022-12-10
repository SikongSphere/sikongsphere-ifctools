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
package org.sikongsphere.ifc.model.schema.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * The IfcProductRepresentation defines a representation of a product,
 * including its (geometric or topological) representation.
 *
 * @author stan
 * @date 2022/09/02 13:32
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcProductRepresentation extends IfcAbstractClass {
    @IfcOptionField
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    private LIST<IfcRepresentation> representations;

    public IfcProductRepresentation() {}

    @IfcParserConstructor
    public IfcProductRepresentation(
        IfcLabel name,
        IfcText description,
        LIST<IfcRepresentation> representations
    ) {
        this.name = name;
        this.description = description;
        this.representations = representations;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public LIST<IfcRepresentation> getRepresentations() {
        return representations;
    }

    public void setRepresentations(LIST<IfcRepresentation> representations) {
        this.representations = representations;
    }
}
