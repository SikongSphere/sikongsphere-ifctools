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
package org.sikongsphere.ifc.ifc4add2tc1.extension.ifcproductextension.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcFeatureElementSubtraction is specialization ofthe general feature element, that represents an existence dependentelements which modifies the shape and appearance of the associatedmaster element. The IfcFeatureElementSubtraction offers theability to handle shape modifiers as semantic objects within theIFC object model that subtract from the shape of the masterelement.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.EXTENSION, type = IfcType.ENTITY, version = IfcVersion.IFC_4_ADD2_TC1)
public class IfcFeatureElementSubtraction {

}
