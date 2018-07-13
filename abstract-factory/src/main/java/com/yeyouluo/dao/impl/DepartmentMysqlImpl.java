package com.yeyouluo.dao.impl;

import com.yeyouluo.entity.Department;
import com.yeyouluo.dao.IDepartmentDao;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/13
 */
public class DepartmentMysqlImpl implements IDepartmentDao {
    @Override
    public void insert(Department department) {
        System.out.println("MySQL: 插入一条记录：" + department.toString());
    }

    @Override
    public Department select(int id) {
        System.out.println("MySQL：查询到结果：id=" + id);
        return new Department(id, "Default DeptName from MySQL");
    }
}
