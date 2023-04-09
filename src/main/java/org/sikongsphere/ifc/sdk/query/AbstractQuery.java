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
package org.sikongsphere.ifc.sdk.query;

import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

/**
 * Abstract Query for different Model
 *
 * @author zaiyuan
 * @date 2023-03-15 20:44:00
 */
public abstract class AbstractQuery<T> implements Query<T> {

    /**
     * Convert to different Query based on Class
     *
     * @param clazz Class
     * @return Query Instance
     */
    public static AbstractQuery<?> query(Class<?> clazz) {
        if (clazz == IfcFileModel.class) {
            return new IfcModelQuery();
        }
        return null;
    }
}
