package com.vaxue.nav.ai.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理端首页
 *
 * @author wangfengxi1
 * @date 2023/4/28 17:35
 */
@RestController
public class IndexController {
    @RequestMapping("hello")
    public String hello() {
        return "hello admin!";
    }
}
