package com.uni_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showLanding() {
        return "index";
    }

    @GetMapping("/testing")
    public String contact() {
        return "testing";
    }

    @GetMapping("/employees")
    public String showHome() {
        return "home";
    }


    // add a request mapping for /leaders
    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }

    // add request mapping for /systems

    @GetMapping("/systems")
    public String showSystems() {

        return "systems";
    }

}









