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
package org.sikongsphere.ifc.model.body;

import org.sikongsphere.ifc.model.basic.IfcLabel;
import org.sikongsphere.ifc.model.basic.IfcText;
import org.sikongsphere.ifc.model.enumeration.IfcRoleEnum;

/**
 * This class is used to encapsulate actor role information
 *
 * @author zaiyuan
 * @date 2022-08-28 18:30:00
 */
public class IfcActorRole extends IfcBodyTemplate {
    private IfcRoleEnum role;
    private IfcLabel userDefinedRole;
    private IfcText description;
}
