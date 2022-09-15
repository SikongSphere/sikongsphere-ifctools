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
package org.sikongsphere.ifc.common.constant;

/**
 * some constant used in an IFC file
 *
 * @author stan
 * @date 2022/09/08 13:52
 */
public class StringConstant {
    /**
     * General Token
     */
    public static final String NEW_LINE = "\r\n";
    public static final String COLON = ";";
    public static final String LEFT_BRACKETS = "(";
    public static final String RIGHT_BRACKETS = ")";
    public static final String BLANK_ROW = "\n";
    public static final String WELL = "#";
    public static final String WHITE_SPACE = " ";
    public static final String EQUALS = "=";

    /**
     * IFC Tag
     */
    public static final String END_TAG = "ENDSEC";
    public static final String END_ISO = "END-ISO-10303-21";
    public static final String BODY_TAG = "DATA";
    public static final String BEGIN_ISO = "ISO-10303-21";
}