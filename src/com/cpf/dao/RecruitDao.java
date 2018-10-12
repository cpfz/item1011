package com.cpf.dao;

import com.cpf.entity.Recruit;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
@Repository
public interface RecruitDao {
    public void saveRecruit(Recruit recruit);
    public List<Recruit> queryRecruit();
}
