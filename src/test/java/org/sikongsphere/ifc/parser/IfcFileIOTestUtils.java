package org.sikongsphere.ifc.parser;

import org.antlr.v4.runtime.CharStreams;
import org.sikongsphere.ifc.io.IfcFileReader;
import org.sikongsphere.ifc.io.IfcFileWriter;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

import java.io.IOException;

public class IfcFileIOTestUtils {

    public static final String BLANK_OUTPUT_PATH = "src/test/resources/output.ifc";

    public static void ioTest(String input, String output) throws IOException {
        IfcFileModel model = IfcFileReader.readFile(input);
        IfcFileWriter.writeFile(model, output);

        String ifcFileOne = CharStreams.fromFileName(input)
                .toString()
                .replaceAll("\\s*|\r", "");

        String ifcFileTwo = CharStreams.fromFileName(output)
                .toString()
                .replaceAll("\\s*|\r", "");

        assert ifcFileOne.equals(ifcFileTwo);
    }
}
