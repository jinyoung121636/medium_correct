package com.ll.medium_correct.domain.home.home.conrtoller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    @GetMapping("/")
    public String showMain(){
        return "domain/home/home/main";
    }
}