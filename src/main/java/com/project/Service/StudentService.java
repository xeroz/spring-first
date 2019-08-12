package com.project.Service;

import com.project.Dao.StudentDao;
import com.project.Entity.Student;

import java.util.Collection;

public class StudentService {

    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudent();
    }
}
