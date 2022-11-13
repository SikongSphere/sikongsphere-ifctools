package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;

/**
 * Objectified relationship between an opening element and an building element that fills (or partially fills) the opening element.
 * @author Wang Bohong
 * @date 2022/11/11 16:07
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelFillsElement extends IfcRelConnects {
    private IfcOpeningElement relatingOpeningElement;
    private IfcElement relatedBuildingElement;

    public IfcRelFillsElement() {
    }

    @IfcParserConstructor
    public IfcRelFillsElement(IfcGloballyUniqueId globalId, IfcOwnerHistory ownerHistory, IfcLabel name, IfcText description, IfcOpeningElement relatingOpeningElement, IfcElement relatedBuildingElement) {
        super(globalId, ownerHistory, name, description);
        this.relatingOpeningElement = relatingOpeningElement;
        this.relatedBuildingElement = relatedBuildingElement;
    }
}
