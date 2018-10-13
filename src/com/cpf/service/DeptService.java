package com.cpf.service;

import com.cpf.entity.Department;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public interface DeptService {
    public List<Department> queryAllDept();
    public void save(Department department);
    public Department queryById(int id);
    public Department queryByName(String name);
}
