package com.zhbin.dao;

import com.zhbin.pojo.User;
import com.zhbin.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

//import java.util.logging.Logger;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

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
    @Test
    public void Log4jTest(){
        logger.info("info:come in log4j");
        logger.debug("debug:come in debug");
        logger.error("error:come in error");
    }

}
