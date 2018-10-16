package com.cpf.dao;

import com.cpf.entity.Employ;
import com.cpf.entity.Resume;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Repository
public interface EmployDao {
    public void saveEmploy(Employ employ);
    public Employ queryByName(String name);
    public List<Employ> queryAll();
    public void deleteEmployById(int id);
    public void updateEmployStatus(Employ employ);//�ı�鿴״̬
    /*public void updateEmployInterview(int id);*/
    public void updateEmployInterviewTime(Employ employ);//�޸�����ʱ��
    public List<Employ> queryByUserId(int uid);
    public void updateEmployInterviewY(Employ employ);//�ı��Ƿ��������״̬
    public void updateEmployHire(Employ employ);//�ı�¼��״̬

}
