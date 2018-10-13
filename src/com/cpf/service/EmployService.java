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
}
