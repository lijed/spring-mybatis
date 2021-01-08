/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.springmybatis.controller;

import com.me.learn.springmybatis.mybatis.TUserMapper;
import com.me.learn.springmybatis.mybatis.entity.TUser;
import com.me.learn.springmybatis.mybatis.entity.TUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @date 2021/1/7 20:33
 * Project Name: spring-mybatis
 */
@RestController
public class UserController {

    @Autowired
    TUserMapper tUserMapper;

    @GetMapping("/userList")
    public List<TUser> getLists() {
        TUserExample tUserExample =  new TUserExample();
        tUserExample.createCriteria();
        return tUserMapper.selectByExample(tUserExample);
    }
}
