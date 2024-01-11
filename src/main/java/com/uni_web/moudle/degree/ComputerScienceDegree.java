package com.uni_web.moudle.degree;

import com.uni_web.entity.Course;

import java.util.List;

public abstract class ComputerScienceDegree {

    private String name;
    private int totalCredits;
    private int minMandatoryMathCredits;
    private int minMandatoryCsCredits;
    private int maxMandatoryCsCredits;
    private int minOptionalCsCredits;
    private int maxOptionalCsCredits;
    private int maxFreeChoiceCredits;

    private int seminaryCredits;
    private int workshopCredits;

    private int csCredits;
    private int csAdvanceCredits;
    private int scienceCredits;

    private List<Course> mandatoryMathCourses;
    private List<Course> mandatoryCsCourses;
    private List<Course> optionalCourses;

    public ComputerScienceDegree(String name, int totalCredits, int minMandatoryMathCredits, int minMandatoryCsCredits,
                                 int maxMandatoryCsCredits, int minOptionalCsCredits, int maxOptionalCsCredits,
                                 int maxFreeChoiceCredits, int seminaryCredits, int workshopCredits, int csCredits,
                                 int csAdvanceCredits, int scienceCredits,
                                 List<Course> mandatoryMathCourses, List<Course> mandatoryCsCourses,
                                 List<Course> optionalCourses) {
        this.name = name;
        this.totalCredits = totalCredits;
        this.minMandatoryMathCredits = minMandatoryMathCredits;
        this.minMandatoryCsCredits = minMandatoryCsCredits;
        this.maxMandatoryCsCredits = maxMandatoryCsCredits;
        this.minOptionalCsCredits = minOptionalCsCredits;
        this.maxOptionalCsCredits = maxOptionalCsCredits;
        this.maxFreeChoiceCredits = maxFreeChoiceCredits;
        this.seminaryCredits = seminaryCredits;
        this.workshopCredits = workshopCredits;
        this.csCredits = csCredits;
        this.csAdvanceCredits = csAdvanceCredits;
        this.scienceCredits = scienceCredits;
        this.mandatoryMathCourses = mandatoryMathCourses;
        this.mandatoryCsCourses = mandatoryCsCourses;
        this.optionalCourses = optionalCourses;
    }

    public int getCoursesTotalCredits(List<Course> courses) {
        int sum = 0;
        for (Course course : courses) {
            sum += course.getCourseTotalCredits();
        }
        return sum;
    }


    public boolean isValidDegree(List<Course> chosenCourses, ComputerScienceDegree degree) {
        return DegreeValidator.validateCommonRequirements(chosenCourses, degree);
    }


    public List<Course> getMandatoryMathCourses() {
        return mandatoryMathCourses;
    }

    public List<Course> getMandatoryCsCourses() {
        return mandatoryCsCourses;
    }

    public List<Course> getOptionalCourses() {
        return optionalCourses;
    }

    public int getMinOptionalCsCredits() {
        return minOptionalCsCredits;
    }

    public abstract int getRequiredCredits();
}
