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
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.INTEGER;
import org.sikongsphere.ifc.newModel.datatype.STRING;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;

import java.util.Locale;

/**
 * This class is used to encapsulate dimension exponents information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDimensionalExponents extends IfcAbstractClass {

    /**
     * The power of the length base quantity
     */
    private INTEGER lengthExponent = new INTEGER(0);
    /**
     * The power of the mass base quantity
     */
    private INTEGER massExponent = new INTEGER(0);
    /**
     * 	The power of the time base quantity
     */
    private INTEGER timeExponent = new INTEGER(0);
    /**
     * The power of the electric current base quantity
     */
    private INTEGER electricCurrentExponent = new INTEGER(0);
    /**
     * The power of the thermodynamic temperature base quantity
     */
    private INTEGER thermodynamicTemperatureExponent = new INTEGER(0);
    /**
     * The power of the amount of substance base quantity
     */
    private INTEGER amountOfSubstanceExponent = new INTEGER(0);
    /**
     * The power of the luminous intensity base quantity
     */
    private INTEGER luminousIntensityExponent = new INTEGER(0);

    public IfcDimensionalExponents() {}

    @IfcParserConstructor
    public IfcDimensionalExponents(
        INTEGER lengthExponent,
        INTEGER massExponent,
        INTEGER timeExponent,
        INTEGER electricCurrentExponent,
        INTEGER thermodynamicTemperatureExponent,
        INTEGER amountOfSubstanceExponent,
        INTEGER luminousIntensityExponent
    ) {
        this.lengthExponent = lengthExponent;
        this.massExponent = massExponent;
        this.timeExponent = timeExponent;
        this.electricCurrentExponent = electricCurrentExponent;
        this.thermodynamicTemperatureExponent = thermodynamicTemperatureExponent;
        this.amountOfSubstanceExponent = amountOfSubstanceExponent;
        this.luminousIntensityExponent = luminousIntensityExponent;
    }

    public IfcDimensionalExponents(
        int lengthExponent,
        int massExponent,
        int timeExponent,
        int electricCurrentExponent,
        int thermodynamicTemperatureExponent,
        int amountOfSubstanceExponent,
        int luminousIntensityExponent
    ) {
        this.lengthExponent = new INTEGER(lengthExponent);
        this.massExponent = new INTEGER(massExponent);
        this.timeExponent = new INTEGER(timeExponent);
        this.electricCurrentExponent = new INTEGER(electricCurrentExponent);
        this.thermodynamicTemperatureExponent = new INTEGER(thermodynamicTemperatureExponent);
        this.amountOfSubstanceExponent = new INTEGER(amountOfSubstanceExponent);
        this.luminousIntensityExponent = new INTEGER(luminousIntensityExponent);
    }

    public IfcDimensionalExponents(
        STRING lengthExponent,
        STRING massExponent,
        STRING timeExponent,
        STRING electricCurrentExponent,
        STRING thermodynamicTemperatureExponent,
        STRING amountOfSubstanceExponent,
        STRING luminousIntensityExponent
    ) {
        this.lengthExponent = new INTEGER(Integer.valueOf(lengthExponent.value));
        this.massExponent = new INTEGER(Integer.valueOf(massExponent.value));
        this.timeExponent = new INTEGER(Integer.valueOf(timeExponent.value));
        this.electricCurrentExponent = new INTEGER(Integer.valueOf(electricCurrentExponent.value));
        this.thermodynamicTemperatureExponent = new INTEGER(
            Integer.valueOf(thermodynamicTemperatureExponent.value)
        );
        this.amountOfSubstanceExponent = new INTEGER(
            Integer.valueOf(amountOfSubstanceExponent.value)
        );
        this.luminousIntensityExponent = new INTEGER(
            Integer.valueOf(luminousIntensityExponent.value)
        );
    }

    public INTEGER getLengthExponent() {
        return lengthExponent;
    }

    public void setLengthExponent(INTEGER lengthExponent) {
        this.lengthExponent = lengthExponent;
    }

    public INTEGER getMassExponent() {
        return massExponent;
    }

    public void setMassExponent(INTEGER massExponent) {
        this.massExponent = massExponent;
    }

    public INTEGER getTimeExponent() {
        return timeExponent;
    }

    public void setTimeExponent(INTEGER timeExponent) {
        this.timeExponent = timeExponent;
    }

    public INTEGER getElectricCurrentExponent() {
        return electricCurrentExponent;
    }

    public void setElectricCurrentExponent(INTEGER electricCurrentExponent) {
        this.electricCurrentExponent = electricCurrentExponent;
    }

    public INTEGER getThermodynamicTemperatureExponent() {
        return thermodynamicTemperatureExponent;
    }

    public void setThermodynamicTemperatureExponent(INTEGER thermodynamicTemperatureExponent) {
        this.thermodynamicTemperatureExponent = thermodynamicTemperatureExponent;
    }

    public INTEGER getAmountOfSubstanceExponent() {
        return amountOfSubstanceExponent;
    }

    public void setAmountOfSubstanceExponent(INTEGER amountOfSubstanceExponent) {
        this.amountOfSubstanceExponent = amountOfSubstanceExponent;
    }

    public INTEGER getLuminousIntensityExponent() {
        return luminousIntensityExponent;
    }

    public void setLuminousIntensityExponent(INTEGER luminousIntensityExponent) {
        this.luminousIntensityExponent = luminousIntensityExponent;
    }

    @Override
    public boolean isDefault() {
        return lengthExponent.isDefault()
            && massExponent.isDefault()
            && timeExponent.isDefault()
            && electricCurrentExponent.isDefault()
            && thermodynamicTemperatureExponent.isDefault()
            && amountOfSubstanceExponent.isDefault()
            && luminousIntensityExponent.isDefault();
    }
}
