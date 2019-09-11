package com.princeli.pattern.adapter.loginadapter.v2.adapter;

import com.princeli.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className LoginForWechatAdapter
 * @date 2019-09-10 22:01
 * @description: TODO
 */
public class LoginForWechatAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object a) {
        return null;
    }
}
