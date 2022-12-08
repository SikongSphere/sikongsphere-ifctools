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
package org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.selecttype.IfcFillAreaStyleTileShapeSelect;

/**
 * The fill area style tiles defines a two dimensional tile
 * to be used for the filling of annotation fill areas or other closed regions.
 *
 * @author Wang Bohong
 * @date 2022/9/2 11:25
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcFillAreaStyleTiles extends IfcGeometricRepresentationItem {
    private IfcOneDirectionRepeatFactor tilingPattern;
    private SET<IfcFillAreaStyleTileShapeSelect> tiles;
    private IfcPositiveRatioMeasure tilingScale;

    public IfcFillAreaStyleTiles() {}

    public IfcFillAreaStyleTiles(
        IfcOneDirectionRepeatFactor tilingPattern,
        SET<IfcFillAreaStyleTileShapeSelect> tiles,
        IfcPositiveRatioMeasure tilingScale
    ) {
        this.tilingPattern = tilingPattern;
        this.tiles = tiles;
        this.tilingScale = tilingScale;
    }

    public IfcOneDirectionRepeatFactor getTilingPattern() {
        return tilingPattern;
    }

    public void setTilingPattern(IfcOneDirectionRepeatFactor tilingPattern) {
        this.tilingPattern = tilingPattern;
    }

    public SET<IfcFillAreaStyleTileShapeSelect> getTiles() {
        return tiles;
    }

    public void setTiles(SET<IfcFillAreaStyleTileShapeSelect> tiles) {
        this.tiles = tiles;
    }

    public IfcPositiveRatioMeasure getTilingScale() {
        return tilingScale;
    }

    public void setTilingScale(IfcPositiveRatioMeasure tilingScale) {
        this.tilingScale = tilingScale;
    }
}
