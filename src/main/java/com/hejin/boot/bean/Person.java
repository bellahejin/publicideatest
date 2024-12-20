package com.hejin.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Date;

/**
 * @author hejin
 * @create 2024-12-20-17:23
 */
@ConfigurationProperties(prefix = "person") //和 yml 配置文件中的 person 绑定
@Component //把 Person 放到容器中，后续可以使用 yml 配置赋值
@Data //提供 get set 方法
public class Person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;
}

@Component
@Data
class Pet {
    private String name;
    private Double weight;
}
