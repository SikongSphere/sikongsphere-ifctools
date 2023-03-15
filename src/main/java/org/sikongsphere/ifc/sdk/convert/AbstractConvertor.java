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
package org.sikongsphere.ifc.sdk.convert;

import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

/**
 * Abstract Convertor for different Model
 *
 * @author zaiyuan
 * @date 2023-03-15 20:44:00
 */
public abstract class AbstractConvertor<T> implements Convertor<T> {

    /**
     * Convert to different Convertor based on Class
     *
     * @param clazz Class
     * @return Convertor Instance
     */
    public AbstractConvertor<?> convert(Class<T> clazz) {
        if (clazz == IfcFileModel.class) {
            return new IfcModelConvertor();
        }
        return null;
    }
}
