package com.cpf.service;

import com.cpf.entity.Position;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public interface PositionService {
    public List<Position> queryByDeptId(int id);
    public void savePosition(Position position);
    public List<Position> queryAllPosition();
    public void deleteByDeptId(int dId);
    public void deleteById(int id);
    public void updatePosition(Position position);
    public Position queryById(int id);
    public Position queryByName(String name);

}
