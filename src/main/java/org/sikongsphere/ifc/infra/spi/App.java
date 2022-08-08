package org.sikongsphere.ifc.infra.spi;

import org.sikongsphere.ifc.infra.spi.impl.HelloServiceImpl1;
import sun.misc.Service;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ServiceLoader;

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
