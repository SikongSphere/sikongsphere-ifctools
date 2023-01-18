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
package org.sikongsphere.ifc.common.annotation;

import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;
import org.sikongsphere.ifc.model.fileelement.IfcLogicNode;

import java.lang.annotation.*;

/**
 * This is an annotation demo
 *
 * @Author: zaiyuan
 * @Date: 2022/09/10 11:47
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IfcClass {
    IfcLayer layer();

    IfcType type();

    IfcVersion version() default IfcVersion.IFC_2X3;

    boolean isStepElement() default true;

    Class<?> defaultClass() default IfcLogicNode.class;
}
