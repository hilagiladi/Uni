package com.uni_web.moudle.degree;

public class School {
    private String SchoolName;

    public School(String schoolName) {
        SchoolName = schoolName;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "SchoolName='" + SchoolName + '\'' +
                '}';
    }
}
