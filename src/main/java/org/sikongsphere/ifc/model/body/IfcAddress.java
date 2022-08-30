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
import org.sikongsphere.ifc.model.enumeration.IfcAddressTypeEnum;

/**
 * This class is used to encapsulate address information
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcAddress extends IfcBodyTemplate {
    private IfcAddressTypeEnum purpose;
    private IfcText description;
    private IfcLabel userDefinedPurpose;
    // TODO inverse
}
