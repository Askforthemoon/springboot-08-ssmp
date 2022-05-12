package com.kembl.Controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kembl.Controller.Utils.R;
import com.kembl.domain.Student;
import com.kembl.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping
    public R getAll(){
        return new R(true,studentService.list());
    }

    @PostMapping
    public R save(@RequestBody Student student){
        return new R(studentService.save(student));
    }

    @PutMapping
    public R update(@RequestBody Student student){
        return new R(studentService.updateById(student));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(studentService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,studentService.getById(id));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new R(true,studentService.getPage(currentPage, pageSize));
    }
}
