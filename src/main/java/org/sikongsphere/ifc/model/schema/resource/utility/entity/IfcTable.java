package org.sikongsphere.ifc.model.schema.resource.utility.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * A data structure for the provision of information in the form of rows and columns. Each instance may have a heading
 * row with titles or descriptions for each column. The rows of information are stored as a list of IfcTableRow objects.
 *
 * @author tianyu
 * @date 2022/12/11 13:30
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcTable extends IfcAbstractClass {
    private String name;
    private LIST<IfcTableRow> rows;

    @IfcParserConstructor
    public IfcTable(String name, LIST<IfcTableRow> rows) {
        this.name = name;
        this.rows = rows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
        //TODO
        return super.illegal();
    }
}