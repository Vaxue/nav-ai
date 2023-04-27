package com.vaxue.domain;

import lombok.Data;

/**
 * 用户类
 *
 * @author wangfengxi1
 * @date 2023/4/27 20:57
 */
@Data
public class User {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}

