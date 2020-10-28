package com.zhbin.dao;

import com.zhbin.pojo.Student;
import com.zhbin.pojo.Teacher;
import com.zhbin.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherMapperTest {
    @Test
    public void getTeacherList(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MybatisUtil.getSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teachers = teacherMapper.getTeacherList();
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }finally {
            sqlSession.close();
        }
    }


}
