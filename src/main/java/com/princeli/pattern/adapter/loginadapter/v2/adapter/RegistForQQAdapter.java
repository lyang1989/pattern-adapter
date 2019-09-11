package com.princeli.pattern.adapter.loginadapter.v2.adapter;

import com.princeli.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className RegistForQQAdapter
 * @date 2019-09-11 19:18
 * @description: TODO
 */
public class RegistForQQAdapter implements RegistAdapter,LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public ResultMsg login(String id, Object a) {
        return null;
    }
}
