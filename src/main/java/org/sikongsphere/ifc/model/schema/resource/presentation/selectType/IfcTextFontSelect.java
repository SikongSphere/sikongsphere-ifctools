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
package org.sikongsphere.ifc.model.schema.resource.presentation.selectType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcTextFontSelect alows for either a predefined text font, a text font model or an externally defined text font
 * to be used to describe the font of a text literal. The definition of the text font model is based on W3C TR Cascading
 * Style Sheet Version 1, whereas the definition of predefined text font is based on ISO 10303.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:57
 */
@IfcClass(type = IfcType.SELECT_TYPE, layer = IfcLayer.RESOURCE)
public interface IfcTextFontSelect {}
