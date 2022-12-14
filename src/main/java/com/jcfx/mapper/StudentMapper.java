package com.jcfx.mapper;

import com.jcfx.bean.Student;

import java.util.List;

public interface StudentMapper {

    int insert(Student student);

    Student selectById(int id);

    List<Student> selectAll();
}
