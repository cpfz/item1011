package com.cpf.service.impl;

import com.cpf.dao.CultivateDao;
import com.cpf.entity.Cult;
import com.cpf.service.CultivateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
@Service
public class CultivateServiceImpl implements CultivateService{
    @Autowired
    private CultivateDao cultivateDao;

    @Override
    public List<Cult> queryAllCultivate() {
        return cultivateDao.queryAllCultivate();
    }

    @Override
    public void saveCult(Cult cult) {
        cultivateDao.saveCult(cult);
    }

    @Override
    public void deleteCultById(int id) {
        cultivateDao.deleteCultById(id);
    }

    @Override
    public void updateCult(Cult cult) {
        cultivateDao.updateCult(cult);
    }

    @Override
    public Cult queryById(int id) {
        return cultivateDao.queryById(id);
    }
}
