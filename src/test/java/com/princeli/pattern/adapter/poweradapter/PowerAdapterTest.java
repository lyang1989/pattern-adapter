package com.princeli.pattern.adapter.poweradapter;

/**
 * @author : princeli
 * @version 1.0
 * @className PowerAdapterTest
 * @date 2019-09-10 21:20
 * @description: TODO
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
