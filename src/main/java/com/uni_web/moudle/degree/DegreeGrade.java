package com.uni_web.moudle.degree;

import com.uni_web.moudle.course.CourseGrade;

import java.util.ArrayList;
import java.util.List;

public class DegreeGrade {

    private List<CourseGrade> courseGrades;
    private Double degreeFinalGrade;

    public DegreeGrade() {
        courseGrades = new ArrayList<>();
    }

    public List<CourseGrade> getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(List<CourseGrade> courseGrades) {
        this.courseGrades = courseGrades;
    }

    public Double getDegreeFinalGrade() {
        return degreeFinalGrade;
    }

    public void setDegreeFinalGrade(Double degreeFinalGrade) {
        this.degreeFinalGrade = degreeFinalGrade;
    }
}
