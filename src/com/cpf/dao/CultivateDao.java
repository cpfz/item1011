package com.cpf.dao;

import com.cpf.entity.Cult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
@Repository
public interface CultivateDao {
    public List<Cult> queryAllCultivate();
    public void saveCult(Cult cult);
    public void deleteCultById(int id);
    public void updateCult(Cult cult);
    public Cult queryById(int id);

}
