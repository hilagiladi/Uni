package com.uni_web.controller;

import com.uni_web.moudle.course.CourseCalc;
import com.uni_web.service.CourseService;
import com.uni_web.entity.Course;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/courses")
public class CourseController {

    private CourseService courseService;


    @Autowired // optional bc there is only one contractor
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    // add mapping for "/list"
    @GetMapping("/list")
    public String listCourses(Model model) {

        // get the w\employees from db
        List<Course> employeeList = courseService.findAll();
        System.out.println(employeeList);

        // add to the spring model
        model.addAttribute("courses", employeeList);

        return "list-courses";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        // create model attribute to bind the form data
        Course course = new Course();

        model.addAttribute("courses", course);

        return "course-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("courses") Course course) {

        if (StringUtils.isBlank(course.getLevel2())) {
            course.setLevel2(null);
        }

        // setting the course link
        course.setLink("https://www.openu.ac.il/courses/" + course.getCourseNum() + ".htm?_gl=1");

        // save the employee to the db
        courseService.save(course);

        return "redirect:/courses/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("id") int theId, Model model) {

        // get th employee from the service
        Course course = courseService.findById(theId);

        // set employee in the model to prepopulate the form
        model.addAttribute("courses", course);

        // sent over to our form
        return "course-form";
    }

    @GetMapping("/calc")
    public String calculate(@ModelAttribute("courseCalc") CourseCalc courseCalc, Model model) {

        int mmn11 = courseCalc.getMmn11G();
        int mmn12 = courseCalc.getMmn12G();
        int result = mmn11 + mmn12;

        model.addAttribute("result", result);

        return "course-calc";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int theId) {

        courseService.deleteById(theId);

        return "redirect:/courses/list";
    }
}
