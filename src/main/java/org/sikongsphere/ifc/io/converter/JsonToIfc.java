package org.sikongsphere.ifc.io.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.sikongsphere.ifc.model.IfcInterface;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.fileelement.IfcFileDescription;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author:stan
 * @date:2023/3/16 22:49
 *
 * 用于将IfcJSON转换为IFC格式的工具类
 */
public class JsonToIfc {

    private String jsonFile;
    private Map jsonData;

    public JsonToIfc(String jsonFile) throws IOException {
        this.jsonFile = jsonFile;
        this.jsonData = new ObjectMapper()
                .readValue(new File(jsonFile), Map.class);
    }

    /**
     * create file description
     */
    private void createFileDescription() {
        List<Object> list = new ArrayList<>();
        list.add("'ViewDefinition [CoordinationView_V2.0]'");
        list.add("2;1");
        System.out.println(list);
    }

    /**
     * create file name
     */
    private void createFileName() {

    }

    /**
     * create file schema
     */
    private void createFileSchema() {

    }

    /**
     * create data entity
     */
    private void createDataEntity() {

    }

    public static void main(String[] args) {
        LIST<Object> list = new LIST<>();
        list.add(new STRING("ViewDefinition [CoordinationView_V2.0]"));

        List<IfcInterface> allList = new ArrayList<>();
        allList.add(list);
        allList.add(new STRING("2;1"));

        LIST<Object> objectLIST = new LIST<>();
        objectLIST.add(allList);

        ArrayList<IfcInterface> list1 = new ArrayList<>();
        list1.add(objectLIST);

        IfcFileDescription description = new IfcFileDescription(list1);
        System.out.println(String.format("FILE_DESCRIPTION(%s)", description));
    }
}
