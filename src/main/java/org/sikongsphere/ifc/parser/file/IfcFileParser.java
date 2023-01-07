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
package org.sikongsphere.ifc.parser.file;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sikongsphere.ifc.infra.IfcClassContainer;
import org.sikongsphere.ifc.model.*;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;
import org.sikongsphere.ifc.model.fileelement.IfcLogicNode;
import org.sikongsphere.ifc.infra.IfcClassFactory;
import org.sikongsphere.ifc.model.schema.kernel.entity.*;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcRelAssociatesMaterial;
import org.sikongsphere.ifc.parser.gen.IFCLexer;
import org.sikongsphere.ifc.parser.gen.IFCParser;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Interface for Ifc File
 *
 * @author zaiyuan
 * @date 2022/12/04 15:27
 */
public class IfcFileParser extends AbstractFileParser {

    public static void main(String[] args) throws IOException, NoSuchMethodException,
        InvocationTargetException, IllegalAccessException {
        IfcFileParser fileParser = new IfcFileParser();
        Model model = fileParser.parseFile(
            "src/test/resources/blank.ifc"
        );
        ((IfcFileModel) model).printFile(
            "src/test/resources/new_blank.ifc"
        );
        System.out.println();
    }

    @Override
    public Model parseFile(String path) throws IOException {
        String content = preProcessor(path);
        IfcFileModel ifcFileModel = parse(content);
        Map<Integer, IfcAbstractClass> internalElements = new TreeMap<>();
        validate(ifcFileModel);
        convert(ifcFileModel, internalElements);
        link(internalElements);
        ifcFileModel.getBody().setElements(internalElements);
        return ifcFileModel;
    }

