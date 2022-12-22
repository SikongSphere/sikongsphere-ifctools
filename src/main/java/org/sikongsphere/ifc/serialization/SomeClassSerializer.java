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
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

public class SomeClassSerializer extends Serializer<SomeClass> {

    @Override
    public void write(Kryo kryo, Output output, SomeClass someClass) {
        output.writeInt(someClass.x);
        output.writeInt(someClass.y);
        kryo.writeClassAndObject(output, someClass);
    }

    @Override
    public SomeClass read(Kryo kryo, Input input, Class<SomeClass> aClass) {
        SomeClass someClass = new SomeClass();
        kryo.reference(someClass);
        someClass.x = input.readInt();
        someClass.y = input.readInt();
        someClass.something = kryo.readClassAndObject(input);
        return someClass;
    }
}
