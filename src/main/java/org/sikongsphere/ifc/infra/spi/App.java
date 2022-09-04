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
package org.sikongsphere.ifc.infra.spi;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ServiceLoader;
import org.sikongsphere.ifc.infra.spi.impl.HelloServiceImpl1;
import sun.misc.Service;

@SuppressWarnings("restriction")
public class App {
    public static void main(String[] args) throws NoSuchMethodException {
        Constructor<HelloServiceImpl1> constructors = HelloServiceImpl1.class.getConstructor();
        // 方式 一
        Iterator<HelloService> providers = Service.providers(HelloService.class);
        while (providers.hasNext()) {
            HelloService ser = providers.next();
            ser.sayHello();
        }

        System.out.println("-----------------分割线---------------");

        // 方式 二
        ServiceLoader<HelloService> load = ServiceLoader.load(HelloService.class);
        for (HelloService ser : load) {
            ser.sayHello();
        }
    }
}
