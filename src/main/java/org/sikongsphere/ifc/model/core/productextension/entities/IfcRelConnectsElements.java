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
package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.resource.geometricconstraint.entity.IfcConnectionGeometry;

/**
 * IfcRelConnectsElements
 *
 * @author GaoSu
 * @date 2022/10/18 15:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelConnectsElements extends IfcRelConnects {
    private IfcConnectionGeometry connectionGeometry;
    private IfcElement relatingElement;
    private IfcElement relatedElement;

    public IfcRelConnectsElements() {}

    @IfcParserConstructor
    public IfcRelConnectsElements(
        IfcConnectionGeometry connectionGeometry,
        IfcElement relatingElement,
        IfcElement relatedElement
    ) {
        this.connectionGeometry = connectionGeometry;
        this.relatingElement = relatingElement;
        this.relatedElement = relatedElement;
    }

    public IfcConnectionGeometry getConnectionGeometry() {
        return connectionGeometry;
    }

    public void setConnectionGeometry(IfcConnectionGeometry connectionGeometry) {
        this.connectionGeometry = connectionGeometry;
    }

    public IfcElement getRelatingElement() {
        return relatingElement;
    }

    public void setRelatingElement(IfcElement relatingElement) {
        this.relatingElement = relatingElement;
    }

    public IfcElement getRelatedElement() {
        return relatedElement;
    }

    public void setRelatedElement(IfcElement relatedElement) {
        this.relatedElement = relatedElement;
    }
}
