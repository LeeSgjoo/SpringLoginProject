package com.example.springloginproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    String index() {
        return "index";
    }

    @GetMapping("/list")
    String list() {
        return "memberlist";
    }
}
