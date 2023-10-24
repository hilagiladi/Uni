package com.uni_web.moudle;

import com.uni_web.service.course.Association;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    private int COURSE_ID;

    @Column(name = "course_title")
    private String courseTitle;
    @Column(name = "course_title_display")
    private String courseTitleDisplay;
    @Column(name = "regular_credits")
    private int regularCredits;
    @Column(name = "advance_credits")
    private int advanceCredits;
    @Column(name = "advanced_seminary_credits")
    private int advancedSeminaryCredits;
    @Column(name = "second_degree_credits")
    private int secondDegreeCredits;
    @Column(name = "offered_in_fall_semester")
    private boolean offeredInFallSemester;
    @Column(name = "offered_in_spring_semester")
    private boolean offeredInSpringSemester;
    @Column(name = "offered_in_summer_semester")
    private boolean offeredInSummerSemester;
    @Column(name = "association1")
    private Association association1;
    @Column(name = "association2")
    private Association association2;
    @Column(name = "association3")
    private Association association3;
    @Column(name = "link")
    private String link;
    @Column(name = "available")
    private boolean available;
    @OneToMany(mappedBy = "dependency")
    private List<Course> dependencies;


    public Course() {
    }

    public Course(int courseId, String courseTitle, String courseTitleDisplay, int regularCredits, int advanceCredits,
                  int advancedSeminaryCredits,
                  int secondDegreeCredits, boolean offeredInFallSemester,
                  boolean offeredInSpringSemester, boolean offeredInSummerSemester, Association association1,
                  Association association2, Association association3, boolean available, List<Course> dependencies) {
        this.COURSE_ID = courseId;
        this.courseTitle = courseTitle;
        this.courseTitleDisplay = courseTitleDisplay;
        this.regularCredits = regularCredits;
        this.advanceCredits = advanceCredits;
        this.advancedSeminaryCredits = advancedSeminaryCredits;
        this.secondDegreeCredits = secondDegreeCredits;
        this.offeredInFallSemester = offeredInFallSemester;
        this.offeredInSpringSemester = offeredInSpringSemester;
        this.offeredInSummerSemester = offeredInSummerSemester;
        this.association1 = association1;
        this.association2 = association2;
        this.association3 = association3;
        this.link = "https://www.openu.ac.il/courses/"+courseId+".htm?_gl=1";
        this.available = available;
        this.dependencies = dependencies;
    }

    public int getCourseTotalCredits() {
        return regularCredits + advanceCredits + advancedSeminaryCredits + secondDegreeCredits;
    }

    public int getCOURSE_ID() {
        return COURSE_ID;
    }

    public void setCOURSE_ID(int COURSE_ID) {
        this.COURSE_ID = COURSE_ID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseTitleDisplay() {
        return courseTitleDisplay;
    }

    public void setCourseTitleDisplay(String courseTitleDisplay) {
        this.courseTitleDisplay = courseTitleDisplay;
    }

    public int getRegularCredits() {
        return regularCredits;
    }

    public void setRegularCredits(int regularCredits) {
        this.regularCredits = regularCredits;
    }

    public int getAdvanceCredits() {
        return advanceCredits;
    }

    public void setAdvanceCredits(int advanceCredits) {
        this.advanceCredits = advanceCredits;
    }

    public int getAdvancedSeminaryCredits() {
        return advancedSeminaryCredits;
    }

    public void setAdvancedSeminaryCredits(int advancedSeminaryCredits) {
        this.advancedSeminaryCredits = advancedSeminaryCredits;
    }

    public int getSecondDegreeCredits() {
        return secondDegreeCredits;
    }

    public void setSecondDegreeCredits(int secondDegreeCredits) {
        this.secondDegreeCredits = secondDegreeCredits;
    }

    public boolean isOfferedInFallSemester() {
        return offeredInFallSemester;
    }

    public void setOfferedInFallSemester(boolean offeredInFallSemester) {
        this.offeredInFallSemester = offeredInFallSemester;
    }

    public boolean isOfferedInSpringSemester() {
        return offeredInSpringSemester;
    }

    public void setOfferedInSpringSemester(boolean offeredInSpringSemester) {
        this.offeredInSpringSemester = offeredInSpringSemester;
    }

    public boolean isOfferedInSummerSemester() {
        return offeredInSummerSemester;
    }

    public void setOfferedInSummerSemester(boolean offeredInSummerSemester) {
        this.offeredInSummerSemester = offeredInSummerSemester;
    }

    public Association getAssociation1() {
        return association1;
    }

    public void setAssociation1(Association association1) {
        this.association1 = association1;
    }

    public Association getAssociation2() {
        return association2;
    }

    public void setAssociation2(Association association2) {
        this.association2 = association2;
    }

    public Association getAssociation3() {
        return association3;
    }

    public void setAssociation3(Association association3) {
        this.association3 = association3;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<Course> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Course> dependencies) {
        this.dependencies = dependencies;
    }
}

