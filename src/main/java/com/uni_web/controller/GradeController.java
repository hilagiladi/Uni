package com.uni_web.controller;

import com.uni_web.moudle.course.Assignment;
import com.uni_web.moudle.course.CourseGrade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/course-grade")
public class GradeController {

    private CourseGrade courseGrade = new CourseGrade();

    @GetMapping("/calculator")
    public String showCalculator(Model model) {

        model.addAttribute("assignment", new Assignment());
        model.addAttribute("assignments", courseGrade.getAssignments());
        model.addAttribute("coursegrade", courseGrade);
        return "calculator";
    }

    @PostMapping("/calculator")
    public String addAssignment(@ModelAttribute Assignment assignment) {
        courseGrade.getAssignments().add(assignment);
        return "redirect:/course-grade/calculator";
    }

    @PostMapping("/addTest")
    public String addTest(@ModelAttribute("coursegrade") CourseGrade courseGrade1, Model model) {
        courseGrade.setTestGrade(courseGrade1.getTestGrade());
        model.addAttribute("coursegrade", courseGrade); // Add this line

        return "redirect:/course-grade/calculator";
    }

    @GetMapping("/remove")
    public String removeAssignment(@RequestParam("id") int id) {

        List<Assignment> tempAssignments = courseGrade.getAssignments().stream()
                .filter(obj -> obj.getId() != id)
                .collect(Collectors.toList());

        courseGrade.setAssignments(tempAssignments);

        return "redirect:/course-grade/calculator";
    }

    @PostMapping("/calc")
    public String calculateGrade(@ModelAttribute("coursegrade") CourseGrade courseGrade1) {
        double averageGrade = calculateAverage(); // You need to implement calculateAverage() method
        courseGrade.setCourseFinalGrade(averageGrade);

        return "redirect:/course-grade/calculator";
    }


    private double calculateAverage() {

        double result = 0.0;
        double totalWeight = 0.0;
        double finalGrade;

        for (Assignment assignment : courseGrade.getAssignments()) {
            result += (assignment.getGrade() * assignment.getWeight() / 100);
            totalWeight += assignment.getWeight();
        }

        finalGrade = courseGrade.getTestGrade() * ((100 - totalWeight) / 100) + result;


        return finalGrade;
    }
}

