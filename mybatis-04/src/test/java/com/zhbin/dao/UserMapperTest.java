package com.zhbin.dao;

import com.zhbin.pojo.User;
import com.zhbin.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

//    static Logger logger = Logger.getLogger(UserMapperTest.class);

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
//    @Test
//    public void Log4jTest(){
//        logger.info("info:come in log4j");
//        logger.debug("debug:come in debug");
//        logger.error("error:come in error");
//    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Map<String,Integer> map = new HashMap<String, Integer>();
            map.put("startIndex",0);
            map.put("pageSize",2);
            List<User> users = userMapper.getUserByLimit(map);
            for (User user : users) {
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
