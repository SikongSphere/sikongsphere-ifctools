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
package org.sikongsphere.ifc.model.schema.resource.cost.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.datetime.entity.IfcDateAndTime;
import org.sikongsphere.ifc.model.schema.resource.externalreference.entity.IfcLibraryInformation;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcMonetaryUnit;

/**
 * An IfcCurrencyRelationship defines the rate of exchange that applies between two designated currencies at a
 * particular time and as published by a particular source.
 *
 * @author zaiyuan
 * @modify yiwei
 * @date 2022/12/07 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCurrencyRelationship extends IfcAbstractClass {
    private IfcMonetaryUnit relatingMonetaryUnit;
    private IfcMonetaryUnit relatedMonetaryUnit;
    private IfcPositiveRatioMeasure exchangeRate;
    private IfcDateAndTime rateDateTime;
    @IfcOptionField
    private IfcLibraryInformation rateSource;

    @IfcParserConstructor
    public IfcCurrencyRelationship(
        IfcMonetaryUnit relatingMonetaryUnit,
        IfcMonetaryUnit relatedMonetaryUnit,
        IfcPositiveRatioMeasure exchangeRate,
        IfcDateAndTime rateDateTime,
        IfcLibraryInformation rateSource
    ) {
        this.relatingMonetaryUnit = relatingMonetaryUnit;
        this.relatedMonetaryUnit = relatedMonetaryUnit;
        this.exchangeRate = exchangeRate;
        this.rateDateTime = rateDateTime;
        this.rateSource = rateSource;
    }

    public IfcMonetaryUnit getRelatingMonetaryUnit() {
        return relatingMonetaryUnit;
    }

    public void setRelatingMonetaryUnit(IfcMonetaryUnit relatingMonetaryUnit) {
        this.relatingMonetaryUnit = relatingMonetaryUnit;
    }

    public IfcMonetaryUnit getRelatedMonetaryUnit() {
        return relatedMonetaryUnit;
    }

    public void setRelatedMonetaryUnit(IfcMonetaryUnit relatedMonetaryUnit) {
        this.relatedMonetaryUnit = relatedMonetaryUnit;
    }

    public IfcPositiveRatioMeasure getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(IfcPositiveRatioMeasure exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public IfcDateAndTime getRateDateTime() {
        return rateDateTime;
    }

    public void setRateDateTime(IfcDateAndTime rateDateTime) {
        this.rateDateTime = rateDateTime;
    }

    public IfcLibraryInformation getRateSource() {
        return rateSource;
    }

    public void setRateSource(IfcLibraryInformation rateSource) {
        this.rateSource = rateSource;
    }
}
