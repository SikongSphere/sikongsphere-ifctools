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
package org.sikongsphere.ifc.model.schema.resource.actor.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * Roles which may be played by an actor.
 *
 * @author zaiyuan
 * @modify yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcRoleEnum {
    SUPPLIER,
    MANUFACTURER,
    CONTRACTOR,
    SUBCONTRACTOR,
    ARCHITECT,
    STRUCTURALENGINEER,
    COSTENGINEER,
    CLIENT,
    BUILDINGOWNER,
    BUILDINGOPERATOR,
    MECHANICALENGINEER,
    ELECTRICALENGINEER,
    PROJECTMANAGER,
    FACILITIESMANAGER,
    CIVILENGINEER,
    COMISSIONINGENGINEER,
    ENGINEER,
    OWNER,
    CONSULTANT,
    CONSTRUCTIONMANAGER,
    FIELDCONSTRUCTIONMANAGER,
    RESELLER,
    /**
     * User defined value to be provided.
     */
    USERDEFINED
}
