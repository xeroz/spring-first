package com.project.Dao;

import com.project.Entity.Student;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Said", "course 1"));
                put(2, new Student(1, "Said", "course 1"));
                put(3, new Student(1, "Said", "course 1"));
            }
        };
    }

    public Collection<Student> getAllStudent() {
        return this.students.values();
    }
}
