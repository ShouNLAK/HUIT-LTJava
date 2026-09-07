package com.example.tuan_04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class Login {
    @GetMapping("/Login")
    public String Login(){
        return "Login";
    }

    @PostMapping("/Dashboard")
    public String Dashboard(@RequestParam("email") String email, @RequestParam("password") String password, Model obj){
        obj.addAttribute("email",email);
        obj.addAttribute("password",password);
        if(Objects.equals(password,"0"))
            return "Dashboard";
        else
            return "Login";
    }
}
