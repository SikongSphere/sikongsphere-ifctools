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
package org.sikongsphere.ifc.model.resource.presentation.entity;

import org.sikongsphere.ifc.model.resource.externalreference.entity.IfcExternalReference;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * The externally defined text font is an external reference to a text font
 *
 * @author stan
 * @date 2022/09/02 13:15
 */
public class IfcExternallyDefinedTextFont extends IfcExternalReference {
    public IfcExternallyDefinedTextFont() {}

    public IfcExternallyDefinedTextFont(
        IfcLabel location,
        IfcIdentifier itemReference,
        IfcLabel name
    ) {
        super(location, itemReference, name);
    }
}
