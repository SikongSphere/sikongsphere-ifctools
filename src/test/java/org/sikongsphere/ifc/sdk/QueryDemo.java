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
package org.sikongsphere.ifc.sdk;

import org.junit.Test;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcSIUnit;
import org.sikongsphere.ifc.sdk.convert.IfcModelConvertor;
import org.sikongsphere.ifc.sdk.query.IfcModelQuery;

import java.util.List;

public class QueryDemo {

    public static final String BLANK_INPUT_PATH = "src/test/resources/blank.ifc";
    SikongSphereSession sikongSphereSession = SikongSphereSession.getOrCreate();
    IfcModelConvertor convertor = (IfcModelConvertor) sikongSphereSession.convertor(
        IfcFileModel.class
    );
    IfcFileModel model = convertor.readFile(BLANK_INPUT_PATH);

    @Test
    public void queryList() {
        IfcModelQuery query = (IfcModelQuery) sikongSphereSession.query(IfcFileModel.class);
        List<?> objects = query.filterByClass(model, IfcSIUnit.class);

        assert objects.size() == 3;
    }

    @Test
    public void queryEqual() {
        IfcModelQuery query = (IfcModelQuery) sikongSphereSession.query(IfcFileModel.class);
        IfcAbstractClass entity = query.filterEqualStepNum(model, 11);
        assert IfcSIUnit.class.getSimpleName().equals(entity.getClass().getSimpleName());
    }

    @Test
    public void queryLessThan() {
        IfcModelQuery query = (IfcModelQuery) sikongSphereSession.query(IfcFileModel.class);
        List<IfcAbstractClass> result = query.filterLessThanStepNum(model, 11);
        assert result.size() == 10;
    }

    @Test
    public void queryGreaterThan() {
        IfcModelQuery query = (IfcModelQuery) sikongSphereSession.query(IfcFileModel.class);
        List<IfcAbstractClass> result = query.filterGreaterThanStepNum(model, 11);
        assert result.size() == 7;
    }
}
