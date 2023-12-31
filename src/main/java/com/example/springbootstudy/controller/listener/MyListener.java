package com.example.springbootstudy.controller.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener {
    public static int ONLINE = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ONLINE++;
        System.out.println(getClass().getName() + ":create");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ONLINE--;
        System.out.println(getClass().getName() + ":destroy");
    }
}
