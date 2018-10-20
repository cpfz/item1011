package com.cpf.service.impl;

import com.cpf.dao.PunishDao;
import com.cpf.entity.Punish;
import com.cpf.service.PunishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
@Service
public class PunishServiceImpl implements PunishService{
    @Autowired
    private PunishDao punishDao;
    @Override
    public void savePunish(Punish punish) {
        punishDao.savePunish(punish);
    }

    @Override
    public List<Punish> queryAll() {
        return punishDao.queryAll();
    }

    @Override
    public List<Punish> queryByStaffName(String sName) {
        return punishDao.queryByStaffName(sName);
    }

    @Override
    public void deleteById(int id) {
        punishDao.deleteById(id);
    }

    @Override
    public Punish queryById(int id) {
        return punishDao.queryById(id);
    }

    @Override
    public void updatePunish(Punish punish) {
        punishDao.updatePunish(punish);
    }
}
