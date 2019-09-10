package com.princeli.pattern.adapter.loginadapter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : princeli
 * @version 1.0
 * @className ResultMsg
 * @date 2019-09-10 21:33
 * @description: TODO
 */
@Data
@AllArgsConstructor
public class ResultMsg {

    private int code;

    private String msg;

    private Object data;

}
