package com.princeli.pattern.adapter.loginadapter.v2;

/**
 * @author : princeli
 * @version 1.0
 * @className PassportTest
 * @date 2019-09-11 22:52
 * @description: TODO
 */
public class PassportTest {
    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");
    }
}
