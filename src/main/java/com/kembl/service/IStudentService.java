package com.kembl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kembl.domain.Student;
import org.springframework.stereotype.Service;

public interface IStudentService extends IService<Student> {
    IPage<Student> getPage(Integer currentPage, Integer pageSize);
}
