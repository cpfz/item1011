package com.cpf.service;

import com.cpf.entity.Staff;

import java.util.List;

/**
 * Created by Administrator on 2018/10/16 0016.
 */
public interface StaffService {
    public List<Staff> queryAllStaff();
    public void saveStaff(Staff staff);
    public List<Staff> queryByPositionName(String name);//���ݸ�λ��ѯԱ��
    public void updateStaffPositionName(Staff staff);//�޸�����Ա���ĸ�λ��Ϣ
    public List<Staff> queryByDeptName(String name);//���ݲ��Ų�ѯԱ��
    public void updateStaffDeptName(Staff staff);//�޸�����Ա���Ĳ�����Ϣ
    public void deleteStaffById(int id);
    public void updateStaff(Staff staff);//x�޸�Ա���Ĳ��ź͸�λ
    public Staff queryStaffById(int id);
    public Staff queryStaffByUid(int uId);
    public void updateStaffAll(Staff staff);
}
