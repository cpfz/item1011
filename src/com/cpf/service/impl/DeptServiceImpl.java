package com.cpf.service.impl;

import com.cpf.dao.DeptDao;
import com.cpf.entity.Department;
import com.cpf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Department> queryAllDept() {
        return deptDao.queryAllDept();
    }

    @Override
    public void save(Department department) {
        deptDao.saveDepartment(department);
    }

    @Override
    public Department queryById(int id) {
        return deptDao.queryById(id);
    }

    @Override
    public Department queryByName(String name) {
        return deptDao.queryByName(name);
    }


}
