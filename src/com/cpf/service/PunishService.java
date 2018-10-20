package com.cpf.service;

import com.cpf.entity.Punish;
import com.cpf.entity.Reward;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
public interface PunishService {
    public void savePunish(Punish punish);
    public List<Punish> queryAll();
    public List<Punish> queryByStaffName(String sName);
    public void deleteById(int id);
    public Punish queryById(int id);
    public void updatePunish(Punish punish);
}
