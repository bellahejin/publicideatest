package com.hejin.boot.config;

import com.hejin.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hejin
 * @create 2024-12-20-15:00
 */
@Configuration //告诉SpringBoot这是一个配置类 == 配置文件
public class base {
    @Bean //给容器添加组件，方法名是组件的 id，返回类型是组件的类型，返回值是组件在容器中的实例
    public User angel(){
        return new User("xiaotianshi",18);
    }
}
