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
package org.sikongsphere.ifc.io.constant;

import com.sun.org.apache.bcel.internal.generic.PUSH;

/**
 * 用于存储描述信息的数据
 *
 * @author:stan
 * @date:2023/2/8 22:32
 */
public class MetaConstant {

    // tag
    public static String TYPE = "type";
    public static String ORG = "organization";
    public static String VERSION = "version";
    public static String DATA = "data";

    // desc
    public static String IFC_TOOLS_NAME = "IfcJSON";
    public static String ORG_NAME = "SikongSphere";
    public static String TOOLS_VERSION = "IfcTools-0.1.0-beta";

    // token
    public static String ID = "id";
    public static String WRAPPED_VALUE = "wrappedValue";
    public static String VALUE = "value";
    public static String GLOBAL_ID = "globalId";
    public static String BLANK = "";
    public static String DIM = "dimensions";
    public static String REF = "ref";

    // exponents
    public static String LENGTH_EXPONENT = "LengthExpoent";
    public static String MASS_EXPONENT = "MassExponent";
    public static String TIME_EXPONENT = "TimeExponent";
    public static String ELECTRIC_CURRENT_EXPONENT = "ElectricCurrentExponent";
    public static String THERMODYNAMIC_TEMPERATURE_EXPONENT = "ThermodynamicTemperatureExponent";
    public static String AMOUNT_OF_SUBSTANCE_EXPONENT = "AmountOfSubstanceExponent";
    public static String LUMINOUS_INTENSITY_EXPONENT = "LuminousIntensityExponent";
}
