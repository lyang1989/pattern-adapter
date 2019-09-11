package com.princeli.pattern.adapter.loginadapter.v2.adapter;

import com.princeli.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className LoginAdapter
 * @date 2019-09-10 21:58
 * @description: TODO
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id,Object a);
}
