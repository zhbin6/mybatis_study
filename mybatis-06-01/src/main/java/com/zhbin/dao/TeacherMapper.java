package com.zhbin.dao;

import com.zhbin.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
//    @Select("select * from teacher")
    public List<Teacher> getTeacherList();
}
