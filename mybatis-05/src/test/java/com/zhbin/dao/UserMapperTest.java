package com.zhbin.dao;

import com.zhbin.pojo.User;
import com.zhbin.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {


    @Test
    public void addUser(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MybatisUtil.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.addUser(new User("你好",0));

        }
        finally {
            sqlSession.close();
        }
    }


}
