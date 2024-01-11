package com.uni_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/privateArea")
    public String p() {

        return "home";
    }

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {

        return "fragments/login-form";
    }

    // add request mapping for /access-denied

    @GetMapping("/access-denied")
    public String showAccessDenied() {

        return "access-denied";
    }

}










