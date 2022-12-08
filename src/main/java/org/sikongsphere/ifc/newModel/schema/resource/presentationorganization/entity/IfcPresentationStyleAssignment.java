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
package org.sikongsphere.ifc.newModel.schema.resource.presentationorganization.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.entity.IfcSurfaceStyleRendering;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.selecttype.IfcPresentationStyleSelect;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.selecttype.IfcSurfaceStyleElementSelect;

import java.util.Locale;
import java.util.Set;

/**
 * The presentation style assignment is a set of styles which are assigned to styled items
 * for the purpose of presenting these styled items.
 *
 * @author stan
 * @date 2022/09/14 23:26
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPresentationStyleAssignment extends IfcAbstractClass {
    private SET<IfcPresentationStyleSelect> styles;

    public IfcPresentationStyleAssignment() {}

    @IfcParserConstructor
    public IfcPresentationStyleAssignment(SET<IfcPresentationStyleSelect> styles) {
        this.styles = styles;
    }

    public SET<IfcPresentationStyleSelect> getStyles() {
        return styles;
    }

    public void setStyles(SET<IfcPresentationStyleSelect> styles) {
        this.styles = styles;
    }

    @Override
    public String toIfc() {
        Set<IfcPresentationStyleSelect> objects = getStyles().getObjects();
        LIST<Object> list = new LIST<>();

        for (Object object : objects) {
            IfcAbstractClass element = (IfcAbstractClass) object;
            list.add(StringConstant.WELL + element.getStepNumber());
        }

        String format = String.format("#%s=%s(%s)",
                this.stepNumber,
                this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
                list
        );

        return format;
    }
}
