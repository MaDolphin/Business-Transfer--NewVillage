package com.NewVillage.dao;

import com.NewVillage.entity.User;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public interface UserDao {
    public boolean addUser(User user);
    public User queryUserByID(int uid);
    public boolean deleteUser(User user);
    public boolean updateUser(User user);
    public List<User> allUsers();
}
