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
package org.sikongsphere.ifc.newModel.schema.resource.externalreference.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.externalreference.selectType.IfcDocumentSelect;
import org.sikongsphere.ifc.newModel.schema.resource.externalreference.selectType.IfcLibrarySelect;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;

/**
 * @author zaiyuan
 * @date 2022/10/26
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcLibraryReference extends IfcExternalReference implements IfcLibrarySelect {
    @IfcInverseParameter
    private SET<IfcLibraryInformation> referenceIntoLibrary;

    @IfcParserConstructor
    public IfcLibraryReference(IfcLabel location, IfcIdentifier itemReference, IfcLabel name) {
        super(location, itemReference, name);
    }

    public SET<IfcLibraryInformation> getReferenceIntoLibrary() {
        return referenceIntoLibrary;
    }

    public void setReferenceIntoLibrary(SET<IfcLibraryInformation> referenceIntoLibrary) {
        this.referenceIntoLibrary = referenceIntoLibrary;
    }
}
