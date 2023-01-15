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
package org.sikongsphere.ifc.model.schema.resource.topology.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.topology.selectType.IfcShell;

/**
 * An open shell is a shell of the dimensionality 2. Its domain, if present, is a finite, connected, oriented,
 * 2-manifold with boundary, but is not a closed surface. It can be thought of as a closed shell with one or
 * more holes punched in it.
 *
 * @author zaiyuan
 * @date 2022/12/10 13:40
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcOpenShell extends IfcConnectedFaceSet implements IfcShell {}
