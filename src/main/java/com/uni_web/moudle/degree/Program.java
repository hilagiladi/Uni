package com.uni_web.moudle.degree;

public class Program extends School {

    private String programName;

    public Program(String schoolName, String programName) {
        super(schoolName);
        this.programName=programName;
    }

    public String getProgramName() {
        return programName;
    }

    @Override
    public String toString() {
        return super.toString() +"Program{" +
                "programName='" + programName + '\'' +
                '}';
    }
}
