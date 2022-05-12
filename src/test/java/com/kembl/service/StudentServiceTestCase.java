package com.kembl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kembl.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentServiceTestCase {
    @Autowired
    private StudentService studentService;
    @Test
    void getStudentByIdTest()
    {
        System.out.println(studentService.getStudentById(1002));
    }

    @Test
    void testSave(){
        Student student = new Student();
        student.setName("吕布");
        student.setEmail("lvbu@qq.com");
        student.setAge(30);
        studentService.save(student);
    }
    @Test
    void testUpdate(){
        Student student = new Student();
        student.setId(1011);
        student.setName("赵云");
        student.setEmail("zhaozilong@qq.com");
        student.setAge(28);
        studentService.update(student);
    }

    @Test
    void testDelete(){
        studentService.delete(1004);
    }
    @Test
    void testGetAll(){
        studentService.getAll();
    }
    @Test
    void testGetPage(){
        IPage<Student> page = studentService.getPage(2, 3);
        List<Student> records = page.getRecords();
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(records);
    }
}
