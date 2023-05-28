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

import java.lang.annotation.*;
import java.util.Set;

/**
 * 注解在参数类型直接为接口
 * {@link org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue}
 * 的属性上
 * 被注解的属性，用接口类型接收对象，在ifc转json如果丢了具体对象类型，那么在json转ifc时
 * 则无法知道该属性值该实例化成接口的哪个实现
 * 被注解的属性在ifc转json的过程中，在方法
 * {@link org.sikongsphere.ifc.io.converter.ConvertUtils#jsonifyEntity(Object, Set)}
 * 方法中会被放到属性
 * {@link org.sikongsphere.ifc.io.converter.IfcToJson#specialIfcValue}
 * 中，然后在方法
 * {@link org.sikongsphere.ifc.io.converter.IfcToJson#getAttributeValue(Object)}
 * 中转成map时添加type数据。
 * @author yese
 * @date 2023-05-20
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IfcAbstractValueField {
}
