package com.example.springbootstudy;

import com.example.springbootstudy.controller.filter.MyFilter;
import com.example.springbootstudy.controller.listener.MyListener;
import com.example.springbootstudy.controller.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ServletRegistrationBean<MyServlet> getServletRegistrationBean() {
        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet(), "/testServlet");
        bean.setLoadOnStartup(1);
        return bean;
    }

    @Bean
    public FilterRegistrationBean<MyFilter> getFilterRegistrationBean() {
        return new FilterRegistrationBean<>(new MyFilter());
    }

    @Bean
    public ServletListenerRegistrationBean<MyListener> getServletListenerRegistrationBean() {
        return new ServletListenerRegistrationBean<>(new MyListener());
    }
}
