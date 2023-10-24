package com.uni_web.service.course;

import com.uni_web.repository.CourseRepository;
import com.uni_web.moudle.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataInitializer {

    @Autowired
    private CourseRepository courseRepository;

    @PostConstruct
    public void initialize() {
        System.out.println("start");

        // Add your course data here
        Course course1 = new Course(20441,
                                    "Introduction to computer science and the Java language",
                                    "מבוא למדעי המחשב ושפת Java", 6, 0, 0, 0, true, true, false,
                                    Association.COMPUTER_SCIENCE, Association.SCIENCE, null, true,
                                    null
        );
        //Course course2 = new Course(/* initialize with course data */);
        // Add more courses as needed

        // Save courses to the database
        courseRepository.saveAll(List.of(course1 /* add more courses */));
        System.out.println("saved2");
    }
}
