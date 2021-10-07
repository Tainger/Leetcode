package com.dytedance.design.actionpattern.chainResonsibility.optimize02;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:36 上午
 */
public class HandlerA implements IHandler{
    @Override
    public boolean handle() {

        boolean handled = false;
        System.out.println("A逻辑执行");
        return handled;
    }
}



    
