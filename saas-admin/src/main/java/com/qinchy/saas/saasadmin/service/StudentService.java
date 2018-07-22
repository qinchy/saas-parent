package com.qinchy.saas.saasadmin.service;

import com.qinchy.saas.saasbase.model.Student;
import com.qinchy.saas.saasbase.model.StudentExample;

import java.util.List;

public interface StudentService {
    public List<Student> selectByExample(StudentExample example);
}
