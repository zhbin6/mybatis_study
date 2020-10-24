package com.zhbin.dao;

import com.zhbin.pojo.User;
import com.zhbin.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class UserDaoTest {
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
    @Test
    public void getUserById(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MybatisUtil.getSqlSession();
            //获得接口
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserById(1);
            System.out.println(user.toString());
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void insertUser(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int res = userMapper.insertUser(new User("刘雨欣",22));
            if(res > 0)
                System.out.println("insert succed");
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MybatisUtil.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int res = userMapper.updateUser(new User(3,"范钟楠",18));
            if(res > 0)
                System.out.println("update succed");
            sqlSession.commit();;
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MybatisUtil.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int res = userMapper.deleteUser(5);
            if(res > 0)
                System.out.println("delete succed");
            sqlSession.commit();;
        }finally {
            sqlSession.close();
        }
    }
}
