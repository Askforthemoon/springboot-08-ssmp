package com.kembl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kembl.dao.StudentDao;
import com.kembl.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements IStudentService{
    @Autowired
    private StudentDao studentDao;
    public IPage<Student> getPage(Integer currentPage, Integer pageSize){
        IPage<Student> page  = new Page<>(currentPage, pageSize);
        return studentDao.selectPage(page,null);
    }
}
