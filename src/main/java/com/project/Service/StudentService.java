package com.project.Service;

import com.project.Dao.StudentDao;
import com.project.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudent();
    }
}
