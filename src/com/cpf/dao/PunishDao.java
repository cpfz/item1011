package com.cpf.dao;

import com.cpf.entity.Punish;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
@Repository
public interface PunishDao {
    public void savePunish(Punish punish);
    public List<Punish> queryAll();
    public List<Punish> queryByStaffName(String sName);
    public void deleteById(int id);
    public Punish queryById(int id);
    public void updatePunish(Punish punish);
}
