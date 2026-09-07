package com.example.tuan_04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InOutController {
    @RequestMapping(value = "/Input", method = RequestMethod.GET)
    public String input(Model obj)
    {
        return "Input";
    }

    @RequestMapping(value = "/Output",method = RequestMethod.POST)
    public String output(@RequestParam("fullName") String data, Model obj)
    {
        obj.addAttribute("fullName",data);
        return "Output";
    }
}
