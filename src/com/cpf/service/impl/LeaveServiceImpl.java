package com.cpf.service.impl;

import com.cpf.dao.LeaveDao;
import com.cpf.entity.Leave;
import com.cpf.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
@Service
public class LeaveServiceImpl implements LeaveService{
    @Autowired
    private LeaveDao leaveDao;


    @Override
    public void saveLeave(Leave leave) {
        leaveDao.saveLeave(leave);
    }

    @Override
    public List<Leave> queryAllLeave() {
        return leaveDao.queryAllLeave();
    }
}
