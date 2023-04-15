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
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.sikongsphere.ifc.parser.IfcFileIOTestUtils.*;

/**
 * a test between an input IFC file
 * and an output IFC file from self-define method.
 *
 * @author stan
 * @date 2022/09/07 22:26
 */
public class Ifc2IfcTest {

    // basic ifc file
    @Test
    public void blankFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/basic-ifc/blank.ifc";

        getIfcFile(url);
        ioTest("src/test/resources/blank.ifc", BLANK_OUTPUT_PATH);
    }

    @Test
    public void basicFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/basic-ifc/basic_0.ifc";

        getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void complexFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/basic-ifc/complex.ifc";

        getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    // building ifc file
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

    // house ifc file
    @Test
    public void duplexFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/living-house/Duplex_A_20110505.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void duplexAIssuesAlternateFile() throws IOException {
        String url =
            "https://ifc-file.gd2.qingstor.com/living-house/Duplex_A_20110505_IssuesAlternate.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void duplexMIssuesAlternateFile() throws IOException {
        String url =
            "https://ifc-file.gd2.qingstor.com/living-house/Duplex_M_20110505_IssuesAlternate.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Ignore
    /**
     * could not run on gitee CI platform
     * due to GC overhead limit exceeded
     */
    public void duplexMepFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/living-house/Duplex_MEP_20110505.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void duplexIssuesAlternateFile() throws IOException {
        String url =
            "https://ifc-file.gd2.qingstor.com/living-house/Duplex_P_20110505_IssuesAlternate.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    // steel ifc file
    @Test
    public void sculptureBrepFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/steel/171210AISC_Sculpture_brep.ifc";

        getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void sculptureParamFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/steel/171210AISC_Sculpture_param.ifc";

        getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void analysisBrepFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/steel/171210analysis_brep.ifc";

        getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void analysisParamFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/steel/171210analysis_param.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void cadStudioBrepFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/steel/171210CADstudio_brep.ifc";
        getIfcFile(url);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void playersTheaterParamFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/steel/171210PlayersTheater_param.ifc";
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
