package com.uni_web.moudle.degree;

import com.uni_web.entity.Course;

import java.util.List;

public class SoftwareEngineering extends ComputerScienceDegree {

    private int minMandatorySeCredits;
    private int maxMandatorySeCredits;
    private int ChosenSeCredits;
    private int physicsCredits;
    private int projectCredits;

    public SoftwareEngineering(List<Course> mandatoryMathCourses,
                               List<Course> mandatoryCsCourses, List<Course> optionalCourses) {
        super("הנדסת תוכנה", 160, 35, 35, 46, 0, 0, 7, 3, 3, 112, 72, 153, mandatoryMathCourses, mandatoryCsCourses, optionalCourses);

        this.minMandatorySeCredits = 32;
        this.maxMandatorySeCredits = 36;
        this.physicsCredits=6;
        this.ChosenSeCredits = 20;
        this.projectCredits=8;

    }


    public boolean isValidDegree(List<Course> chosenCourses) {
        boolean valid1Common = super.isValidDegree(chosenCourses, this);
        //todo other validation

        return valid1Common;
    }

    @Override
    public int getRequiredCredits() {
        return 0;
    }
}
