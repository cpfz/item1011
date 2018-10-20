package com.cpf.dao;

import com.cpf.entity.Punish;
import com.cpf.entity.Reward;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
@Repository
public interface RewardDao {
    public void saveReward(Reward reward);
    public List<Reward> queryAll();
    public List<Reward> queryByStaffName(String sName);
    public void deleteById(int id);
    public Reward queryById(int id);
    public void updateReward(Reward reward);//修改原因和金额
}
