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
package org.sikongsphere.ifc.infra.spi.impl;

import org.sikongsphere.ifc.infra.spi.HelloService;

public class HelloServiceImpl1 implements HelloService {

    public HelloServiceImpl1() {}

    public HelloServiceImpl1(String str1) {}

    @Override
    public void sayHello() {
        System.out.println("hello impl1");
    }
}
