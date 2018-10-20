package com.cpf.service.impl;

import com.cpf.dao.RecruitDao;
import com.cpf.entity.Recruit;
import com.cpf.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Service
public class RecruitServiceImpl implements RecruitService{
    @Autowired
    private RecruitDao recruitDao;
    @Override
    public void saveRecruit(Recruit recruit) {
        recruitDao.saveRecruit(recruit);
    }

    @Override
    public List<Recruit> queryRecruit() {
        return recruitDao.queryRecruit();
    }

    @Override
    public void deleteById(int id) {
        recruitDao.deleteById(id);
    }

    @Override
    public Recruit queryById(int id) {
        return recruitDao.queryById(id);
    }

    @Override
    public void updateRecruit(Recruit recruit) {
        recruitDao.updateRecruit(recruit);
    }
}
