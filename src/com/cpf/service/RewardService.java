package com.cpf.service;

import com.cpf.entity.Reward;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
public interface RewardService {
    public void saveReward(Reward reward);
    public List<Reward> queryAll();
    public List<Reward> queryByStaffName(String sName);
    public void deleteById(int id);
    public Reward queryById(int id);
    public void updateReward(Reward reward);//修改原因和金额
}
