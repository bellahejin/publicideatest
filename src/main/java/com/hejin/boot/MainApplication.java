package com.hejin.boot;

import com.hejin.boot.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author hejin
 * @create 2024-12-19-16:13
 */
@Slf4j //日志打印，使用 log.info
@SpringBootApplication //启动主程序入口
public class MainApplication {
    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //从容器中获取组件，获取 angel 组件
        User user01 = run.getBean("angel", User.class);
        System.out.println(user01);
        log.info("这是日志");
    }
}
