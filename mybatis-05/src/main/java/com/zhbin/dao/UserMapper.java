package com.zhbin.dao;

import com.zhbin.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    public List<User> getUsers();

    @Select("select * from user where id = #{id}")
    public List<User> getUserById(@Param("id") int id);

    @Insert("insert into user(name,age) values (#{name},#{age})")
    public int addUser(User user);
}
