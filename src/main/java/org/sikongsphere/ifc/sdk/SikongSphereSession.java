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
package org.sikongsphere.ifc.sdk;

import org.sikongsphere.ifc.infra.IfcClassContainer;

/**
 * SikongSphere Session Class
 *
 * @author zaiyuan
 * @date 2023-03-15 20:44:00
 */
public class SikongSphereSession {
    private IfcClassContainer ifcClassContainer;

    private SikongSphereSession() {
        // TODO init environment
    }

    private static class SingleTonHolder {
        private static final SikongSphereSession INSTANCE = new SikongSphereSession();
    }

    public SikongSphereSession getOrCreate() {
        return SingleTonHolder.INSTANCE;
    }
}
