package com.princeli.pattern.adapter.loginadapter.v2;

import com.princeli.pattern.adapter.loginadapter.ResultMsg;
import com.princeli.pattern.adapter.loginadapter.v1.service.SigninService;
import com.princeli.pattern.adapter.loginadapter.v2.adapter.LoginAdapter;
import com.princeli.pattern.adapter.loginadapter.v2.adapter.LoginForQQAdapter;
import com.princeli.pattern.adapter.loginadapter.v2.adapter.LoginForSinaAdapter;
import com.princeli.pattern.adapter.loginadapter.v2.adapter.LoginForWechatAdapter;

/**
 * @author : princeli
 * @version 1.0
 * @className PassportForThirdAdapter
 * @date 2019-09-10 21:57
 * @description: 策略模式，工厂模式，结合适配器模式
 */
public class PassportForThirdAdapter extends SigninService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return processLogin(openId, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForSina(String openId) {
        return processLogin(openId, LoginForSinaAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForRegister(String username, String password) {
        super.register(username,password);
        return super.login(username,password);
    }


    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }



}
