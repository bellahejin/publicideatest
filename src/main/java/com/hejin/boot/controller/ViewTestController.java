package com.hejin.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hejin
 * @create 2025-02-25-21:04
 * @description 渲染 success.html 页面内容
 */
@Controller
public class ViewTestController {
    @GetMapping("/testview")
    public String testSuccess(Model model){
        model.addAttribute("msg","hello world");
        model.addAttribute("link","https://www.baidu.com");
        return "success";//当访问 /testview 接口时，转发到 success.html 的页面
    }
}
