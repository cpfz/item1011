package com.cpf.service.impl;

import com.cpf.dao.UserDao;
import com.cpf.entity.User;
import com.cpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User queryUser(User user) {
        return userDao.queryUser(user);
    }

    @Override
    public User queryByName(String name) {
        return userDao.queryByName(name);
    }

    @Override
    public void updatePass(User user) {
        userDao.updatePass(user);
    }
}
