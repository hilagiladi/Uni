package com.uni_web.entity;

import com.uni_web.moudle.course.Association;
import jakarta.persistence.*;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "course_num")
    private int courseNum;
    @Column(name = "course_title")
    private String courseTitle;
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
    @Column(name = "level1")
    private String level1;

    @Nullable
    @Column(name = "level2")
    private String level2;

    public Course() {
    }


    public int getCourseTotalCredits() {
        return regularCredits + advanceCredits + advancedSeminaryCredits + secondDegreeCredits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
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

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String offeredInSemesters() {

        String str = "";
        if (offeredInFallSemester)
            str += "א ";
        if (offeredInSpringSemester)
            str += "ב ";
        if (offeredInSummerSemester)
            str += "ג";

        return str;
    }

    public String level() {

        if (level2 == null)
            return level1;

        else if (level1 == null)
            return level2;

        else
            return level1 + " (" + regularCredits + ") + " + level2 + " (" + advanceCredits + ")";

    }

    public String associated() {

        String str = "";
        if (association1 != null)
            str += association1.getDisplayName() + "/";
        if (association2 != null)
            str += association2.getDisplayName() + "/";
        if (association3 != null)
            str += association3.getDisplayName() + "/";

        // Remove the trailing '/'
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            str = String.valueOf(new StringBuilder(str.substring(0, str.length() - 1)));
        }

        return str;
    }

// TODO add dependencies
}

