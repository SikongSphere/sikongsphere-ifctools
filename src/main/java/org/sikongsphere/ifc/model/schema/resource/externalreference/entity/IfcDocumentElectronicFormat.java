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
package org.sikongsphere.ifc.model.schema.resource.externalreference.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * @author zaiyuan
 * @date 2022/10/26
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDocumentElectronicFormat extends IfcAbstractClass {
    @IfcOptionField
    private IfcLabel fileExtension;
    @IfcOptionField
    private IfcLabel mimeContentType;
    @IfcOptionField
    private IfcLabel MimeSubtype;

    @IfcParserConstructor
    public IfcDocumentElectronicFormat(
        IfcLabel fileExtension,
        IfcLabel mimeContentType,
        IfcLabel mimeSubtype
    ) {
        this.fileExtension = fileExtension;
        this.mimeContentType = mimeContentType;
        MimeSubtype = mimeSubtype;
    }

    public IfcLabel getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(IfcLabel fileExtension) {
        this.fileExtension = fileExtension;
    }

    public IfcLabel getMimeContentType() {
        return mimeContentType;
    }

    public void setMimeContentType(IfcLabel mimeContentType) {
        this.mimeContentType = mimeContentType;
    }

    public IfcLabel getMimeSubtype() {
        return MimeSubtype;
    }

    public void setMimeSubtype(IfcLabel mimeSubtype) {
        MimeSubtype = mimeSubtype;
    }
}
