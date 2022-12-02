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
package org.sikongsphere.ifc.newModel.resource.externalreference.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.body.IfcBodyTemplate;
import org.sikongsphere.ifc.newModel.resource.datetime.entity.IfcCalendarDate;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;

/**
 * @author zhongqi
 * @date 2022/10/26
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcClassification extends IfcBodyTemplate {
    private IfcLabel source;
    private IfcLabel edition;
    private IfcCalendarDate editionDate;
    private IfcLabel name;

    public IfcClassification() {}

    @IfcParserConstructor
    public IfcClassification(
        IfcLabel source,
        IfcLabel edition,
        IfcCalendarDate editionDate,
        IfcLabel name
    ) {
        this.source = source;
        this.edition = edition;
        this.editionDate = editionDate;
        this.name = name;
    }

    public IfcLabel getSource() {
        return source;
    }

    public void setSource(IfcLabel source) {
        this.source = source;
    }

    public IfcLabel getEdition() {
        return edition;
    }

    public void setEdition(IfcLabel edition) {
        this.edition = edition;
    }

    public IfcCalendarDate getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(IfcCalendarDate editionDate) {
        this.editionDate = editionDate;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }
}
