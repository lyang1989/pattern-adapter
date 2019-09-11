package com.princeli.pattern.adapter.loginadapter.v2.adapter;

import com.princeli.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className RegistAdapter
 * @date 2019-09-11 19:18
 * @description: TODO
 */
public interface RegistAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object a);
}
