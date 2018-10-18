package com.cpf.dao;

import com.cpf.entity.Leave;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
@Repository
public interface LeaveDao {
    public void saveLeave(Leave leave);//添加离职员工信息
    public List<Leave> queryAllLeave();//查询所有的离职员工
}
