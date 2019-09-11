package com.princeli.pattern.adapter.loginadapter.v1;

import com.princeli.pattern.adapter.loginadapter.v1.service.SigninForThirdService;

/**
 * @author : princeli
 * @version 1.0
 * @className SigninForThirdServiceTest
 * @date 2019-09-10 21:53
 * @description: TODO
 */
public class SigninForThirdServiceTest {

    public static void main(String[] args) {
        SigninForThirdService service = new SigninForThirdService();

        service.login("tom","123456");
        service.loginForQQ("12324324");
        service.loginForWechat("123434");
    }

}
