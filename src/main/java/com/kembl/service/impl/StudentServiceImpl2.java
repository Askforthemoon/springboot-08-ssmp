package com.kembl.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kembl.dao.StudentDao;
import com.kembl.domain.Student;
import com.kembl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl2 implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Boolean save(Student student) {
        return studentDao.insert(student) > 0;
    }

    @Override
    public Boolean update(Student student) {
        return studentDao.updateById(student) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return studentDao.deleteById(id) > 0;
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentDao.selectById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.selectList(null);
    }

    @Override
    public IPage<Student> getPage(Integer currentPage, Integer pageSize) {
        IPage<Student> page = new Page<>(currentPage, pageSize);
        studentDao.selectPage(page,null);
        return page;
    }
}
