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
package org.sikongsphere.ifc.model.ifcactorresource.entity;

import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.ifcactorresource.entity.IfcActorRole;
import org.sikongsphere.ifc.model.ifcactorresource.entity.IfcPerson;

/**
 * This class is used to encapsulate actor person and organization information
 *
 * @author zaiyuan
 * @date 2022-08-28 18:30:00
 */
public class IfcPersonAndOrganization extends IfcBodyTemplate {
    private IfcPerson thePerson;
    // TODO IfcOrganization
    private LIST<IfcActorRole> roles;
}
