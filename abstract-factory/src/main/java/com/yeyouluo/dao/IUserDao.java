package com.yeyouluo.dao;

import com.yeyouluo.entity.User;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/13
 */
public interface IUserDao {
    public void insert(User user);
    public User select(int id);
}
