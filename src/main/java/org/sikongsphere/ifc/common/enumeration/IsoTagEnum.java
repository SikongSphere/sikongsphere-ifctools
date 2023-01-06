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
package org.sikongsphere.ifc.common.enumeration;

import org.sikongsphere.ifc.common.exception.SikongSphereException;

/**
 * This class is used to encapsulate ISO Tag
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public enum IsoTagEnum {
    /**
     * ISO 10303 21
     */
    ISO_10303_21;

    public IsoTagEnum valueOf(Integer index) {
        switch (index) {
            case 0:
                return ISO_10303_21;
            default:
                throw new SikongSphereException(String.format("%s is not supported in IsoTagEnum", index));
        }
    }

    public static Integer indexOf(IsoTagEnum tagEnum) {
        switch (tagEnum) {
            case ISO_10303_21:
                return 0;
            default:
                throw new SikongSphereException(String.format("%s is not supported in IsoTagEnum", tagEnum));
        }
    }
}
