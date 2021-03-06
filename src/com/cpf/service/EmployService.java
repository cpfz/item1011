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
    public void updateEmployStatus(Employ employ);//改变查看状态
    public void updateEmployInterviewTime(Employ employ);//修改面试时间
    public List<Employ>queryByUserId(int uid);
    public void updateEmployInterviewY(Employ employ);//改变是否接受面试状态
    public void updateEmployHire(Employ employ);//改变录用状态
}
