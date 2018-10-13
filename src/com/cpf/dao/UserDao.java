package com.cpf.dao;

import com.cpf.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
@Repository
public interface UserDao {
    public void addUser(User user);
    public User queryUser(User user);
    public User queryByName(String name);
    public void updatePass(User user);
}
