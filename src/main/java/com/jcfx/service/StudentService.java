package com.jcfx.service;

import com.jcfx.bean.Student;

import java.util.List;

public interface StudentService {
    int insert(Student student);

    Student selectById(int id);

    List<Student> selectAll();
}
