package com.example.tuan_04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TimeController {
    @GetMapping("/")
    public String getTime(Model obj)
    {
        String time = String.valueOf(java.time.LocalTime.now());
        String date = String.valueOf(java.time.LocalDate.now());
        // obj.addAttribute("time",java.time.LocalDateTime.now());

        obj.addAttribute("time", time);
        obj.addAttribute("date", date);
        return "Time";
    }
}
