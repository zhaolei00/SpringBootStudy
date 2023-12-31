package com.example.springbootstudy.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${person.name}") // 配置文件进行注入
    String value;

    /**
     *
     * @return
     */
    @RequestMapping("/hello")
    public String hello(HttpSession session) {
        session.setAttribute("aa", "bb");
        return value;
    }

}
