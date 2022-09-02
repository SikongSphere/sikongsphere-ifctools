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
package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.resource.representation.selecttype.IfcColour;

/**
 * IfcTextStyleForDefinedFont
 *
 * @author zaiyuan
 * @date 2022/9/2 19:15
 */
public class IfcTextStyleForDefinedFont extends IfcNonLeafNode implements IfcCharacterStyleSelect {
    private IfcColour colour;
    private IfcColour backgroundColour;
}
