package com.dytedance.design.actionpattern.chainResonsibility.basic;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:22 上午
 */
public class HandlerA extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        System.out.println("处理A执行了");
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}



    
