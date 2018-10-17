package com.cpf.service;

import com.cpf.entity.Staff;

import java.util.List;

/**
 * Created by Administrator on 2018/10/16 0016.
 */
public interface StaffService {
    public List<Staff> queryAllStaff();
    public void saveStaff(Staff staff);
    public List<Staff> queryByPositionName(String name);//根据岗位查询员工
    public void updateStaffPositionName(Staff staff);//修改所有员工的岗位信息
    public List<Staff> queryByDeptName(String name);//根据部门查询员工
    public void updateStaffDeptName(Staff staff);//修改所有员工的部门信息
}
