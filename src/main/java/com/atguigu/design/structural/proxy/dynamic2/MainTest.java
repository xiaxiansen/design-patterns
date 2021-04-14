package com.atguigu.design.structural.proxy.dynamic2;

import java.lang.reflect.Proxy;

/**
 * @author: xia liang
 * @create: 2021/04/13 11:07
 */
public class MainTest {
    public static void main(String[] args) {
        Interface1 interface1 = new InterfaceClass();
        Interface1 o = (Interface1) Proxy.newProxyInstance(interface1.getClass().getClassLoader(), interface1.getClass().getInterfaces(), new ProxyClass(interface1));
        o.run();
    }
}
