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
package org.sikongsphere.ifc.model.fileelement;

import org.sikongsphere.ifc.model.IfcFileElement;
import org.sikongsphere.ifc.model.IfcInterface;

import java.util.List;

public class IfcFileSchema extends IfcFileElement {
    public IfcFileSchema() {}

    public IfcFileSchema(List<IfcInterface> params) {
        super(params);
    }

    @Override
    public String toString() {
        IfcInterface ifcInterface = params.get(0);

        return ifcInterface.toString();
    }
}