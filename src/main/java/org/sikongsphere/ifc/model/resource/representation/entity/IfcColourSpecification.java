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
package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.representation.selecttype.IfcColour;

/**
 * The IfcTextFontSelect alows for either a predefined text font, a text font model or an externally defined
 * text font to be used to describe the font of a text literal.
 *
 * @author zaiyuan
 * @date 2022/9/2 08:15
 */
public class IfcColourSpecification implements IfcColour {
    private IfcLabel name;
}
