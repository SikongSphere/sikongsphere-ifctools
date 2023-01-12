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
package org.sikongsphere.ifc.parser;

import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.sikongsphere.ifc.parser.IfcFileIOTestUtils.*;

/**
 * @author:stan
 * @date:2023/1/12 23:19
 */
public class BuildingIfcFileIOTest {

    @Test
    public void medDentClinicMepPlumbFile() throws IOException {
        String url =
            "https://ifc-file.gd2.qingstor.com/public-building/091210Med_Dent_Clinic_MEP_Plumb.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void hospitalMetricElectrical2015() throws IOException {
        String url =
            "https://ifc-file.gd2.qingstor.com/public-building/20160125WestRiverSide%20Hospital-Ifc2x3-Autodesk_Hospital_Metric_Electrical_2015.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void hospitalMetricFireAlarm2014() throws IOException {
        String url =
            "https://ifc-file.gd2.qingstor.com/public-building/20160125WestRiverSide%20Hospital-Ifc2x3-Autodesk_Hospital_Metric_FireAlarm_2014.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void hospitalMetricStructural2015() throws IOException {
        String url =
            "https://ifc-file.gd2.qingstor.com/public-building/20160125WestRiverSide%20Hospital-Ifc2x3-Autodesk_Hospital_Metric_Structural_2015.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @After
    public void delIfcFile() {

        File inputFile = new File(BLANK_INPUT_PATH);
        inputFile.delete();

        File outputFile = new File(BLANK_OUTPUT_PATH);
        outputFile.delete();
    }
}
