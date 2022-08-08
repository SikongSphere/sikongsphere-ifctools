package org.sikongsphere.ifc.infra.spi.impl;

import org.sikongsphere.ifc.infra.spi.HelloService;

public class HelloServiceImpl2 implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("hello impl2");
    }
}
