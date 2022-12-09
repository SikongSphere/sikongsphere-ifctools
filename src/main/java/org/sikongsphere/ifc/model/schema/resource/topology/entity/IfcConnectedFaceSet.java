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

/**
 * @author GaoSU
 * @date 2022/11/01 23:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcConnectedFaceSet extends IfcTopologicalRepresentationItem {
    private SET<IfcFace> cfsFaces;

    public IfcConnectedFaceSet() {}

    @IfcParserConstructor
    public IfcConnectedFaceSet(SET<IfcFace> cfsFaces) {
        this.cfsFaces = cfsFaces;
    }

    public SET<IfcFace> getCfsFaces() {
        return cfsFaces;
    }

    public void setCfsFaces(SET<IfcFace> cfsFaces) {
        this.cfsFaces = cfsFaces;
    }
}
