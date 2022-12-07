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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.externalreference.selectType.IfcClassificationNotationSelect;

/**
 * @author zaiyuan
 * @date 2022/10/26
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcClassificationNotation extends IfcAbstractClass
    implements
        IfcClassificationNotationSelect {
    private SET<IfcClassificationNotationFacet> notationFacets;

    @IfcParserConstructor
    public IfcClassificationNotation(SET<IfcClassificationNotationFacet> notationFacets) {
        this.notationFacets = notationFacets;
    }

    public SET<IfcClassificationNotationFacet> getNotationFacets() {
        return notationFacets;
    }

    public void setNotationFacets(SET<IfcClassificationNotationFacet> notationFacets) {
        this.notationFacets = notationFacets;
    }
}
