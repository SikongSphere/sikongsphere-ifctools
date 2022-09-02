package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.resource.presentationdefinition.entity.IfcAnnotationSymbolOccurrence;

/**
 * The fill area style tile symbol with style is a symbol that is used as a tile within an annotated tiling.
 *
 * @author Wang Bohong
 * @date 2022/9/2 11:34
 */
public class IfcFillAreaStyleTileSymbolWithStyle extends IfcGeometricRepresentationItem {
    private IfcAnnotationSymbolOccurrence Symbol;

    public IfcFillAreaStyleTileSymbolWithStyle() {
    }

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
