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
package org.sikongsphere.ifc.sdk.create.worker;

import org.sikongsphere.ifc.model.Model;

/**
 * This is an interface for order
 *
 * @Author: zaiyuan
 * @Date: 2022/11/09 11:47
 */
public interface IWorker<T> {
    void install(Model model, T product);

    void install(Model model, T product, Object... params);
}
