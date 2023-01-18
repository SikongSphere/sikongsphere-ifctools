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
package org.sikongsphere.ifc.model.schema.resource.utility.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.constraint.selectType.IfcMetricValueSelect;

/**
 * A data structure for the provision of information in the form of rows and columns. Each instance may have a heading
 * row with titles or descriptions for each column. The rows of information are stored as a list of IfcTableRow objects.
 *
 * @author tianyu
 * @date 2022/12/11 13:30
 * @modified stan
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcTable extends IfcAbstractClass implements IfcMetricValueSelect {
    private STRING name;
    private LIST<IfcTableRow> rows;

    @IfcParserConstructor
    public IfcTable(STRING name, LIST<IfcTableRow> rows) {
        this.name = name;
        this.rows = rows;
    }

    public STRING getName() {
        return name;
    }

    public void setName(STRING name) {
        this.name = name;
    }

    public LIST<IfcTableRow> getRows() {
        return rows;
    }

    public void setRows(LIST<IfcTableRow> rows) {
        this.rows = rows;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
