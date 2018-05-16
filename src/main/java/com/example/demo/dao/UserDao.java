package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author: codeyung  E-mail:yjc199308@gmail.com
 * @date: 2018/5/16.下午6:02
 */
public interface UserDao {

    User getUser(@Param("userId") long userId);

}
