package com.princeli.pattern.adapter.loginadapter.v2.adapter;

import com.princeli.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className LoginForTelphoneAdapter
 * @date 2019-09-10 22:03
 * @description: TODO
 */
public class LoginForTelphoneAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelphoneAdapter;
    }

    @Override
    public ResultMsg login(String id, Object a) {
        return null;
    }
}
