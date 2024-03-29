package com.princeli.pattern.adapter.loginadapter.v1.service;

import com.princeli.pattern.adapter.loginadapter.Member;
import com.princeli.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className SigninService
 * @date 2019-09-10 21:35
 * @description: TODO
 */
public class SigninService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username, String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return new ResultMsg(200,"登陆成功",new Member());
    }
}
