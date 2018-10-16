package com.cpf.service.impl;

import com.cpf.dao.EmployDao;
import com.cpf.entity.Employ;
import com.cpf.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Service
public class EmployServiceImpl implements EmployService{
    @Autowired
    private EmployDao employDao;
    @Override
    public void saveEmploy(Employ employ) {
        employDao.saveEmploy(employ);
    }

    @Override
    public Employ queryByName(String name) {
        return employDao.queryByName(name);
    }

    @Override
    public List<Employ> queryAll() {
        return employDao.queryAll();
    }

    @Override
    public void deleteEmployById(int id) {
        employDao.deleteEmployById(id);
    }

    @Override
    public void updateEmployStatus(Employ employ) {
        employDao.updateEmployStatus(employ);
    }

    @Override
    public void updateEmployInterviewTime(Employ employ) {
        employDao.updateEmployInterviewTime(employ);
    }

    @Override
    public List<Employ> queryByUserId(int uid) {
        return employDao.queryByUserId(uid);
    }

    @Override
    public void updateEmployInterviewY(Employ employ) {
        employDao.updateEmployInterviewY(employ);
    }

    @Override
    public void updateEmployHire(Employ employ) {
        employDao.updateEmployHire(employ);
    }
}
