package com.zhbin.dao;

import com.zhbin.pojo.User;
import com.zhbin.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void getUserById(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user  = userMapper.getUserById(1);
            System.out.println(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }


    }
}
