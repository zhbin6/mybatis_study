package com.zhbin.dao;

import com.zhbin.pojo.User;
import com.zhbin.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void getUserList(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> list = userMapper.getUserList();
            for (User user : list) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }


    }
}
