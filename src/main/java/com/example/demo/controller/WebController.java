package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/v1")
public class WebController {

    // Đón nhận request GET
    @GetMapping("/") // Nếu người dùng request tới địa chỉ "/"
    public String index() {
        return "index"; // Trả về file index.html
    }

    @GetMapping("/about") // Nếu người dùng request tới địa chỉ "/about"
    public String about() {
        return "about"; // Trả về file about.html
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam(name = "name",required = false,defaultValue = "") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }

}
