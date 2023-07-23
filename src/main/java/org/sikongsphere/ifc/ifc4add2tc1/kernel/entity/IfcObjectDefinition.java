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
package org.sikongsphere.ifc.ifc4add2tc1.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * An IfcObjectDefinition is the generalization of any semantically treated thing or process, either being a type or an occurrences. Object defintions can be named, using the inherited Name attribute, which should be a user recognizable label for the object occurrance. Further explanations to the object can be given using the inherited Description attribute. A context is a specific kind of object definition as it provides the project or library context in which object types and object occurrences are defined.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY, version = IfcVersion.IFC_4_ADD2_TC1)
public class IfcObjectDefinition {

}
