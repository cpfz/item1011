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
}
