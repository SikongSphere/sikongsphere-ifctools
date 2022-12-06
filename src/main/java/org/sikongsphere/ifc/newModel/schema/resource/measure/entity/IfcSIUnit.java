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
package org.sikongsphere.ifc.newModel.schema.resource.measure.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.measure.enumeration.IfcSIPrefix;
import org.sikongsphere.ifc.newModel.schema.resource.measure.enumeration.IfcSIUnitName;
import org.sikongsphere.ifc.newModel.schema.resource.measure.enumeration.IfcUnitEnum;

import java.util.Locale;
import java.util.Optional;

/**
 * This class is used to encapsulate SI Unit information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSIUnit extends IfcNamedUnit {
    private IfcSIPrefix prefix;
    private IfcSIUnitName name;

    /**
     * TODO
     * DERIVE
     * SELF\IfcNamedUnit.Dimensions	 : 	IfcDimensionalExponents :=  IfcDimensionsForSiUnit (SELF.Name);
     */

    public IfcSIUnit(IfcSIPrefix prefix, IfcSIUnitName name) {
        this.prefix = prefix;
        this.name = name;
    }

    @IfcParserConstructor
    public IfcSIUnit(
        IfcDimensionalExponents dimensions,
        IfcUnitEnum unitType,
        IfcSIPrefix prefix,
        IfcSIUnitName name
    ) {
        super(dimensions, unitType);
        this.prefix = prefix;
        this.name = name;
    }

    public IfcSIPrefix getPrefix() {
        return prefix;
    }

    public void setPrefix(IfcSIPrefix prefix) {
        this.prefix = prefix;
    }

    public IfcSIUnitName getName() {
        return name;
    }

    public void setName(IfcSIUnitName name) {
        this.name = name;
    }

    @Override
    public String toString() {

        String dimension;
        if (this.dimensions.isDefault()){
            dimension = StringConstant.ASTERISK;
        } else
            dimension = this.dimensions.toString();

        String format = String.format("#%s=%s(%s,%s,%s,.%s.);",
                this.stepNumber,
                this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
                dimension,
                Optional.ofNullable(this.unitType).map(x -> StringConstant.DOT + this.unitType + StringConstant.DOT).orElse(StringConstant.ASTERISK),
                Optional.ofNullable(this.prefix).map(x -> StringConstant.DOT + this.prefix + StringConstant.DOT).orElse(StringConstant.DOLLAR),
                this.name
        );

        return format;
    }
}
