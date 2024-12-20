package com.hejin.boot.controller;

import com.hejin.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hejin
 * @create 2024-12-19-16:16
 */
@RestController //web 程序启动
public class HelloController {

    @Autowired //用于实现自动依赖注入，自动满足类中对 Person 组件的依赖，而无需手动实例化
    Person person;

    @RequestMapping("/hello") //这是页面地址，下面的方法返回值是页面展示内容
    public String handle01() {
        return "Hello,Spring Boot!";
    }

    @RequestMapping("/person")
    public Person viewPerson(){
        return person;
    }
}
