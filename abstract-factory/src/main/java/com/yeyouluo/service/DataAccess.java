package com.yeyouluo.service;

import com.yeyouluo.dao.IDepartmentDao;
import com.yeyouluo.dao.IUserDao;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/13
 */
public class DataAccess {
    private static final String PREFIX = "com.yeyouluo.dao.impl";
    private String db;

    public IUserDao createUserDao() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if( db != null && !"".equals(db) ) {
            String clazz = PREFIX + ".User" + db + "Impl";
            Class<IUserDao> userDaoClass = (Class<IUserDao>) Class.forName(clazz);
            return userDaoClass.newInstance();
        }
        return null;
    }

    public IDepartmentDao createDepartmentDao() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if( db != null && !"".equals(db) ) {
            String clazz = PREFIX + ".Department" + db + "Impl";
            Class<IDepartmentDao> departmentDaoClass = (Class<IDepartmentDao>) Class.forName(clazz);
            return departmentDaoClass.newInstance();
        }
        return null;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
