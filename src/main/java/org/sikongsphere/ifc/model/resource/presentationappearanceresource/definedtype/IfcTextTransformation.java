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
package org.sikongsphere.ifc.model.resource.presentationappearanceresource.definedtype;

import org.sikongsphere.ifc.model.basic.STRING;

/**
 * IfcTextTransformation
 * 	SELF IN ['capitalize', 'uppercase', 'lowercase', 'none']
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
public class IfcTextTransformation extends STRING {
    public IfcTextTransformation(String value) {
        super(value);
    }
}
