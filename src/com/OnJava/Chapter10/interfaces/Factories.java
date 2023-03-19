package com.OnJava.Chapter10.interfaces;

import java.security.Provider;

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service gerService();
}

class Service1 implements Service {
    Service1() {}

    @Override
    public void method1() {
        System.out.println("Service1.method1");
    }

    @Override
    public void method2() {
        System.out.println("Service1.method2");
    }
}

class ServiceFactory1 implements ServiceFactory {
    @Override
    public Service gerService() {
        return new Service1();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service service = factory.gerService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new ServiceFactory1());
    }
}
