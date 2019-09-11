package com.princeli.pattern.adapter.loginadapter.v2;

import com.princeli.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className IPassportForThird
 * @date 2019-09-10 21:55
 * @description: TODO
 */
public interface IPassportForThird {

    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForSina(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone,String code);

    public ResultMsg loginForRegister(String username,String password);

}
