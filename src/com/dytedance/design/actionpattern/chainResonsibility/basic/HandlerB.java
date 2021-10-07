package com.dytedance.design.actionpattern.chainResonsibility.basic;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:23 上午
 */
public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        System.out.println("处理B执行了");
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}



    
