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
package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.resource.presentationappearance.selecttype.IfcFillAreaStyleTileShapeSelect;

/**
 * The fill area style tiles defines a two dimensional tile
 * to be used for the filling of annotation fill areas or other closed regions.
 *
 * @author Wang Bohong
 * @date 2022/9/2 11:25
 */
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