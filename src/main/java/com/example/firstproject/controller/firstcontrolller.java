package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstcontrolller {

    @GetMapping("/hi")
    public String NiceToMeetYou(Model model){
        model.addAttribute("username", "준현");
        return "greetings";
    }

    @GetMapping("/bye")
    public String SeeyouNext(Model model){
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }
}
