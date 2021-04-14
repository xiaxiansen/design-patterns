package com.atguigu.design.structural.proxy.cglib2;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: xia liang
 * @create: 2021/04/13 11:12
 */
public class ProxyClass implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib前置通知............");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib后置通知.............");
        return invokeSuper;
    }
}
