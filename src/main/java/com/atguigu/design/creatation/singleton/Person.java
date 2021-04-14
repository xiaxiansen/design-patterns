package com.atguigu.design.creatation.singleton;

/**
 * @author: xia liang
 * @create: 2021/04/10 15:22
 */
public class Person {
    private Person(){}
    private static volatile Person  instance ;
    public static Person getInstance(){
        if(instance == null){
            synchronized (Person.class){
                if(instance == null){
                    instance = new Person();
                }
            }
        }
        return instance;
    }
}
