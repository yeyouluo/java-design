package com.yeyouluo;

import cn.hutool.setting.dialect.Props;
import com.yeyouluo.dao.IDepartmentDao;
import com.yeyouluo.dao.IUserDao;
import com.yeyouluo.entity.Department;
import com.yeyouluo.entity.User;
import com.yeyouluo.service.DataAccess;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/13
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        // 读取配置文件
        Props props = new Props("db.properties");
        String db = props.getProperty("db");

        // 获取DataAccess
        DataAccess dataAccess = new DataAccess();
        dataAccess.setDb(db);

        IUserDao userDao = dataAccess.createUserDao();
        userDao.insert(new User(1, "yeyouluo"));
        userDao.select(1);

        IDepartmentDao departmentDao = dataAccess.createDepartmentDao();
        departmentDao.insert(new Department(1,"yeyouluo's department"));
        departmentDao.select(1);
    }
}
