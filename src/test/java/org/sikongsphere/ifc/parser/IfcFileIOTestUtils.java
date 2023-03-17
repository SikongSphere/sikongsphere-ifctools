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

import org.antlr.v4.runtime.CharStreams;
import org.apache.commons.io.FileUtils;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;
import org.sikongsphere.ifc.sdk.SikongSphereSession;
import org.sikongsphere.ifc.sdk.convert.IfcModelConvertor;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class IfcFileIOTestUtils {

    public static final String BLANK_INPUT_PATH = "src/test/resources/input.ifc";
    public static final String BLANK_OUTPUT_PATH = "src/test/resources/output.ifc";

    public static void ioTest(String input, String output) throws IOException {
        SikongSphereSession sikongSphereSession = SikongSphereSession.getOrCreate();
        IfcModelConvertor convertor = (IfcModelConvertor) sikongSphereSession.convertor(
            IfcFileModel.class
        );

        IfcFileModel model = convertor.readFile(input);
        convertor.writeFile(model, output);

        String ifcFileOne = CharStreams.fromFileName(input).toString().replaceAll("\\s*|\r", "");

        String ifcFileTwo = CharStreams.fromFileName(output).toString().replaceAll("\\s*|\r", "");

        assert ifcFileOne.equals(ifcFileTwo);
    }

    public static void getIfcFile(String address) throws IOException {
        URL url = new URL(address);
        File file = new File(BLANK_INPUT_PATH);

        FileUtils.copyURLToFile(url, file);
    }
}
