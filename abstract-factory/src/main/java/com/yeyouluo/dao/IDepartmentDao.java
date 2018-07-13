package com.yeyouluo.dao;

import com.yeyouluo.entity.Department;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/13
 */
public interface IDepartmentDao {
    public void insert(Department department);
    public Department select(int id);
}
