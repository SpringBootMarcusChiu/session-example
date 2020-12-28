package com.marcuschiu.sessionexample.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {

    @RequestMapping("/")
    public String helloAdmin(@CookieValue("SESSION") String session) {
        return "hello admin. your session cookie is: " + session;
    }
}
