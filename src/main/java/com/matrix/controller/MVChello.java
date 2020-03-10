package com.matrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MVChello {
    @GetMapping("/hello") // 所述@GetMapping注释可以确保HTTP GET请求到 /hello被映射到hello()方法。
    public String hello(@RequestParam(name="name", required=false, defaultValue="没有传参") String name, Model model){
        model.addAttribute("name",name); /*@RequestParam将查询字符串参数的值绑定name到方法的name参数hello()*/
        return "hello";
    }
}
