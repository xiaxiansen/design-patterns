package com.atguigu.design.creatation.prototype;

import lombok.Data;

/**
 * @author: xia liang
 * @create: 2021/04/10 16:16
 */
@Data
public class User  implements Cloneable{
    private String username;
    private Integer age;
    public User(){
        System.out.println("user对象被创建");
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setUsername(username);
        user.setAge(age);
        return user;
    }
}
