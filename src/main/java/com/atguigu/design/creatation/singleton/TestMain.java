package com.atguigu.design.creatation.singleton;

import java.util.Map;

/**
 * @author: xia liang
 * @create: 2021/04/10 15:22
 */
public class TestMain {
    public static void main(String[] args) {
       /* Person person = Person.getInstance();
        Person person1 = Person.getInstance();
        System.out.println(person == person1);*/
//        Properties properties = System.getProperties();
//        System.out.println(properties);
        //系统环境变量
        Map<String, String> getenv = System.getenv();
        System.out.println(getenv);
    }
}
