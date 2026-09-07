package com.example.tuan_04.controller;

import com.example.tuan_04.Model.Student_Muti;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormStudent {
    @GetMapping("/Form")
    public String StudentInput(Model model) {
        model.addAttribute("Student_Muti", new Student_Muti());
        return "Form";
    }

    @PostMapping("/Result")
    public String StudentResult(@ModelAttribute("Student_Muti") Student_Muti sinhVien) {
        return "Result";
    }
}
