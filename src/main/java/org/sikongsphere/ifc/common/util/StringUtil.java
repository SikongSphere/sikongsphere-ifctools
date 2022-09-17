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
package org.sikongsphere.ifc.common.util;

/**
 * This class is an util for string operation
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class StringUtil {
    public static String dropQuota(String input) {
        if (!empty(input)
            && ((input.startsWith("'") && input.endsWith("'"))
                || (input.startsWith("\"") && input.endsWith("\""))
                || (input.startsWith("`") && input.endsWith("`"))
                || (input.startsWith(".") && input.endsWith(".")))) {
            return input.substring(1, input.length() - 1);
        } else {
            return input;
        }
    }

    private static boolean empty(String input) {
        return input == null || input.trim().length() == 0;
    }
}
