package com.uni_web.moudle.course;

import java.util.ArrayList;
import java.util.List;

public class CourseGrade {

    List<Assignment> assignments;
    private Double testGrade;
    private Double courseFinalGrade;
    private int courseNum;

    public CourseGrade() {
        assignments = new ArrayList<>();
    }

    public Double getCourseFinalGrade() {
        return courseFinalGrade;
    }

    public void setCourseFinalGrade(Double courseFinalGrade) {
        this.courseFinalGrade = courseFinalGrade;
    }

    public Double getTestGrade() {
        return testGrade;
    }

    public void setTestGrade(Double testGrade) {
        this.testGrade = testGrade;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }
}
