package com.kembl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kembl.domain.Student;
import java.util.List;

public interface StudentService {
    Boolean save(Student student);
    Boolean update(Student student);
    Boolean delete(Integer id);
    Student getStudentById(Integer id);
    List<Student> getAll();
    IPage<Student> getPage(Integer currentPage, Integer pageSize);
}
