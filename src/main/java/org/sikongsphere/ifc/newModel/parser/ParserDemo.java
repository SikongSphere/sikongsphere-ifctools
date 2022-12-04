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
package org.sikongsphere.ifc.newModel.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sikongsphere.ifc.model.infra.IfcClassContainer;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.IfcClassFactory;
import org.sikongsphere.ifc.newModel.IfcDataType;
import org.sikongsphere.ifc.newModel.IfcInterface;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.fileelement.IfcFileModel;
import org.sikongsphere.ifc.newModel.fileelement.IfcLogicNode;
import org.sikongsphere.ifc.newModel.schema.core.kernel.entity.*;
import org.sikongsphere.ifc.newModel.schema.core.productextension.entities.IfcRelAssociatesMaterial;
import org.sikongsphere.ifc.parser.IFCLexer;
import org.sikongsphere.ifc.parser.IFCParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ParserDemo {

    private static final Map<Integer, IfcAbstractClass> newElements = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        CharStream stream = CharStreams.fromFileName(
            "F:\\workspace\\idea\\sikongsphere-ifctools\\src\\test\\resources\\demo1.ifc"
        );
        IFCLexer ifcLexer = new IFCLexer(stream);
        IFCParser ifcParser = new IFCParser(new CommonTokenStream(ifcLexer));
        IFCParser.IfcmodelContext ifcmodel = ifcParser.ifcmodel();
        IfcFileVisitor fileVisitor = new IfcFileVisitor();
        IfcFileModel ifcFileModel = fileVisitor.visitIfcmodel(ifcmodel);
        validate(ifcFileModel);
        convert(ifcFileModel);
        link();
        ifcFileModel.getBody().setElements(newElements);
        System.out.println();
    }

    /**
     * 有一些对象，在很早的位置就需要引用，但是对程序来说，还没有进行初始化，需要对相关的内容进行填充
     *
     * @param ifcInterface
     */

    public static void validate(IfcFileModel ifcInterface) {
        Map<Integer, IfcAbstractClass> elements = ifcInterface.getBody().getElements();
        for (Map.Entry<Integer, IfcAbstractClass> classEntry : elements.entrySet()) {
            IfcAbstractClass value = classEntry.getValue();
            validateItem(value, elements);
        }
    }

    public static IfcInterface validateItem(
        IfcInterface node,
        Map<Integer, IfcAbstractClass> elements
    ) {
        if (node instanceof IfcLogicNode) {
            List<Object> args = ((IfcLogicNode) node).getArgs();
            if (((IfcLogicNode) node).getIfcClassName() == null) {
                return elements.get(((IfcLogicNode) node).getStepNumber());
            }
            for (int i = 0; i < args.size(); i++) {
                if (args.get(i) instanceof IfcLogicNode
                    && ((IfcLogicNode) args.get(i)).getIfcClassName() == null) {
                    IfcLogicNode arg = (IfcLogicNode) args.get(i);
                    args.set(i, elements.get(arg.getStepNumber()));
                } else if (args.get(i) instanceof LIST) {
                    validateItem((IfcInterface) args.get(i), elements);
                } else {
                    IfcInterface ifcInterface = validateItem((IfcInterface) args.get(i), elements);
                    args.set(i, ifcInterface);
                }
            }
        } else if (node instanceof LIST) {
            List<IfcInterface> objects = ((LIST<IfcInterface>) node).getObjects();
            for (int i = 0; i < objects.size(); i++) {
                IfcInterface fillNode = validateItem(objects.get(i), elements);
                objects.set(i, fillNode);
            }
        }
        return node;
    }

    public static void convert(IfcFileModel ifcInterface) {
        Map<Integer, IfcAbstractClass> elements = ifcInterface.getBody().getElements();
        Set<Map.Entry<Integer, IfcAbstractClass>> entries = elements.entrySet();
        for (Map.Entry<Integer, IfcAbstractClass> entry : entries) {
            convertItem(entry.getValue());
        }
    }

    public static IfcAbstractClass convertItem(IfcAbstractClass node) {
        if (node instanceof IfcLogicNode) {
            if (newElements.containsKey(node.getStepNumber())) {
                return newElements.get(node.getStepNumber());
            }
            List<Object> args = ((IfcLogicNode) node).getArgs();
            for (int i = 0; i < args.size(); i++) {
                Object arg = args.get(i);
                if (arg instanceof IfcLogicNode) {
                    if (newElements.containsKey(((IfcLogicNode) arg).getStepNumber())) {
                        args.set(i, newElements.get(((IfcLogicNode) arg).getStepNumber()));
                    } else if (IfcDataType.class.isAssignableFrom(
                        IfcClassContainer.getInstance().get(((IfcLogicNode) arg).getIfcClassName())
                    )) {
                        IfcInterface ifcClass = IfcClassFactory.getIfcClass(
                            ((IfcLogicNode) arg).getIfcClassName(),
                            ((IfcLogicNode) arg).getArgs().toArray()
                        );
                        args.set(i, ifcClass);
                    } else {
                        IfcAbstractClass aClass = convertItem((IfcAbstractClass) arg);
                        args.set(i, aClass);
                    }
                } else if (arg instanceof LIST) {
                    List<IfcInterface> objects = ((LIST<IfcInterface>) arg).getObjects();
                    for (int j = 0; j < objects.size(); j++) {
                        IfcInterface objClass = objects.get(j);
                        if (objClass instanceof IfcAbstractClass) {
                            IfcAbstractClass aClass = convertItem(
                                (IfcAbstractClass) objects.get(j)
                            );
                            objects.set(j, aClass);
                            newElements.put(((IfcAbstractClass) objClass).getStepNumber(), aClass);
                        }
                    }
                }
            }

            IfcInterface ifcClass = IfcClassFactory.getIfcClass(
                ((IfcLogicNode) node).getIfcClassName(),
                args.toArray()
            );
            ((IfcAbstractClass) ifcClass).setStepNumber(node.getStepNumber());
            newElements.put(node.getStepNumber(), (IfcAbstractClass) ifcClass);
            return (IfcAbstractClass) ifcClass;
        }
        return node;
    }

    public static void link() {
        Set<Map.Entry<Integer, IfcAbstractClass>> entries = newElements.entrySet();
        for (Map.Entry<Integer, IfcAbstractClass> entry : entries) {
            if (IfcRelationship.class.isAssignableFrom(entry.getValue().getClass())) {
                linkItem((IfcRelationship) entry.getValue());
            }
        }
    }

    public static void linkItem(IfcRelationship node) {
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
