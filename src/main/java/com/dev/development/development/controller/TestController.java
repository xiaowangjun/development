package com.dev.development.development.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("test")
    public String test(){
        System.out.println("jekins修改测试");
        return "success";
    }
}
