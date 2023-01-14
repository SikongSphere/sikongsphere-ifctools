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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcBoolean;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * The information content of each row within the table (other than the heading row). A table contains a number of rows
 * which record information concerning the instance of the type of information recorded within the table.
 *
 * @author tianyu
 * @date 2022/12/11 13:30
 * @modified stan
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcTableRow extends IfcAbstractClass {
    private LIST<IfcValue> RowCells;
    private BOOLEAN IsHeading;

    @IfcInverseParameter
    private IfcLabel ofTable;

    @IfcParserConstructor
    public IfcTableRow(LIST<IfcValue> rowCells, BOOLEAN isHeading) {
        RowCells = rowCells;
        IsHeading = isHeading;
    }

    public LIST<IfcValue> getRowCells() {
        return RowCells;
    }

    public void setRowCells(LIST<IfcValue> rowCells) {
        RowCells = rowCells;
    }

    public BOOLEAN getHeading() {
        return IsHeading;
    }

    public void setHeading(BOOLEAN heading) {
        IsHeading = heading;
    }
}
