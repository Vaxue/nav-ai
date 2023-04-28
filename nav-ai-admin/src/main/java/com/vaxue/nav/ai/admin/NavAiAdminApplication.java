package com.vaxue.nav.ai.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 管理端启动类
 *
 * @author wangfengxi1
 * @date 2023/4/28 17:24
 */
@SpringBootApplication(scanBasePackages = {"com.vaxue"})
public class NavAiAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(NavAiAdminApplication.class,args);
    }
}
