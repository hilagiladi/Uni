package com.uni_web.moudle.degree;

import com.uni_web.entity.Course;

import java.util.List;

public class DegreeValidator {
    public static boolean validateCommonRequirements(List<Course> chosenCourses, ComputerScienceDegree degree) {
        List<Course> mandatoryMathCourses = degree.getMandatoryMathCourses();
        List<Course> mandatoryCsCourses = degree.getMandatoryCsCourses();
        List<Course> optionalCourses = degree.getOptionalCourses();
        int requiredCredits = degree.getRequiredCredits();

        int totalCredits = 0;

        // Check if all mandatory courses are chosen
        for (Course mandatoryMathCourse : mandatoryMathCourses) {
            if (!chosenCourses.contains(mandatoryMathCourse)) {
                return false;
            }
            totalCredits += mandatoryMathCourse.getCourseTotalCredits();
        }

        for (Course mandatoryCsCourse : mandatoryCsCourses) {
            if (!chosenCourses.contains(mandatoryCsCourse)) {
                return false;
            }
            totalCredits += mandatoryCsCourse.getCourseTotalCredits();
        }

        // Check if enough optional courses are chosen
        int optionalCourseCsCount = 0;
        for (Course optionalCourse : optionalCourses) {
            if (chosenCourses.contains(optionalCourse)) {
                totalCredits += optionalCourse.getCourseTotalCredits();
                optionalCourseCsCount++;
            }
        }

        // Check if total credits meet the requirement
        if (totalCredits < requiredCredits) {
            return false;
        }

        // Check if enough optional courses were chosen
        if (optionalCourseCsCount < degree.getMinOptionalCsCredits()) {
            return false;
        }

        return true;
    }
}
