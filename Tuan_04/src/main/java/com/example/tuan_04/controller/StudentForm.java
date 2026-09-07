package com.example.tuan_04.controller;

import com.example.tuan_04.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentForm {
    @GetMapping("/Student-Input")
    public String StudentInput(Model model) {
        model.addAttribute("Student", new Student());
        return "Student-Input";
    }

    @PostMapping("/Student-Result")
    public String StudentResult(@ModelAttribute("Student") Student sinhVien) {
        return "Student-Result";
    }
}
