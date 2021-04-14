package com.atguigu.design.structural.proxy.dynamic2;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: xia liang
 * @create: 2021/04/13 11:05
 */
public class ProxyClass  implements InvocationHandler {
    private Object target;
    public ProxyClass(Object o){
        this.target = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk前置通知...............");
        Object invoke = method.invoke(target, args);
        System.out.println("jdk后置通知...............");
        return invoke;
    }
}
