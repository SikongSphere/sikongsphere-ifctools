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
package org.sikongsphere.ifc.serialization;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IsoTagEnum;
import org.sikongsphere.ifc.common.exception.SikongSphereException;
import org.sikongsphere.ifc.infra.IfcClassDictionary;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.IfcDataType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.fileelement.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Map;

public class IfcFileModelKryoSerializer extends IfcKryoSerializer<IfcFileModel> {

    /**
     * Ifc Dictionary
     */
    IfcClassDictionary dictionary = IfcClassDictionary.getInstance();

    @Override
    public void write(Kryo kryo, Output output, IfcFileModel ifcFileModel) {
        try {
            // write magic
            writeMagic(output);
            // write iso tag
            writeIsoTag(output, ifcFileModel.isoTagEnum);
            // write header
            writeHeader(output, ifcFileModel.getHeader());
            // write body
            // writeBody(output, ifcFileModel.getBody());
        } catch (Exception e) {
            throw new SikongSphereException();
        }
    }

    @Override
    public IfcFileModel read(Kryo kryo, Input input, Class<IfcFileModel> aClass) {
        return null;
    }

    public void writeMagic(Output output) {
        // CBBD: Corbusier Building, this is hexadecimal number, which can be expressed in decimal
        // as 52157
        output.writeInt(0xCBBD);
        // version
        output.writeShort(1_0_0_0);
    }

    public void writeIsoTag(Output output, IsoTagEnum isoTagEnum) {
        switch (isoTagEnum) {
            case ISO_10303_21:
                output.writeByte(0);
                break;
            default:
                throw new SikongSphereException();
        }
    }

    public void writeHeader(Output output, IfcHeader header) {
        // handle schema
        IfcFileDescription description = header.getFileDescription();
        IfcFileName name = header.getFileName();
        IfcFileSchema schema = header.getFileSchema();

    }

    public void writeBody(Output output, IfcBody body) throws InvocationTargetException,
        NoSuchMethodException, IllegalAccessException {
        Map<Integer, IfcAbstractClass> elements = body.getElements();
        // write elements size
        output.writeInt(elements.size());
        for (Map.Entry<Integer, IfcAbstractClass> entry : elements.entrySet()) {
            output.writeInt(entry.getKey());
            writeDataEntity(output, entry.getValue());
        }
    }

    public void writeDataEntity(Output output, IfcAbstractClass item) throws NoSuchMethodException,
        InvocationTargetException, IllegalAccessException {
        output.writeInt(item.getStepNumber());
        output.writeInt(dictionary.getIndexByClass(item.getClass()));
        for (Constructor<?> constructor : item.getClass().getConstructors()) {
            if (constructor.isAnnotationPresent(IfcParserConstructor.class)) {
                Parameter[] parameters = constructor.getParameters();
                // the number of parameters in constructor
                output.writeByte(parameters.length);
                for (Parameter parameter : parameters) {
                    // get parameter object
                    String name = parameter.getName();
                    String getFunction = String.format(
                        "get%s%s",
                        name.substring(0, 1).toUpperCase(),
                        name.substring(1)
                    );
                    Method method = item.getClass().getMethod(getFunction);
                    Object obj = method.invoke(item);

                    /**
                     * 1 : enumeration
                     * 2 : LIST
                     * 3 : SET
                     * 4 : IfcAbstractClass with step number
                     * 5 : IfcAbstractClass without step number
                     * 6 : IfcDataType
                     */
                    if (obj instanceof Enum) {
                        output.writeByte(1);
                        writeEnumeration(output, (Enum<?>) obj);
                    } else if (obj instanceof LIST) {
                        output.writeByte(2);
                    } else if (obj instanceof SET) {
                        output.writeByte(3);
                    } else if (obj instanceof IfcAbstractClass) {
                        if (((IfcAbstractClass) obj).getStepNumber() == 0) {
                            output.writeByte(4);
                            output.writeInt(((IfcAbstractClass) obj).getStepNumber());
                        } else {
                            output.writeByte(5);
                        }
                    } else if (obj instanceof IfcDataType) {
                        output.writeByte(6);
                    }
                }
                return;
            }
        }
    }

    /**
     * write enumeration
     * class index(short) + enumeration ordinal(byte)
     *
     * @param output      out put stream
     * @param enumeration enumeration
     */
    public void writeEnumeration(Output output, Enum<?> enumeration) {
        output.writeShort(dictionary.getIndexByClass(enumeration.getClass()));
        output.writeByte(enumeration.ordinal());
    }

    public Enum<?> readEnumeration(Input input) {
        short classIndex = input.readShort();
        byte enumOrdinal = input.readByte();
        Class<?> enumClazz = dictionary.getClassByIndex((int) classIndex);
        return (Enum<?>) enumClazz.getEnumConstants()[enumOrdinal];
    }
}
