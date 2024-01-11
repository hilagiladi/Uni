package com.uni_web.moudle.course;

public class Assignment {

    private static int nextId = 1;

    private int id;
    private String name;
    private Double weight;
    private Double grade;

    public Assignment() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
