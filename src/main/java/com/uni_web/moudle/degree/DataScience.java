package com.uni_web.moudle.degree;

import com.uni_web.entity.Course;

import java.util.List;

public class DataScience extends ComputerScienceDegree {

    private int dataScienceCredits;

    public DataScience(
            List<Course> mandatoryMathCourses,
            List<Course> mandatoryCsCourses, List<Course> optionalCourses) {
        super("מדעי הנתונים", 121, 35, 42, 46, 4, 8, 6, 3, 3, 80, 40, 115, mandatoryMathCourses, mandatoryCsCourses, optionalCourses);
    }

    public boolean isValidDegree(List<Course> chosenCourses) {
        boolean valid1Common = super.isValidDegree(chosenCourses,this);
        //todo other validation

        return valid1Common;
    }

    @Override
    public int getRequiredCredits() {
        return 0;
    }
}
