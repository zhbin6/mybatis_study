package com.zhbin.dao;

import com.zhbin.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public List<User> getUserList();
    public User getUserById(int id);
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(int id);
}
