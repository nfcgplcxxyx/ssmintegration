package com.jcfx.service.impl;

import com.jcfx.bean.Student;
import com.jcfx.mapper.StudentMapper;
import com.jcfx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insert(Student student) {
        int insert = studentMapper.insert(student);
        return insert;
    }

    @Override
    public Student selectById(int id) {
        Student student = studentMapper.selectById(id);
        return student;
    }

    @Override
    public List<Student> selectAll() {
        List<Student> students = studentMapper.selectAll();
        return students;
    }
}
