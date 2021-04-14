package com.atguigu.design.creatation.singleton;


/**
 * @author: xia liang
 * @create: 2021/04/12 13:55
 */
public class Student {
    private Student(){}
    private final static Student instance = new Student();
    public static Student getInstance(){
        return instance;
    }
}
