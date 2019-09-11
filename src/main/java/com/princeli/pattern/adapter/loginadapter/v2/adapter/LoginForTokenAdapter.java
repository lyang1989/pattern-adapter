package com.princeli.pattern.adapter.loginadapter.v2.adapter;

import com.princeli.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className LoginForTokenAdapter
 * @date 2019-09-10 22:02
 * @description: TODO
 */
public class LoginForTokenAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object a) {
        return null;
    }
}
