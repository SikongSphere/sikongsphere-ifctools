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
package org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcReal;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSurfaceStyleElementSelect;

/**
 * IfcSurfaceStyleRefraction extends the surface style lighting, or the surface style rendering definition
 * for properties for calculation of physically exact illuminance by adding seldomly used properties.
 *
 * @author stan
 * @date 2022/09/02 13:26
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSurfaceStyleRefraction implements IfcSurfaceStyleElementSelect {
    @IfcOptionField
    private IfcReal refractionIndex;
    @IfcOptionField
    private IfcReal dispersionFactor;

    public IfcSurfaceStyleRefraction() {}

    @IfcParserConstructor
    public IfcSurfaceStyleRefraction(IfcReal refractionIndex, IfcReal dispersionFactor) {
        this.refractionIndex = refractionIndex;
        this.dispersionFactor = dispersionFactor;
    }

    public IfcReal getRefractionIndex() {
        return refractionIndex;
    }

    public void setRefractionIndex(IfcReal refractionIndex) {
        this.refractionIndex = refractionIndex;
    }

    public IfcReal getDispersionFactor() {
        return dispersionFactor;
    }

    public void setDispersionFactor(IfcReal dispersionFactor) {
        this.dispersionFactor = dispersionFactor;
    }
}
