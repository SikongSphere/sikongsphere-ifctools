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
package org.sikongsphere.ifc.sdk.factory;

import org.sikongsphere.ifc.common.exception.SikongSphereUnsupportedException;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.*;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcDerivedUnitEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcSIPrefix;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcSIUnitName;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcUnitEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.sdk.order.IOrder;

/**
 * This is an factory for IfcUnit
 *
 * @Author: zaiyuan
 * @Date: 2022/11/09 11:47
 */
public class IfcUnitFactory extends AbstractFactory<IfcUnit> {

    /**
     * IfcSIUnit Creators
     */
    public final IfcSIUnitName IFC_DEFAULT_MASS_UNIT = IfcSIUnitName.GRAM;
    public final IfcSIUnitName IFC_DEFAULT_LENGTH_UNIT = IfcSIUnitName.METRE;
    public final IfcSIUnitName IFC_DEFAULT_AREA_UNIT = IfcSIUnitName.SQUARE_METRE;
    public final IfcSIUnitName IFC_DEFAULT_VOLUME_UNIT = IfcSIUnitName.CUBIC_METRE;
    public final IfcSIUnitName IFC_DEFAULT_PLANE_ANGLE_UNIT = IfcSIUnitName.RADIAN;
    public final IfcSIUnitName IFC_DEFAULT_TIME_UNIT = IfcSIUnitName.SECOND;
    public final IfcSIUnitName IFC_DEFAULT_FREQUENCY_UNIT = IfcSIUnitName.HERTZ;
    public final IfcSIUnitName IFC_DEFAULT_THERMODYNAMIC_TEMPERATURE_UNIT =
        IfcSIUnitName.DEGREE_CELSIUS;
    public final IfcSIUnitName IFC_DEFAULT_ELECTRIC_CURRENT_UNIT = IfcSIUnitName.AMPERE;
    public final IfcSIUnitName IFC_DEFAULT_ELECTRIC_VOLTAGE_UNIT = IfcSIUnitName.VOLT;
    public final IfcSIUnitName IFC_DEFAULT_POWER_UNIT = IfcSIUnitName.WATT;
    public final IfcSIUnitName IFC_DEFAULT_FORCE_UNIT = IfcSIUnitName.NEWTON;
    public final IfcSIUnitName IFC_DEFAULT_ILLUMINANCE_UNIT = IfcSIUnitName.LUMEN;
    public final IfcSIUnitName IFC_DEFAULT_LUMINOUS_INTENSITY_UNIT = IfcSIUnitName.CANDELA;
    public final IfcSIUnitName IFC_DEFAULT_PRESSURE_UNIT = IfcSIUnitName.PASCAL;

    public final double IFC_DEFAULT_RATIO_MESASURE = 0.017453292519943278;

    @Override
    public IfcUnit create(IOrder<IfcUnit> order) {
        throw new SikongSphereUnsupportedException();
    }

