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
package org.sikongsphere.ifc.io.converter;

import org.sikongsphere.ifc.common.constant.StringConstant;

import java.util.*;

/**
 * 生成GUID的一个工具
 *
 * @author:stan
 * @date:2023/2/5 14:43
 *
 */
public class Guid {

    /**
     * 字符加密 原理为利用reduce进行累加
     * 例如对于 [1,2,3]  该方法会进行 (1 * 64 + 2)  * 64 + 3 = 4227
     * @param voc
     * @return
     */
    private static Integer b64(String voc) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < voc.length(); i++) {
            char c = voc.charAt(i);
            int index = StringConstant.GUID_CHARS.indexOf(c);
            list.add(index);
        }
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x * 64 + y);

        return reduce.get();

    }

    /**
     * 将十进制转为十六进制
     * @param globalId
     * @return
     */
    public static String expand(String globalId) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer value = b64(globalId.substring(0, 2));
        list.add(value);

        for (int i = 0; i < 5; i++) {
            Integer tempValue = b64(globalId.substring(2 + 4 * i, 6 + 4 * i));

            for (int j = 0; j < 3; j++) {
                list.add((tempValue >> (8 * (2 - j))) % 256);
            }
        }
        List<String> hexStringList = new ArrayList<>();

        list.forEach(x -> {
            String hexString = Integer.toHexString(x);
            hexStringList.add(hexString);
        });

        return String.join("", hexStringList);

    }

    /**
     * 格式化编码结果
     * @param globalId
     * @return
     */
    public static String split(String globalId) {
        return String.format(
            "%s-%s-%s-%s-%s",
            globalId.substring(0, 8),
            globalId.substring(8, 12),
            globalId.substring(12, 16),
            globalId.substring(16, 20),
            globalId.substring(20)
        );
    }
}
