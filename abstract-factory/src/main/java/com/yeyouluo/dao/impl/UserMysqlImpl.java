package com.yeyouluo.dao.impl;

import com.yeyouluo.entity.User;
import com.yeyouluo.dao.IUserDao;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/13
 */
public class UserMysqlImpl implements IUserDao {
    @Override
    public void insert(User user) {
        System.out.println("MySQL: 插入一条记录：" + user.toString());
    }

    @Override
    public User select(int id) {
        System.out.println("MySQL：查询到结果：id=" + id);
        return new User(id, "Default Name from MySQL");
    }
}
