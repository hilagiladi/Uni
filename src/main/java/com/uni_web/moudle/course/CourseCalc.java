package com.uni_web.moudle.course;

import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class CourseCalc {


    //    private List<String> tasksNames;// =new ArrayList<>();
//    private List<Integer> tasksGrades;
//    private List<Integer> tasksWeight;
    private int testGrade;
    private int mmn11W;
    private int mmn11G;
    private int mmn12W;
    private int mmn12G;
    private int mmn13W;
    private int mmn13G;
    private int mmn14W;
    private int mmn14G;
    private int mmn15W;
    private int mmn15G;
    private int mmn16W;
    private int mmn16G;
    private int mmn17W;
    private int mmn17G;
    private int mmh01W;
    private int mmh01G;
    private int mmh02W;
    private int mmh02G;
    private int mmh03W;
    private int mmh03G;

    //private int result; // Added for demonstration purposes

    public CourseCalc() {
//        tasksNames = new ArrayList<>();
//        tasksNames.add("ממן 11");
//        tasksNames.add("ממן 12");
//        tasksNames.add("ממן 13");
//        tasksNames.add("ממן 14");
//        tasksNames.add("ממן 15");
//        tasksGrades = new ArrayList<>();
//        tasksWeight = new ArrayList<>();
    }

    public int getTestGrade() {
        return testGrade;
    }

    public void setTestGrade(int testGrade) {
        this.testGrade = testGrade;
    }

    public int getMmn11W() {
        return mmn11W;
    }

    public void setMmn11W(int mmn11W) {
        this.mmn11W = mmn11W;
    }

    public int getMmn11G() {
        return mmn11G;
    }

    public void setMmn11G(int mmn11G) {
        this.mmn11G = mmn11G;
    }

    public int getMmn12W() {
        return mmn12W;
    }

    public void setMmn12W(int mmn12W) {
        this.mmn12W = mmn12W;
    }

    public int getMmn12G() {
        return mmn12G;
    }

    public void setMmn12G(int mmn12G) {
        this.mmn12G = mmn12G;
    }

    public int getMmn13W() {
        return mmn13W;
    }

    public void setMmn13W(int mmn13W) {
        this.mmn13W = mmn13W;
    }

    public int getMmn13G() {
        return mmn13G;
    }

    public void setMmn13G(int mmn13G) {
        this.mmn13G = mmn13G;
    }

    public int getMmn14W() {
        return mmn14W;
    }

    public void setMmn14W(int mmn14W) {
        this.mmn14W = mmn14W;
    }

    public int getMmn14G() {
        return mmn14G;
    }

    public void setMmn14G(int mmn14G) {
        this.mmn14G = mmn14G;
    }

    public int getMmn15W() {
        return mmn15W;
    }

    public void setMmn15W(int mmn15W) {
        this.mmn15W = mmn15W;
    }

    public int getMmn15G() {
        return mmn15G;
    }

    public void setMmn15G(int mmn15G) {
        this.mmn15G = mmn15G;
    }

    public int getMmn16W() {
        return mmn16W;
    }

    public void setMmn16W(int mmn16W) {
        this.mmn16W = mmn16W;
    }

    public int getMmn16G() {
        return mmn16G;
    }

    public void setMmn16G(int mmn16G) {
        this.mmn16G = mmn16G;
    }

    public int getMmn17W() {
        return mmn17W;
    }

    public void setMmn17W(int mmn17W) {
        this.mmn17W = mmn17W;
    }

    public int getMmn17G() {
        return mmn17G;
    }

    public void setMmn17G(int mmn17G) {
        this.mmn17G = mmn17G;
    }

    public int getMmh01W() {
        return mmh01W;
    }

    public void setMmh01W(int mmh01W) {
        this.mmh01W = mmh01W;
    }

    public int getMmh01G() {
        return mmh01G;
    }

    public void setMmh01G(int mmh01G) {
        this.mmh01G = mmh01G;
    }

    public int getMmh02W() {
        return mmh02W;
    }

    public void setMmh02W(int mmh02W) {
        this.mmh02W = mmh02W;
    }

    public int getMmh02G() {
        return mmh02G;
    }

    public void setMmh02G(int mmh02G) {
        this.mmh02G = mmh02G;
    }

    public int getMmh03W() {
        return mmh03W;
    }

    public void setMmh03W(int mmh03W) {
        this.mmh03W = mmh03W;
    }

    public int getMmh03G() {
        return mmh03G;
    }

    public void setMmh03G(int mmh03G) {
        this.mmh03G = mmh03G;
    }

    public int getResult() {
        return mmn11G + mmn12G;
    }
}
