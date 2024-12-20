package com.hejin.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hejin
 * @create 2024-12-19-16:16
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello,Spring Boot!";
    }
}
