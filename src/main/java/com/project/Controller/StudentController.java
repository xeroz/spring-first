package com.project.Controller;

import com.project.Entity.Student;
import com.project.Service.StudentService;

import java.util.Collection;

public class StudentController {
    private StudentService studentService;

    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
