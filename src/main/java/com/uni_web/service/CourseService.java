package com.uni_web.service;

import com.uni_web.entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAll();

    Course findById(int theId);

    Course save(Course theEmployee);

    void deleteById(int theId);

}
