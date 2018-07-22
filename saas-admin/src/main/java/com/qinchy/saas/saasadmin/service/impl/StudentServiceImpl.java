package com.qinchy.saas.saasadmin.service.impl;

import com.qinchy.saas.saasadmin.service.StudentService;
import com.qinchy.saas.saasbase.mapper.StudentMapper;
import com.qinchy.saas.saasbase.model.Student;
import com.qinchy.saas.saasbase.model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectByExample(StudentExample selectByExample){
        return studentMapper.selectByExample(selectByExample);
    }
}
