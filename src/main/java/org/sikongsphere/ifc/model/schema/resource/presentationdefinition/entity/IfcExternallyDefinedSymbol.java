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
package org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.externalreference.entity.IfcExternalReference;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.selectType.IfcDefinedSymbolSelect;

/**
 * An externally defined symbol is a symbol that gets its shape information by an agreed
 * reference to an external source.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcExternallyDefinedSymbol extends IfcExternalReference
    implements
        IfcDefinedSymbolSelect {
    public IfcExternallyDefinedSymbol() {}

    @IfcParserConstructor
    public IfcExternallyDefinedSymbol(
        IfcLabel location,
        IfcIdentifier itemReference,
        IfcLabel name
    ) {
        super(location, itemReference, name);
    }
}
