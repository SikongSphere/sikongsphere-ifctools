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
package org.sikongsphere.ifc.model.resource.presentation.entity;

import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * The pre defined text font determines those qualified names which can be used for fonts
 * that are in scope of the current data exchange specification (in contrary to externally defined text fonts).
 *
 * @author stan
 * @date 2022/09/02 13:13
 */
public abstract class IfcPreDefinedTextFont extends IfcPreDefinedItem {
    public IfcPreDefinedTextFont() {}

    public IfcPreDefinedTextFont(IfcLabel name) {
        super(name);
    }
}
