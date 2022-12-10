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
package org.sikongsphere.ifc.model.schema.resource.quantity.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * The complex physical quantity, IfcPhysicalComplexQuantity, is an entity that holds a set of single quantity measure
 * value (as defined at the subtypes of IfcPhysicalSimpleQuantity), that all apply to a given component or aspect of the
 * element.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:29
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPhysicalComplexQuantity extends IfcPhysicalQuantity {

    private SET<IfcPhysicalQuantity> hasQuantities;
    private IfcLabel discrimination;
    @IfcOptionField
    private IfcLabel quality;
    @IfcOptionField
    private IfcLabel usage;

    public IfcPhysicalComplexQuantity(IfcLabel name, IfcText description) {
        super(name, description);
    }

    @IfcParserConstructor
    public IfcPhysicalComplexQuantity(
        IfcLabel name,
        IfcText description,
        SET<IfcPhysicalQuantity> hasQuantities,
        IfcLabel discrimination,
        IfcLabel quality,
        IfcLabel usage
    ) {
        super(name, description);
        this.hasQuantities = hasQuantities;
        this.discrimination = discrimination;
        this.quality = quality;
        this.usage = usage;
    }

    public SET<IfcPhysicalQuantity> getHasQuantities() {
        return hasQuantities;
    }

    public void setHasQuantities(SET<IfcPhysicalQuantity> hasQuantities) {
        this.hasQuantities = hasQuantities;
    }

    public IfcLabel getDiscrimination() {
        return discrimination;
    }

    public void setDiscrimination(IfcLabel discrimination) {
        this.discrimination = discrimination;
    }

    public IfcLabel getQuality() {
        return quality;
    }

    public void setQuality(IfcLabel quality) {
        this.quality = quality;
    }

    public IfcLabel getUsage() {
        return usage;
    }

    public void setUsage(IfcLabel usage) {
        this.usage = usage;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
