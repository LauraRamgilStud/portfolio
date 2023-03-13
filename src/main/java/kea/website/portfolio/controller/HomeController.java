package kea.website.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/about-me")
    public String aboutMe(){
        return "aboutMe";
    }

    @GetMapping("/projects")
    public String projects(){
        return "projects";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
