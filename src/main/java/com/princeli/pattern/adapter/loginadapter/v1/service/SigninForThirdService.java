package com.princeli.pattern.adapter.loginadapter.v1.service;

import com.princeli.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className SigninForThirdService
 * @date 2019-09-10 21:36
 * @description: TODO
 */
public class SigninForThirdService extends SigninService{

    public ResultMsg loginForQQ(String openId){
        return loginForRegister(openId,null);
    }

    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code) {
        return null;
    }

    public ResultMsg loginForRegister(String username,String password) {
        ResultMsg msg = super.register(password,null);
        return super.login(username,null);
    }
}
