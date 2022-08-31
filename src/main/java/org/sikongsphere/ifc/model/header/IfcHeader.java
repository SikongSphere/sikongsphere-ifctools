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
package org.sikongsphere.ifc.model.header;

import org.sikongsphere.ifc.model.IfcNode;

public class IfcHeader extends IfcNode {
    public IfcFileName fileName;
    public IfcFileDescription fileDescription;
    public IfcFileSchema fileSchema;
}