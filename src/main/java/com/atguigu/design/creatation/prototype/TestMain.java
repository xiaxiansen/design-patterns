package com.atguigu.design.creatation.prototype;

/**
 * @author: xia liang
 * @create: 2021/04/10 15:42
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        GuiguMybatis mybatis = new GuiguMybatis();
        User zhangsan = mybatis.getUser("zhangsan");
      
        System.out.println("1=>"+zhangsan);
        User zhangsan2 = mybatis.getUser("zhangsan");
        System.out.println("修改前 2=>"+zhangsan2);
        zhangsan2.setUsername("lisi2");
        System.out.println("修改后 2=>"+zhangsan2);
        User zhangsa3 = mybatis.getUser("zhangsan");
        System.out.println("3=>"+zhangsa3);
        User zhangsan4 = mybatis.getUser("zhangsan");
        System.out.println("3=>"+zhangsan4);
    //HashMap的存取为浅拷贝
       /* User user = new User();
        user.setUsername("1");
        Map<String,User> map = new HashMap<>();
        map.put("1", user);
        User user1 = map.get("1");
        user1.setUsername("2");
        User user2 = map.get("1");
        System.out.println(user==user2);
        System.out.println(user2);*/
    }
}
