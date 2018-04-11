package com.nd.social.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by quanzongwei(207127) on 2018/4/11 0011.
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public void hello(HttpServletRequest request) {
        System.out
                .println("hello world ");
    }
}
