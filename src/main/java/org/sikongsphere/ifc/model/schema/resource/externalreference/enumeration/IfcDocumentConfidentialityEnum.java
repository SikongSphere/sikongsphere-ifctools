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
package org.sikongsphere.ifc.model.schema.resource.externalreference.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * IfcDocumentConfidentialityEnum enables selection of the level of confidentiality of document information from
 * a list of choices. time.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcDocumentConfidentialityEnum {
    /**
     *	Document is publicly available.
     */
    PUBLIC,
    /**
     *	Document availability is restricted.
     */
    RESTRICTED,
    /**
     *	Document is confidential and its contents should not be revealed without permission.
     */
    CONFIDENTIAL,
    /**
     *	Document is personal to the author.
     */
    PERSONAL,
    USERDEFINED,
    NOTDEFINED
}
