package com.uni_web.moudle.degree;

import com.uni_web.entity.Course;

import java.util.List;

public class SciencesEmphasisComputerScience extends ComputerScienceDegree {

    private int maxMandatoryMathCredits;
    private int minFreeChoiceCredits;
    private int physicsCredits;
    private int mindExpandingCredits;
    private int scienceAdvanceCredits;


    public SciencesEmphasisComputerScience(List<Course> mandatoryMathCourses,
                                           List<Course> mandatoryCsCourses,
                                           List<Course> optionalCourses) {
        super("מדעים בהדגשת מדעי המחשב", 120, 23, 25, 26, 32, 32, 31, 3, 3, 60, 23, 96, mandatoryMathCourses, mandatoryCsCourses, optionalCourses);
        this.maxMandatoryMathCredits=30;
        this.minFreeChoiceCredits=24;
        this.physicsCredits=3;
        this.mindExpandingCredits=3;
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
