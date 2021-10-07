package com.dytedance.design.actionpattern.chainResonsibility.basic;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:21 上午
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();

}



    
