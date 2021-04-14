package com.atguigu.design.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xia liang
 * @create: 2021/04/10 16:18
 */
public class GuiguMybatis {
    Map<String,User> userCache = new HashMap<>();
    public User getUser(String username) throws Exception {
        User user = null;
        //缓存中没有
        if(!userCache.containsKey(username)){
            //查询数据库
            user = getUserFromDb(username);
        }else {
            user = userCache.get(username);
            System.out.println("从缓存中拿到的是:"+user);
            //从这个对象快速得到一个克隆体
            user = (User)user.clone();
        }
      
        return user;
    }
    
    private User getUserFromDb(String username) throws Exception {
        User user = new User();
        user.setUsername(username);
        user.setAge(30);
        userCache.put(username, (User) user.clone());
        return user;
    }
}
