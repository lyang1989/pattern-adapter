package com.princeli.pattern.adapter.poweradapter;

/**
 * @author : princeli
 * @version 1.0
 * @className PowerAdapter
 * @date 2019-09-10 21:17
 * @description: TODO
 */
public class PowerAdapter implements DC5{

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输入AC："+adapterInput+"V,输出："+adapterOutput+"V");
        return adapterOutput;
    }
}