    /**
     * create default mass unit
     *
     * @return IfcSIUnit instance
     */
    public IfcSIUnit createMassUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.MASSUNIT, IfcSIPrefix.KILO, IFC_DEFAULT_MASS_UNIT);
    }

    /**
     * create general length unit
     *
     * @return IfcSIUnit instance
     */
    public IfcSIUnit createLengthUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.LENGTHUNIT, null, IFC_DEFAULT_LENGTH_UNIT);
    }

    public IfcSIUnit createAreaUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.AREAUNIT, null, IFC_DEFAULT_AREA_UNIT);
    }

    public IfcSIUnit createVolumeUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.VOLUMEUNIT, null, IFC_DEFAULT_VOLUME_UNIT);
    }

    public IfcSIUnit createPlaneAngleUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.PLANEANGLEUNIT, null, IFC_DEFAULT_PLANE_ANGLE_UNIT);
    }

    public IfcSIUnit createTimeUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.TIMEUNIT, null, IFC_DEFAULT_TIME_UNIT);
    }

    public IfcSIUnit createFrequencyUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.FREQUENCYUNIT, null, IFC_DEFAULT_FREQUENCY_UNIT);
    }

    public IfcSIUnit createThermodynamicTemperatureUnit() {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.THERMODYNAMICTEMPERATUREUNIT,
            null,
            IFC_DEFAULT_THERMODYNAMIC_TEMPERATURE_UNIT
        );
    }

    public IfcSIUnit createElectricCurrentUnit() {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.ELECTRICCURRENTUNIT,
            null,
            IFC_DEFAULT_ELECTRIC_CURRENT_UNIT
        );
    }

    public IfcSIUnit createElectricVoltageUnit() {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.ELECTRICVOLTAGEUNIT,
            null,
            IFC_DEFAULT_ELECTRIC_VOLTAGE_UNIT
        );
    }

    public IfcSIUnit createPowerUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.POWERUNIT, null, IFC_DEFAULT_POWER_UNIT);
    }

    public IfcSIUnit createForceUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.FORCEUNIT, null, IFC_DEFAULT_FORCE_UNIT);
    }

    public IfcSIUnit createIlluminanceUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.ILLUMINANCEUNIT, null, IFC_DEFAULT_ILLUMINANCE_UNIT);
    }

    public IfcSIUnit createLuminousFluxUnit() {
        return createIlluminanceUnit();
    }

    public IfcSIUnit createLuminousIntensityUnit() {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.LUMINOUSINTENSITYUNIT,
            null,
            IFC_DEFAULT_LUMINOUS_INTENSITY_UNIT
        );
    }

    public IfcSIUnit createPressureUnit() {
        return new IfcSIUnit(null, IfcUnitEnum.PRESSUREUNIT, null, IFC_DEFAULT_PRESSURE_UNIT);
    }

    /**
     *
     */
    public IfcSIUnit createLengthUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(null, IfcUnitEnum.LENGTHUNIT, prefix, IFC_DEFAULT_LENGTH_UNIT);
    }

    public IfcSIUnit createAreaUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(null, IfcUnitEnum.AREAUNIT, prefix, IFC_DEFAULT_AREA_UNIT);
    }

    public IfcSIUnit createVolumeUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(null, IfcUnitEnum.VOLUMEUNIT, prefix, IFC_DEFAULT_VOLUME_UNIT);
    }

    public IfcSIUnit createPlaneAngleUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.PLANEANGLEUNIT,
            prefix,
            IFC_DEFAULT_PLANE_ANGLE_UNIT
        );
    }

    public IfcSIUnit createTimeUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(null, IfcUnitEnum.TIMEUNIT, prefix, IFC_DEFAULT_TIME_UNIT);
    }

    public IfcSIUnit createFrequencyUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(null, IfcUnitEnum.FREQUENCYUNIT, prefix, IFC_DEFAULT_FREQUENCY_UNIT);
    }

    public IfcSIUnit createThermodynamicTemperatureUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.THERMODYNAMICTEMPERATUREUNIT,
            prefix,
            IFC_DEFAULT_THERMODYNAMIC_TEMPERATURE_UNIT
        );
    }

    public IfcSIUnit createElectricCurrentUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.ELECTRICCURRENTUNIT,
            prefix,
            IFC_DEFAULT_ELECTRIC_CURRENT_UNIT
        );
    }

    public IfcSIUnit createElectricVoltageUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.ELECTRICVOLTAGEUNIT,
            prefix,
            IFC_DEFAULT_ELECTRIC_VOLTAGE_UNIT
        );
    }

    public IfcSIUnit createPowerUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(null, IfcUnitEnum.POWERUNIT, prefix, IFC_DEFAULT_POWER_UNIT);
    }

    public IfcSIUnit createForceUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(null, IfcUnitEnum.FORCEUNIT, prefix, IFC_DEFAULT_FORCE_UNIT);
    }

    public IfcSIUnit createIlluminanceUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.ILLUMINANCEUNIT,
            prefix,
            IFC_DEFAULT_ILLUMINANCE_UNIT
        );
    }

    public IfcSIUnit createLuminousIntensityUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(
            null,
            IfcUnitEnum.LUMINOUSINTENSITYUNIT,
            prefix,
            IFC_DEFAULT_LUMINOUS_INTENSITY_UNIT
        );
    }

    public IfcSIUnit createPressureUnit(IfcSIPrefix prefix) {
        return new IfcSIUnit(null, IfcUnitEnum.PRESSUREUNIT, prefix, IFC_DEFAULT_PRESSURE_UNIT);
    }

    /**
     *
     */
    public IfcSIUnit createLengthUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.LENGTHUNIT, null, name);
    }

    public IfcSIUnit createAreaUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.AREAUNIT, null, name);
    }

    public IfcSIUnit createVolumeUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.VOLUMEUNIT, null, name);
    }

    public IfcSIUnit createPlaneAngleUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.PLANEANGLEUNIT, null, name);
    }

    public IfcSIUnit createTimeUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.TIMEUNIT, null, name);
    }

    public IfcSIUnit createFrequencyUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.FREQUENCYUNIT, null, name);
    }

    public IfcSIUnit createThermodynamicTemperatureUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.THERMODYNAMICTEMPERATUREUNIT, null, name);
    }

    public IfcSIUnit createElectricCurrentUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.ELECTRICCURRENTUNIT, null, name);
    }

    public IfcSIUnit createElectricVoltageUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.ELECTRICVOLTAGEUNIT, null, name);
    }

    public IfcSIUnit createPowerUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.POWERUNIT, null, name);
    }

    public IfcSIUnit createForceUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.FORCEUNIT, null, name);
    }

    public IfcSIUnit createIlluminanceUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.ILLUMINANCEUNIT, null, name);
    }

    public IfcSIUnit createLuminousIntensityUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.LUMINOUSINTENSITYUNIT, null, name);
    }

    public IfcSIUnit createPressureUnit(IfcSIUnitName name) {
        return new IfcSIUnit(null, IfcUnitEnum.PRESSUREUNIT, null, name);
    }

    /**
     * create measure unit
     */
    public IfcMeasureWithUnit createPlanerAngleMeasureUnit() {
        IfcRatioMeasure ratioMeasure = new IfcRatioMeasure(IFC_DEFAULT_RATIO_MESASURE);
        return new IfcMeasureWithUnit(ratioMeasure, createPlaneAngleUnit());
    }

    public IfcMeasureWithUnit createPlanerAngleMeasureUnit(IfcSIUnit siUnit) {
        IfcRatioMeasure ratioMeasure = new IfcRatioMeasure(IFC_DEFAULT_RATIO_MESASURE);
        return new IfcMeasureWithUnit(ratioMeasure, siUnit);
    }

    public IfcConversionBasedUnit createPlanerAngleConversionBasedUnit() {
        return new IfcConversionBasedUnit(
            new IfcDimensionalExponents(),
            IfcUnitEnum.PLANEANGLEUNIT,
            new IfcLabel("DEGREE"),
            createPlanerAngleMeasureUnit()
        );
    }

    public IfcConversionBasedUnit createPlanerAngleConversionBasedUnit(
        IfcMeasureWithUnit measureWithUnit
    ) {
        return new IfcConversionBasedUnit(
            new IfcDimensionalExponents(),
            IfcUnitEnum.PLANEANGLEUNIT,
            new IfcLabel("DEGREE"),
            measureWithUnit
        );
    }

    public IfcConversionBasedUnit createPlanerAngleConversionBasedUnit(IfcSIUnit siUnit) {
        return new IfcConversionBasedUnit(
            new IfcDimensionalExponents(),
            IfcUnitEnum.PLANEANGLEUNIT,
            new IfcLabel("DEGREE"),
            createPlanerAngleMeasureUnit(siUnit)
        );
    }

    /**
     * create derived unit
     */
    public IfcDerivedUnit createMassDensityUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement massUnit = new IfcDerivedUnitElement(createMassUnit(), 1);
        elements.add(massUnit);
        IfcDerivedUnitElement cubic = new IfcDerivedUnitElement(createLengthUnit(), -3);
        elements.add(cubic);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.MASSDENSITYUNIT);
    }

    public IfcDerivedUnit createMomentOfIneriaUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement length = new IfcDerivedUnitElement(createLengthUnit(), 4);
        elements.add(length);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.MOMENTOFINERTIAUNIT);
    }

    public IfcDerivedUnit createThermalTransmittanceUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement mass = new IfcDerivedUnitElement(createMassUnit(), 1);
        elements.add(mass);
        IfcDerivedUnitElement thermodynamicTemperature = new IfcDerivedUnitElement(
            createThermodynamicTemperatureUnit(),
            -1
        );
        elements.add(thermodynamicTemperature);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -3);
        elements.add(time);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.THERMALTRANSMITTANCEUNIT);
    }

    public IfcDerivedUnit createVolumetricFlowRateUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement length = new IfcDerivedUnitElement(createLengthUnit(), 3);
        elements.add(length);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -1);
        elements.add(time);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.VOLUMETRICFLOWRATEUNIT);
    }

    public IfcDerivedUnit createMassFlowRateUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement mass = new IfcDerivedUnitElement(createMassUnit(), 1);
        elements.add(mass);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -1);
        elements.add(time);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.MASSFLOWRATEUNIT);
    }

    public IfcDerivedUnit createRotationalFrequencyUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -1);
        elements.add(time);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.MASSFLOWRATEUNIT);
    }

    public IfcDerivedUnit createLuminousEfficacyUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement mass = new IfcDerivedUnitElement(createMassUnit(), -1);
        elements.add(mass);
        IfcDerivedUnitElement length = new IfcDerivedUnitElement(createLengthUnit(), -2);
        elements.add(length);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), 3);
        elements.add(time);
        IfcDerivedUnitElement lumin = new IfcDerivedUnitElement(createIlluminanceUnit(), 1);
        elements.add(lumin);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.USERDEFINED);
    }

    public IfcDerivedUnit createSoundPowerUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement mass = new IfcDerivedUnitElement(createMassUnit(), 1);
        elements.add(mass);
        IfcDerivedUnitElement length = new IfcDerivedUnitElement(createLengthUnit(), 2);
        elements.add(length);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -3);
        elements.add(time);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.SOUNDPOWERUNIT);
    }

    public IfcDerivedUnit createSoundPressureUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement mass = new IfcDerivedUnitElement(createMassUnit(), 1);
        elements.add(mass);
        IfcDerivedUnitElement length = new IfcDerivedUnitElement(createLengthUnit(), -1);
        elements.add(length);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -2);
        elements.add(time);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.SOUNDPRESSUREUNIT);
    }

    public IfcDerivedUnit createLinearVelocityUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement length = new IfcDerivedUnitElement(createLengthUnit(), 1);
        elements.add(length);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -1);
        elements.add(time);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.LINEARVELOCITYUNIT);
    }

    public IfcDerivedUnit createFrictionLossUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement length = new IfcDerivedUnitElement(createLengthUnit(), -2);
        elements.add(length);
        IfcDerivedUnitElement mass = new IfcDerivedUnitElement(createMassUnit(), 1);
        elements.add(mass);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -2);
        elements.add(time);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.USERDEFINED);
    }

    public IfcDerivedUnit createLinearForceUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement mass = new IfcDerivedUnitElement(createMassUnit(), 1);
        elements.add(mass);
        IfcDerivedUnitElement length01 = new IfcDerivedUnitElement(createLengthUnit(), 1);
        elements.add(length01);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -2);
        elements.add(time);
        IfcDerivedUnitElement length02 = new IfcDerivedUnitElement(createLengthUnit(), -1);
        elements.add(length02);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.LINEARFORCEUNIT);
    }

    public IfcDerivedUnit createPlanarForceUnit() {
        SET<IfcDerivedUnitElement> elements = new SET<>();
        IfcDerivedUnitElement mass = new IfcDerivedUnitElement(createMassUnit(), 1);
        elements.add(mass);
        IfcDerivedUnitElement length01 = new IfcDerivedUnitElement(createLengthUnit(), 1);
        elements.add(length01);
        IfcDerivedUnitElement time = new IfcDerivedUnitElement(createTimeUnit(), -2);
        elements.add(time);
        IfcDerivedUnitElement length02 = new IfcDerivedUnitElement(createLengthUnit(), -2);
        elements.add(length02);
        return new IfcDerivedUnit(elements, IfcDerivedUnitEnum.PLANARFORCEUNIT);
    }

    public IfcUnitAssignment createIfcUnitAssignment() {
        SET<IfcUnit> unitSET = new SET<>();
        IfcSIUnit lengthUnit = createLengthUnit();
        IfcSIUnit areaUnit = createAreaUnit();
        IfcSIUnit volumeUnit = createVolumeUnit();
        IfcSIUnit massUnit = createMassUnit();
        IfcSIUnit timeUnit = createTimeUnit();
        IfcSIUnit frequencyUnit = createFrequencyUnit();
        IfcSIUnit thermodynamicTemperatureUnit = createThermodynamicTemperatureUnit();
        IfcSIUnit electricCurrentUnit = createElectricCurrentUnit();
        IfcSIUnit electricVoltageUnit = createElectricVoltageUnit();
        IfcSIUnit powerUnit = createPowerUnit();
        IfcSIUnit forceUnit = createForceUnit();
        IfcSIUnit illuminanceUnit = createIlluminanceUnit();
        IfcSIUnit luminousFluxUnit = createLuminousFluxUnit();
        IfcSIUnit luminousIntensityUnit = createLuminousIntensityUnit();
        IfcSIUnit pressureUnit = createPressureUnit();

        unitSET.add(lengthUnit);
        unitSET.add(areaUnit);
        unitSET.add(volumeUnit);
        unitSET.add(massUnit);
        unitSET.add(timeUnit);
        unitSET.add(frequencyUnit);
        unitSET.add(thermodynamicTemperatureUnit);
        unitSET.add(electricCurrentUnit);
        unitSET.add(electricVoltageUnit);
        unitSET.add(powerUnit);
        unitSET.add(forceUnit);
        unitSET.add(illuminanceUnit);
        unitSET.add(luminousFluxUnit);
        unitSET.add(luminousIntensityUnit);
        unitSET.add(pressureUnit);

        IfcMeasureWithUnit planerAngleMeasureUnit = createPlanerAngleMeasureUnit();
        unitSET.add(planerAngleMeasureUnit);

        IfcDerivedUnit massDensityUnit = createMassDensityUnit();
        IfcDerivedUnit momentOfIneriaUnit = createMomentOfIneriaUnit();
        IfcDerivedUnit thermalTransmittanceUnit = createThermalTransmittanceUnit();
        IfcDerivedUnit volumetricFlowRateUnit = createVolumetricFlowRateUnit();
        IfcDerivedUnit massFlowRateUnit = createMassFlowRateUnit();
        IfcDerivedUnit rotationalFrequencyUnit = createRotationalFrequencyUnit();
        IfcDerivedUnit luminousEfficacyUnit = createLuminousEfficacyUnit();
        IfcDerivedUnit soundPowerUnit = createSoundPowerUnit();
        IfcDerivedUnit soundPressureUnit = createSoundPressureUnit();
        IfcDerivedUnit linearVelocityUnit = createLinearVelocityUnit();
        IfcDerivedUnit frictionLossUnit = createFrictionLossUnit();
        IfcDerivedUnit linearForceUnit = createLinearForceUnit();
        IfcDerivedUnit planarForceUnit = createPlanarForceUnit();
        unitSET.add(massDensityUnit);
        unitSET.add(momentOfIneriaUnit);
        unitSET.add(thermalTransmittanceUnit);
        unitSET.add(volumetricFlowRateUnit);
        unitSET.add(massFlowRateUnit);
        unitSET.add(rotationalFrequencyUnit);
        unitSET.add(luminousEfficacyUnit);
        unitSET.add(soundPowerUnit);
        unitSET.add(soundPressureUnit);
        unitSET.add(linearVelocityUnit);
        unitSET.add(frictionLossUnit);
        unitSET.add(linearForceUnit);
        unitSET.add(planarForceUnit);

        return new IfcUnitAssignment(unitSET);
    }
}