    public String preProcessor(String path) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        String slashTag = "[SLASH]";
        List<String> strings = lines.stream()
            .map(i -> i.replace("\\", slashTag))
            .collect(Collectors.toList());
        return String.join("", strings);
    }

    public IfcFileModel parse(String content) throws IOException {
        CharStream stream = CharStreams.fromString(content);
        IFCLexer ifcLexer = new IFCLexer(stream);
        IFCParser ifcParser = new IFCParser(new CommonTokenStream(ifcLexer));
        IFCParser.IfcmodelContext modelContext = ifcParser.ifcmodel();
        IfcFileVisitor fileVisitor = new IfcFileVisitor();
        return fileVisitor.visitIfcmodel(modelContext);
    }

    /**
     * 有一些对象，在很早的位置就需要引用，但是对程序来说，还没有进行初始化，需要对相关的内容进行填充
     *
     * @param ifcInterface
     */
    public void validate(IfcFileModel ifcInterface) {
        Map<Integer, IfcAbstractClass> elements = ifcInterface.getBody().getElements();
        for (Map.Entry<Integer, IfcAbstractClass> classEntry : elements.entrySet()) {
            IfcAbstractClass value = classEntry.getValue();
            validateItem(value, elements);
        }
    }

    public IfcInterface validateItem(IfcInterface node, Map<Integer, IfcAbstractClass> elements) {
        if (node instanceof IfcLogicNode) {
            List<Object> args = ((IfcLogicNode) node).getArgs();
            // 如果 node 没有className，那说明是第一次访问的成员节点
            // 例如：#31= IFCAXIS2PLACEMENT3D(#6,$,$);
            // 我们并不知道 #6 是什么东西，因此就需要从elements中获取。
            if (((IfcLogicNode) node).getIfcClassName() == null) {
                return elements.get(((IfcLogicNode) node).getStepNumber());
            }
            for (int i = 0; i < args.size(); i++) {
                if (args.get(i) instanceof IfcLogicNode
                    && ((IfcLogicNode) args.get(i)).getIfcClassName() == null) {
                    // 如果参数中存在类似于上述的情况，同样需要从elements中获取
                    IfcLogicNode arg = (IfcLogicNode) args.get(i);
                    args.set(i, elements.get(arg.getStepNumber()));
                } else if (args.get(i) instanceof LIST) {
                    // 如果参数中存在LIST，那么需要递归
                    // LIST本身不需要修改参数
                    validateItem((IfcInterface) args.get(i), elements);
                } else {
                    // 如果是其他的对象，童谣需要递归
                    // 其他对象是需要对elements进行修改的
                    IfcInterface ifcInterface = validateItem((IfcInterface) args.get(i), elements);
                    args.set(i, ifcInterface);
                }
            }
        } else if (node instanceof LIST) {
            // 如果访问到的是LIST，那么同样需要对LIST进行修改
            List<IfcInterface> objects = ((LIST<IfcInterface>) node).getObjects();
            for (int i = 0; i < objects.size(); i++) {
                IfcInterface fillNode = validateItem(objects.get(i), elements);
                objects.set(i, fillNode);
            }
        }
        return node;
    }

    public void convert(IfcFileModel ifcInterface, Map<Integer, IfcAbstractClass> myElements) {
        Map<Integer, IfcAbstractClass> elements = ifcInterface.getBody().getElements();
        Set<Map.Entry<Integer, IfcAbstractClass>> entries = elements.entrySet();
        for (Map.Entry<Integer, IfcAbstractClass> entry : entries) {
            convertItem(entry.getValue(), myElements);
        }
    }

    public IfcAbstractClass convertItem(
        IfcAbstractClass node,
        Map<Integer, IfcAbstractClass> myElements
    ) {
        if (node instanceof IfcLogicNode) {
            if (myElements.containsKey(node.getStepNumber())) {
                return myElements.get(node.getStepNumber());
            }
            List<Object> args = ((IfcLogicNode) node).getArgs();
            for (int i = 0; i < args.size(); i++) {
                Object arg = args.get(i);
                if (arg instanceof IfcLogicNode) {
                    if (myElements.containsKey(((IfcLogicNode) arg).getStepNumber())) {
                        args.set(i, myElements.get(((IfcLogicNode) arg).getStepNumber()));
                    } else if (IfcDataType.class.isAssignableFrom(
                        IfcClassContainer.getInstance().get(((IfcLogicNode) arg).getIfcClassName())
                    )) {
                        IfcInterface ifcClass = IfcClassFactory.getIfcClass(
                            ((IfcLogicNode) arg).getIfcClassName(),
                            ((IfcLogicNode) arg).getArgs().toArray()
                        );
                        args.set(i, ifcClass);
                    } else {
                        IfcAbstractClass aClass = convertItem((IfcAbstractClass) arg, myElements);
                        args.set(i, aClass);
                    }
                } else if (arg instanceof LIST) {
                    List<IfcInterface> objects = ((LIST<IfcInterface>) arg).getObjects();
                    for (int j = 0; j < objects.size(); j++) {
                        IfcInterface objClass = objects.get(j);
                        if (objClass instanceof IfcAbstractClass
                            && ((IfcAbstractClass) objClass).getStepNumber() != 0) {
                            IfcAbstractClass aClass = convertItem(
                                (IfcAbstractClass) objects.get(j),
                                myElements
                            );
                            objects.set(j, aClass);
                            myElements.put(((IfcAbstractClass) objClass).getStepNumber(), aClass);
                        } else if (objClass instanceof IfcAbstractClass
                            && ((IfcAbstractClass) objClass).getStepNumber() == 0) {
                                IfcInterface ifcClass = IfcClassFactory.getIfcClass(
                                    ((IfcLogicNode) objClass).getIfcClassName(),
                                    ((IfcLogicNode) objClass).getArgs().toArray()
                                );
                                objects.set(j, ifcClass);
                            }
                    }
                }
            }
            IfcInterface ifcClass = IfcClassFactory.getIfcClass(
                ((IfcLogicNode) node).getIfcClassName(),
                args.toArray()
            );
            ((IfcAbstractClass) ifcClass).setStepNumber(node.getStepNumber());
            myElements.put(node.getStepNumber(), (IfcAbstractClass) ifcClass);
            return (IfcAbstractClass) ifcClass;
        }
        return node;
    }

    public void link(Map<Integer, IfcAbstractClass> myElements) {
        Set<Map.Entry<Integer, IfcAbstractClass>> entries = myElements.entrySet();
        for (Map.Entry<Integer, IfcAbstractClass> entry : entries) {
            if (IfcRelationship.class.isAssignableFrom(entry.getValue().getClass())) {
                linkItem((IfcRelationship) entry.getValue());
            }
        }
    }

    public void linkItem(IfcRelationship node) {
        if (node instanceof IfcRelAggregates) {
            IfcObjectDefinition relatingObject = ((IfcRelAggregates) node).getRelatingObject();
            SET<IfcObjectDefinition> relatedObjects = ((IfcRelAggregates) node).getRelatedObjects();
            relatingObject.addIsDecomposedBy((IfcRelDecomposes) node);
            for (IfcObjectDefinition relatedObject : relatedObjects.getObjects()) {
                relatedObject.addDecompose((IfcRelDecomposes) node);
            }
        } else if (node instanceof IfcRelDefinesByProperties) {
            IfcPropertySetDefinition relatingPropertyDefinition = ((IfcRelDefinesByProperties) node)
                .getRelatingPropertyDefinition();
            Set<IfcObject> objects = ((IfcRelDefinesByProperties) node).getRelatedObjects()
                .getObjects();
            relatingPropertyDefinition.addPropertyDefinitionOf((IfcRelDefinesByProperties) node);
            for (IfcObject object : objects) {
                object.addIsDefinedBy((IfcRelDefines) node);
            }
        } else if (node instanceof IfcRelAssociatesMaterial) {
            Set<IfcRoot> objects = ((IfcRelAssociatesMaterial) node).getRelatedObjects()
                .getObjects();
            for (IfcRoot object : objects) {
                if (object instanceof IfcObjectDefinition) {
                    ((IfcObjectDefinition) object).addHasAssociations((IfcRelAssociates) node);
                }
            }

        }
    }

}
