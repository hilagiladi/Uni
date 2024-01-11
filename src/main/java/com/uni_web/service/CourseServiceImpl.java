package com.uni_web.service;

import com.uni_web.dao.CourseRepository;
import com.uni_web.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository theEmployeeRepository) {
        courseRepository = theEmployeeRepository;
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAllByOrderByCourseTitleAsc();
    }

    @Override
    public Course findById(int theId) {
        Optional<Course> result = courseRepository.findById(theId);

        Course course = null;

        if (result.isPresent()) {
            course = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return course;
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteById(int theId) {
        courseRepository.deleteById(theId);
    }
}






