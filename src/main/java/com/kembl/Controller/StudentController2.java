package com.kembl.Controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kembl.domain.Student;
import com.kembl.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/students")
//public class StudentController2 {
//    @Autowired
//    private IStudentService studentService;
//
//    @GetMapping
//    public List<Student> getAll(){
//        return studentService.list();
//    }
//
//    @PostMapping
//    public Boolean save(@RequestBody Student student){
//        return studentService.save(student);
//    }
//
//    @PutMapping
//    public Boolean update(@RequestBody Student student){
//        return studentService.updateById(student);
//    }
//
//    @DeleteMapping("{id}")
//    public Boolean delete(@PathVariable Integer id){
//        return studentService.removeById(id);
//    }
//
//    @GetMapping("{id}")
//    public Student getById(@PathVariable Integer id){
//        return studentService.getById(id);
//    }
//    @GetMapping("{currentPage}/{pageSize}")
//    public IPage<Student> getPage(@PathVariable int currentPage, @PathVariable int pageSize){
//        return studentService.getPage(currentPage, pageSize);
//    }
//}
