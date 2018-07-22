package com.qinchy.saas.saasadmin.controller;

import com.qinchy.saas.saasadmin.service.StudentService;
import com.qinchy.saas.saasbase.model.Student;
import com.qinchy.saas.saasbase.model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/select")
    public List<Student> selectByExample(){
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(1);
        return studentService.selectByExample(example);
    }
}
