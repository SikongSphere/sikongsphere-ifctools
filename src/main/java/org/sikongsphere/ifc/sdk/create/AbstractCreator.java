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
package org.sikongsphere.ifc.sdk.create;

import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

/**
 * Abstract Creator for different Model
 *
 * @author zaiyuan
 * @date 2023-03-15 20:44:00
 */
public abstract class AbstractCreator<T, E> implements Creator<T, E> {
    public static AbstractCreator<?, ?> create(Class<?> ifcModel) {
        if (ifcModel == IfcFileModel.class) {
            return new IfcModelCreator<>();
        }
        return null;
    }
}
