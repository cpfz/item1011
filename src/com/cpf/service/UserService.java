package com.cpf.service;

import com.cpf.entity.User;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
public interface UserService {
    public void addUser(User user);
    public User queryUser(User user);
    public User queryByName(String name);
}
