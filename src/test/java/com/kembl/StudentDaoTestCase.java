package com.kembl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kembl.dao.StudentDao;
import com.kembl.domain.Student;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.List;

@SpringBootTest
public class StudentDaoTestCase {
    @Autowired
    private StudentDao studentDao;
    @Test
    void testGetById(){
        System.out.println(studentDao.selectById(1001));
    }
    @Test
    void testSave(){
        Student student = new Student();
        student.setName("赵云");
        student.setEmail("zhaoyun@qq.com");
        student.setAge(30);
        studentDao.insert(student);
    }
    @Test
    void testUpdate(){
        Student student = new Student();
        student.setId(1011);
        student.setName("赵子龙");
        student.setEmail("zhaozilong@qq.com");
        student.setAge(28);
        studentDao.updateById(student);
    }

    @Test
    void testDelete(){
        studentDao.deleteById(1010);
    }
    @Test
    void testGetAll(){
        studentDao.selectList(null);
    }
    @Test
    void testGetPage(){
        IPage<Student> page = new Page<>(2,3);
        studentDao.selectPage(page,null);
        List<Student> records = page.getRecords();
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(records);
    }
    @Test
    void testGetBy(){
        QueryWrapper<Student> qw = new QueryWrapper<>();
        qw.like("name","刘");
        studentDao.selectList(qw);
    }
    @Test
    void testGetBy2(){
        String name="赵";
        LambdaQueryWrapper<Student> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(name),Student::getName, name);
        studentDao.selectList(lqw);
    }
}
