package com.uni_web.dao;

import com.uni_web.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {


    // add a method to sort by last name
    List<Course> findAllByOrderByCourseTitleAsc();

}
