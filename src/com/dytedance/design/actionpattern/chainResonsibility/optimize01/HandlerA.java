package com.dytedance.design.actionpattern.chainResonsibility.optimize01;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:32 上午
 */
public class HandlerA extends Handler{
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("AAAAA");
        return handled;
    }
}



    
