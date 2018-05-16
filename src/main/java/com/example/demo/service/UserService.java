package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @author: codeyung  E-mail:yjc199308@gmail.com
 * @date: 2018/5/16.下午6:57
 */

@Repository
public class UserService {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    UserDao userDao;

    public User getUser(long userId) {
        String key = "user_" + userId;

        User user;
        if (redisTemplate.hasKey(key)) {

            return (User) redisTemplate.opsForValue().get(key);

        }
        user = userDao.getUser(userId);
        if (user != null) {
            redisTemplate.opsForValue().set(key, user, 150, TimeUnit.SECONDS);
        }
        System.out.println(" getUser " + userId);
        return user;
    }
}
