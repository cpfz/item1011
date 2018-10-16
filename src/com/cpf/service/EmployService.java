package com.cpf.service;

import com.cpf.entity.Employ;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public interface EmployService {
    public void saveEmploy(Employ employ);
    public Employ queryByName(String name);
    public List<Employ> queryAll();
    public void deleteEmployById(int id);
    public void updateEmployStatus(Employ employ);//�ı�鿴״̬
    public void updateEmployInterviewTime(Employ employ);//�޸�����ʱ��
    public List<Employ>queryByUserId(int uid);
    public void updateEmployInterviewY(Employ employ);//�ı��Ƿ��������״̬
    public void updateEmployHire(Employ employ);//�ı�¼��״̬
}
