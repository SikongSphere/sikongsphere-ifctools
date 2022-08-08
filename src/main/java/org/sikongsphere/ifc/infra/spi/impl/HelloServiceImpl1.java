package org.sikongsphere.ifc.infra.spi.impl;

import org.sikongsphere.ifc.infra.spi.HelloService;

public class HelloServiceImpl1 implements HelloService {

    public HelloServiceImpl1() {

    }

    public HelloServiceImpl1(String str1) {

    }

    @Override
    public void sayHello() {
        System.out.println("hello impl1");
    }
}
