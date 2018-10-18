package com.cpf.service;

import com.cpf.entity.Cult;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
public interface CultivateService {
    public List<Cult> queryAllCultivate();
    public void saveCult(Cult cult);
    public void deleteCultById(int id);
    public void updateCult(Cult cult);
    public Cult queryById(int id);
}
