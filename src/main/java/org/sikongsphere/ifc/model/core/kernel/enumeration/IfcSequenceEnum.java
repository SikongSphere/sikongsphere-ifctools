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
package org.sikongsphere.ifc.model.core.kernel.enumeration;

/**
 * This enumeration defines the different ways, in which a time lag is applied to a sequence between two processes.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
public enum IfcSequenceEnum {
    START_START,
    START_FINISH,
    FINISH_START,
    FINISH_FINISH,
    NOTDEFINED
}
