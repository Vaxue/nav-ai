package com.vaxue.nav.ai.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Web启动类
 *
 * @author wangfengxi1
 * @date 2023/4/27 16:30
 */
@SpringBootApplication(scanBasePackages = {"com.vaxue"})
public class NavAiWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(NavAiWebApplication.class,args);
    }
}
