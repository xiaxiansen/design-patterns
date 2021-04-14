package com.atguigu.design.structural.proxy.cglib2;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author: xia liang
 * @create: 2021/04/13 11:13
 */
public class MainTest {
    public static void main(String[] args) {
        TikTok tok = new TikTok();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(tok.getClass());
        enhancer.setCallback(new ProxyClass());
        TikTok tok1 = (TikTok) enhancer.create();
        tok1.run();
    }
}
