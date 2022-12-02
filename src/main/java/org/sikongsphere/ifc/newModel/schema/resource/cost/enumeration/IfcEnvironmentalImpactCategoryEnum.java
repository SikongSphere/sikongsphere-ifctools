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
package org.sikongsphere.ifc.newModel.schema.resource.cost.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcEnvironmentalImpactCategoryEnum defines the range of categories into which an environmental impact can be
 * broken down and from which the category required may be selected.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcEnvironmentalImpactCategoryEnum {
    /**
     * An environmental impact value is deduced from values in more than one category as a result of using the
     * applied value relationship.
     */
    COMBINEDVALUE,
    /**
     * An environmental impact value due to disposal.
     */
    DISPOSAL,
    /**
     * An environmental impact value due to extraction.
     */
    EXTRACTION,
    /**
     * An environmental impact value due to installation.
     */
    INSTALLATION,
    /**
     * An environmental impact value due to manufacture and manufacturing processes.
     */
    MANUFACTURE,
    /**
     * An environmental impact value due to manufacture and manufacturing processes.
     */
    TRANSPORTATION,
    USERDEFINED,
    NOTDEFINED
}
