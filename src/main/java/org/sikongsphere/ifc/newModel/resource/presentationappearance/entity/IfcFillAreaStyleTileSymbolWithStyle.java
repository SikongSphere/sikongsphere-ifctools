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
package org.sikongsphere.ifc.newModel.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.newModel.resource.presentationdefinition.entity.IfcAnnotationSymbolOccurrence;

/**
 * The fill area style tile symbol with style is a symbol that is used as a tile within an annotated tiling.
 *
 * @author Wang Bohong
 * @date 2022/9/2 11:34
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcFillAreaStyleTileSymbolWithStyle extends IfcGeometricRepresentationItem {
    private IfcAnnotationSymbolOccurrence Symbol;

    public IfcFillAreaStyleTileSymbolWithStyle() {}

    public IfcFillAreaStyleTileSymbolWithStyle(IfcAnnotationSymbolOccurrence symbol) {
        Symbol = symbol;
    }

    public IfcAnnotationSymbolOccurrence getSymbol() {
        return Symbol;
    }

    public void setSymbol(IfcAnnotationSymbolOccurrence symbol) {
        Symbol = symbol;
    }
}
