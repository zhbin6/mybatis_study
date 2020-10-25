package com.zhbin.dao;

import com.zhbin.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public User getUserById(int id);
    public List<User> getUserByLimit(Map<String,Integer> map);
}
