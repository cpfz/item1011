package com.cpf.service;

import com.cpf.entity.Leave;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
public interface LeaveService {
    public void saveLeave(Leave leave);//�����ְԱ����Ϣ
    public List<Leave> queryAllLeave();//��ѯ���е���ְԱ��
}
