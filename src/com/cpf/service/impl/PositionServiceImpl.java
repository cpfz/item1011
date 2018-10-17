package com.cpf.service.impl;

import com.cpf.dao.PositionDao;
import com.cpf.entity.Position;
import com.cpf.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    private PositionDao positionDao;
    @Override
    public List<Position> queryByDeptId(int id) {
        return positionDao.queryByDeptId(id);
    }

    @Override
    public void savePosition(Position position) {
        positionDao.savePosition(position);
    }

    @Override
    public List<Position> queryAllPosition() {
        return positionDao.queryAllPosition();
    }

    @Override
    public void deleteByDeptId(int dId) {
        positionDao.deleteByDeptId(dId);
    }

    @Override
    public void deleteById(int id) {
        positionDao.deleteById(id);
    }

    @Override
    public void updatePosition(Position position) {
        positionDao.updatePosition(position);
    }

    @Override
    public Position queryById(int id) {
        return positionDao.queryById(id);
    }

    @Override
    public Position queryByName(String name) {
        return positionDao.queryByName(name);
    }
}
