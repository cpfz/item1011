package com.cpf.service;

import com.cpf.entity.Recruit;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public interface RecruitService {
    public void saveRecruit(Recruit recruit);
    public List<Recruit> queryRecruit();
}
