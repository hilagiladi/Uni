package com.uni_web.moudle.degree;

import com.uni_web.entity.Course;

import java.util.List;

public class CyberSecurity extends ComputerScienceDegree{


    public CyberSecurity(List<Course> mandatoryMathCourses,
                         List<Course> mandatoryCsCourses, List<Course> optionalCourses) {
        super("אבטחת המרחב המקוון", 120, 35, 42, 46, 8, 12, 9, 3, 3, 76, 40, 111, mandatoryMathCourses, mandatoryCsCourses, optionalCourses);
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
