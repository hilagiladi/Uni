package com.uni_web.service.student;

import com.uni_web.moudle.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
