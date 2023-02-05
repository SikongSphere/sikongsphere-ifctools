package org.sikongsphere.ifc.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;
import org.sikongsphere.ifc.io.IfcFileReader;
import org.sikongsphere.ifc.io.converter.IfcToJson;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author:stan
 * @date:2023/2/5 21:19
 */
public class IfcToJsonTest {

    private final String IFC_FILE = "src/test/resources/blank.ifc";

    @Test
    public void blankIfcTest() throws IOException {
        IfcFileModel ifcFileModel = IfcFileReader.readFile(IFC_FILE);
        IfcToJson ifcToJson = new IfcToJson(ifcFileModel);
        HashMap<String, Object> map = ifcToJson.transform();
        ObjectMapper mapper = new ObjectMapper()
                .enable(SerializationFeature.INDENT_OUTPUT);
        String s = mapper.writeValueAsString(map);
        System.out.println(s);
    }
}
