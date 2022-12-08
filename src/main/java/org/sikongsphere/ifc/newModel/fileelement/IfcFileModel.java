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
package org.sikongsphere.ifc.newModel.fileelement;

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IsoTagEnum;
import org.sikongsphere.ifc.common.exception.SikongSphereException;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.IfcDataType;
import org.sikongsphere.ifc.newModel.IfcFileElement;
import org.sikongsphere.ifc.newModel.Model;
import org.sikongsphere.ifc.newModel.datatype.*;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is used to encapsulate IfcModel information
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcFileModel extends IfcFileElement implements Model {
    public IsoTagEnum isoTagEnum = IsoTagEnum.ISO_10303_21;
    private IfcHeader header;
    private IfcBody body;

    public IfcFileModel(IfcHeader header, IfcBody body) {
        this.header = header;
        this.body = body;
    }

    public IsoTagEnum getIsoTagEnum() {
        return isoTagEnum;
    }

    public void setIsoTagEnum(IsoTagEnum isoTagEnum) {
        this.isoTagEnum = isoTagEnum;
    }

    public IfcHeader getHeader() {
        return header;
    }

    public void setHeader(IfcHeader header) {
        this.header = header;
    }

    public IfcBody getBody() {
        return body;
    }

    public void setBody(IfcBody body) {
        this.body = body;
    }

    public void printFile(String path) throws NoSuchMethodException, InvocationTargetException,
        IllegalAccessException, IOException {
        FileWriter writer = new FileWriter(path);
        writer.write("ISO-10303-21;\n");
        writer.write("HEADER;\n");
        writer.write(
            String.format("FILE_DESCRIPTION%s;%n", getHeaderItem(header.getFileDescription()))
        );
        writer.write(String.format("FILE_NAME%s;%n", getHeaderItem(header.getFileName())));
        writer.write(String.format("FILE_SCHEMA%s;%n", getHeaderItem(header.getFileSchema())));
        writer.write("ENDSEC;\n");
        writer.write("\r\n");
        writer.write("DATA;\n");
        for (Map.Entry<Integer, IfcAbstractClass> entry : body.getElements().entrySet()) {
            writer.write(String.format("#%s= %s%n", entry.getKey(), getFileItem(entry.getValue())));
        }
        writer.write("ENDSEC;\n");
        writer.write("\r\n");

        writer.write("END-ISO-10303-21;\n");
        writer.close();
    }

    public String getHeaderItem(IfcFileElement element) {
        List<String> strings = element.getParams()
            .stream()
            .map(this::getParamString)
            .collect(Collectors.toList());
        return String.join(",", strings);
    }

    public String getFileItem(IfcAbstractClass object) throws NoSuchMethodException,
        InvocationTargetException, IllegalAccessException {
        List<List<Field>> objects = new ArrayList<>();
        Class<?> superClass = object.getClass();
        while (superClass != null) {
            List<Field> fields1 = Arrays.stream(superClass.getDeclaredFields())
                .filter(i -> !i.isAnnotationPresent(IfcInverseParameter.class))
                .filter(i -> !"stepNumber".equals(i.getName()))
                .collect(Collectors.toList());
            objects.add(fields1);
            superClass = superClass.getSuperclass();
        }

        List<String> strings = new ArrayList<>();
        for (int i = objects.size() - 1; i >= 0; i--) {
            List<Field> fields1 = objects.get(i);
            for (Field field : fields1) {
                String name = field.getName();
                String getFunction = String.format(
                    "get%s%s",
                    name.substring(0, 1).toUpperCase(),
                    name.substring(1)
                );
                Object o = object.getClass().getMethod(getFunction).invoke(object);
                strings.add(getParamString(o));
            }
        }

        assert object.getClass() != null;
        return String.format(
            "%s(%s);",
            object.getClass().getSimpleName().toUpperCase(),
            String.join(",", strings)
        );
    }

    public String getParamString(Object o) {
        if (o == null) {
            return "$";
        } else if (STRING.class.isAssignableFrom(o.getClass())) {
            return String.format("'%s'", ((STRING) o).value);
        } else if (INTEGER.class.isAssignableFrom(o.getClass())) {
            return ((INTEGER) o).value + "";
        } else if (SCIENTIFICNOTATION.class.isAssignableFrom(o.getClass())) {
            return ((SCIENTIFICNOTATION) o).getString();
        } else if (o instanceof DOUBLE) {
            double doubleValue = ((DOUBLE) o).value;
            if (doubleValue == (int) doubleValue) {
                return (int) doubleValue + ".";
            } else {
                return doubleValue + "";
            }
        } else if (IfcAbstractClass.class.isAssignableFrom(o.getClass())) {
            if (((IfcAbstractClass) o).getStepNumber() == 0) {
                return StringConstant.ASTERISK;
            } else {
                return String.format("#%s", ((IfcAbstractClass) o).getStepNumber());
            }
        } else if (Enum.class.isAssignableFrom(o.getClass())) {
            return String.format(".%s.", o);
        } else if (o instanceof LIST) {
            List<Object> objects = ((LIST<Object>) o).getObjects();
            List<String> strings = new ArrayList<>();
            for (Object object : objects) {
                strings.add(getParamString(object));
            }
            return String.format("(%s)", String.join(",", strings));
        } else if (o instanceof SET) {
            Set<Object> objects = ((SET<Object>) o).getObjects();
            LinkedHashSet<String> strings = new LinkedHashSet<>();
            for (Object object : objects) {
                strings.add(getParamString(object));
            }
            return String.format("(%s)", String.join(",", strings));
        } else if (IfcDataType.class.isAssignableFrom(o.getClass())) {
            return ((DOUBLE) o).value + "";
        } else {
            throw new SikongSphereException("Unsupported Type");
        }
    }

    @Override
    public String toString() {
        String ifcFile = StringConstant.BEGIN_ISO + StringConstant.COLON + StringConstant.NEW_LINE
            + getHeader() + StringConstant.NEW_LINE + getBody() + StringConstant.NEW_LINE
            + StringConstant.END_ISO + StringConstant.COLON;

        return ifcFile;
    }
}
