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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.topology.selectType.IfcShell;

/**
 * In the current IFC Release only poly loops (IfcPolyLoop) are defined for bounds of face bound (IfcFaceBound). This will allow for faceted B-rep only.
 *
 * @author GaoSU
 * @date 2022/11/01 23:09
 * @modified stan
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcClosedShell extends IfcConnectedFaceSet implements IfcShell {

    @IfcParserConstructor
    public IfcClosedShell(SET<IfcFace> cfsFaces) {
        super(cfsFaces);
    }
}
