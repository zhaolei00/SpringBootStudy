package com.example.springbootstudy.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "person") // 配置文件进行注入
public class Person {

    private String name;

    private int age;

    //    @Value("${person.like}") // @Value 注解不支持复杂类型。
    private List<String> like;


}
