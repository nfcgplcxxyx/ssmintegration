package com.jcfx.test;

import com.jcfx.bean.Student;
import com.jcfx.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SSMTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        int insert = studentService.insert(new Student(2, "Victoria", 26));
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        Student student = studentService.selectById(1);
        System.out.println(student);
        List<Student> students = studentService.selectAll();
        System.out.println(students);
    }
}
