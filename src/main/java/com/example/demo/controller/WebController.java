package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class WebController {

    @GetMapping("/")
    public ResponseEntity<?> getAllUsers(){
        return ResponseEntity.ok("Successfully");
    }
//    // Đón nhận request GET
//    @GetMapping("/") // Nếu người dùng request tới địa chỉ "/"
//    public String index() {
//        return "index"; // Trả về file index.html
//    }
//
//    @GetMapping("/about") // Nếu người dùng request tới địa chỉ "/about"
//    public String about() {
//        return "about"; // Trả về file about.html
//    }
//
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    public String hello(@RequestParam(name = "name",required = false,defaultValue = "") String name, Model model){
//        model.addAttribute("name",name);
//        return "hello";
//    }

}
