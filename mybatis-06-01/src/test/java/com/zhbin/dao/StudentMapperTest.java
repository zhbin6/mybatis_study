package com.zhbin.dao;

import com.zhbin.pojo.Student;
import com.zhbin.pojo.Teacher;
import com.zhbin.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void getStudent(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MybatisUtil.getSqlSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = studentMapper.getStudent();
            for (Student student : students) {
                System.out.println(student);
            }
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void getStudent2(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MybatisUtil.getSqlSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = studentMapper.getStudent2();
            for (Student student : students) {
                System.out.println(student);
            }
        }finally {
            sqlSession.close();
        }
    }
}
