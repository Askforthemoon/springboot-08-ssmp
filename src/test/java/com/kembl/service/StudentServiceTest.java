package com.kembl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kembl.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private IStudentService studentService;
    @Test
    void getStudentByIdTest(){
        System.out.println(studentService.getById(1002));
    }

    @Test
    void testSave(){
        Student student = new Student();
        student.setName("诸葛亮");
        student.setEmail("lvbu@qq.com");
        student.setAge(35);
        studentService.save(student);
    }
    @Test
    void testUpdate(){
        Student student = new Student();
        student.setId(1011);
        student.setName("赵子龙");
        student.setEmail("zhaozilong@qq.com");
        student.setAge(28);
        studentService.updateById(student);
    }

    @Test
    void testDelete(){
        studentService.removeById(1003);
    }
    @Test
    void testGetAll(){

        studentService.list();
    }
    @Test
    void testGetPage(){
        IPage<Student> page = new Page<>(2,3);
        studentService.page(page);
        List<Student> records = page.getRecords();
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(records);
    }
}
