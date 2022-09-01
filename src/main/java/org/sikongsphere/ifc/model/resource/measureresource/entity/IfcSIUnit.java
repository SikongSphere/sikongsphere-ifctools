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
package org.sikongsphere.ifc.model.resource.measureresource.entity;

import org.sikongsphere.ifc.model.resource.measureresource.enumeration.IfcSIPrefix;
import org.sikongsphere.ifc.model.resource.measureresource.enumeration.IfcSIUnitName;

/**
 * This class is used to encapsulate SI Unit information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public class IfcSIUnit extends IfcNamedUnit {
    private IfcSIPrefix prefix;
    private IfcSIUnitName name;

    /**
     * TODO
     * DERIVE
     * SELF\IfcNamedUnit.Dimensions	 : 	IfcDimensionalExponents :=  IfcDimensionsForSiUnit (SELF.Name);
     */
}
