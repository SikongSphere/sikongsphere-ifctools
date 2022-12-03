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
package org.sikongsphere.ifc.newModel;

import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.exception.SikongSphereParseException;
import org.sikongsphere.ifc.model.infra.IfcClassContainer;
import org.sikongsphere.ifc.newModel.datatype.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/**
 * This class is used to encapsulate actor role information
 *
 * @author zaiyuan
 * @date 2022-08-28 18:30:00
 */
public class IfcClassFactory {
    public static IfcInterface getIfcClass(String ifcClassName, Object... args) {
        IfcClassContainer container = IfcClassContainer.getInstance();
        Constructor<?>[] constructors = container.get(ifcClassName.toUpperCase(Locale.ROOT))
            .getConstructors();
        IfcAbstractClass ifcClass = null;
        for (Constructor<?> constructor : constructors) {
            if (constructor.isAnnotationPresent(IfcParserConstructor.class)) {
                try {
                    validateType(constructor, args);
                    ifcClass = (IfcAbstractClass) constructor.newInstance(args);
                } catch (Exception e) {
                    throw new SikongSphereParseException(
                        String.format(
                            "Class for %s does not instantiated successfully.",
                            ifcClassName
                        )
                    );
                }
            }
        }
        return ifcClass;
    }

    private static void validateType(Constructor<?> constructor, Object... args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException,
        IllegalAccessException {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        for (int i = 0; i < length; i++) {
            // handle null
            if (args[i] == null) {
                continue;
            }

            if (args[i].getClass() == STRING.class
                && ((STRING) args[i]).value.equals(StringConstant.ASTERISK)) {
                args[i] = parameterTypes[i].newInstance();
                continue;
            }

            // handle String
            if (args[i].getClass() == STRING.class
                || args[i].getClass() == INTEGER.class
                || args[i].getClass() == SCIENTIFICNOTATION.class) {
                Constructor<?> con = parameterTypes[i].getConstructor(args[i].getClass());
                args[i] = con.newInstance(args[i]);
                continue;
            }

            // handle Enum
            if (args[i].getClass() == ENUM.class) {
                for (Object constant : parameterTypes[i].getEnumConstants()) {
                    if (args[i].getClass().isEnum()) {
                        continue;
                    }
                    if (((ENUM) args[i]).getEnumName().equals(((Enum<?>) constant).name())) {
                        args[i] = constant;
                    }
                }
            }

            if ((args[i].getClass() == SET.class) && (parameterTypes[i] == LIST.class)) {
                SET<IfcInterface> origin = (SET<IfcInterface>) args[i];
                LIST<IfcInterface> list = new LIST<>();
                list.addAll(origin);
                args[i] = list;
                continue;
            }

            if ((args[i].getClass() == LIST.class) && (parameterTypes[i] == SET.class)) {
                LIST<IfcInterface> origin = (LIST<IfcInterface>) args[i];
                SET<IfcInterface> set = new SET<>();
                set.addAll(origin);
                args[i] = set;
                continue;
            }

        }
    }
}
