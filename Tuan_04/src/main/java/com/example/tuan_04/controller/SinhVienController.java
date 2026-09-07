package com.example.tuan_04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {
    @GetMapping("/Sinh-vien")
    public String sinhVien(Model obj) {
        obj.addAttribute("fullName","Nguyễn Văn A");
        obj.addAttribute("age",20);
        obj.addAttribute("major","Công nghệ thông tin");
        return "SinhVien";
    }
}
