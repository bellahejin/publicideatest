package com.hejin.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author hejin
 * @create 2024-12-20-15:09
 */
@AllArgsConstructor //提供全参数构造器
@NoArgsConstructor //提供无参构造器
@Data //提供属性的 get、set 方法
@ToString //重写 ToString 方法
public class User {
    private String name;
    private Integer age;
}
