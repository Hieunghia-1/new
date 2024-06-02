package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("message","XIN CHÀO TRƯỜNG ĐẠI HỌC VĂN LANG!");
        return "index";  // Trả về trang index.html
    }
    // Có thể mapping thêm các endpoint khác nữa...
}


