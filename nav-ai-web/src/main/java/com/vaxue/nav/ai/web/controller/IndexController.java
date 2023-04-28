package com.vaxue.nav.ai.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * web端首页
 *
 * @author wangfengxi1
 * @date 2023/4/27 16:34
 */
@RestController
public class IndexController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello web!";
    }
}
