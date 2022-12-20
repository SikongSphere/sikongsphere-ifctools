package org.sikongsphere.ifc.parser;

import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.sikongsphere.ifc.parser.IfcFileIOTestUtils.BLANK_OUTPUT_PATH;

public class SteelIfcFileIOTest {

    @Test
    public void sculptureBrep() throws IOException {

        String BLANK_INPUT_PATH = "src/test/resources/steel/171210AISC_Sculpture_brep.ifc";

        IfcFileIOTestUtils.ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @After
    public void delIfcFile() {
        File file = new File(BLANK_OUTPUT_PATH);
        file.delete();
    }
}
