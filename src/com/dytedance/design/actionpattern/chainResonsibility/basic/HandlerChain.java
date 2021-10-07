package com.dytedance.design.actionpattern.chainResonsibility.basic;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:24 上午
 */
public class HandlerChain {

    //标志执行链的头
    private Handler head = null;
    //用来连接执行链
    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}



    
