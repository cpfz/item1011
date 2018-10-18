package com.cpf.service.impl;

import com.cpf.dao.StaffDao;
import com.cpf.entity.Staff;
import com.cpf.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/16 0016.
 */
@Service
public class StaffServiceImpl implements StaffService{
    @Autowired
    private StaffDao staffDao;

    @Override
    public List<Staff> queryAllStaff() {
        return staffDao.queryAllStaff();
    }

    @Override
    public void saveStaff(Staff staff) {
        staffDao.saveStaff(staff);
    }

    @Override
    public List<Staff> queryByPositionName(String name) {
        return staffDao.queryByPositionName(name);
    }

    @Override
    public void updateStaffPositionName(Staff staff) {
        staffDao.updateStaffPositionName(staff);
    }

    @Override
    public List<Staff> queryByDeptName(String name) {
        return staffDao.queryByDeptName(name);
    }

    @Override
    public void updateStaffDeptName(Staff staff) {
        staffDao.updateStaffDeptName(staff);
    }

    @Override
    public void deleteStaffById(int id) {
        staffDao.deleteStaffById(id);
    }

    @Override
    public void updateStaff(Staff staff) {
        staffDao.updateStaff(staff);
    }

    @Override
    public Staff queryStaffById(int id) {
        return staffDao.queryStaffById(id);
    }
}
