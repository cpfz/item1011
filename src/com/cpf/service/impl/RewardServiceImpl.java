package com.cpf.service.impl;

import com.cpf.dao.RewardDao;
import com.cpf.entity.Reward;
import com.cpf.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
@Service
public class RewardServiceImpl implements RewardService{
    @Autowired
    private RewardDao rewardDao;
    @Override
    public void saveReward(Reward reward) {
        rewardDao.saveReward(reward);
    }

    @Override
    public List<Reward> queryAll() {
        return rewardDao.queryAll();
    }

    @Override
    public List<Reward> queryByStaffName(String sName) {
        return rewardDao.queryByStaffName(sName);
    }

    @Override
    public void deleteById(int id) {
        rewardDao.deleteById(id);
    }

    @Override
    public Reward queryById(int id) {
        return rewardDao.queryById(id);
    }

    @Override
    public void updateReward(Reward reward) {
        rewardDao.updateReward(reward);
    }
}
