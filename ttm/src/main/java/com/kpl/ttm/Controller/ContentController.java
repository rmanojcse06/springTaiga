package com.kpl.ttm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ContentController {

    @GetMapping("/")
    public String showIndex() {
        System.out.println("login successfully!!!");
        return "loginPage";
    }

    @GetMapping("/req/signup")
    public String signup() {
        return "signupPage";
    }

}