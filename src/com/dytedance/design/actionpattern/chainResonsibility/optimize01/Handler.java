package com.dytedance.design.actionpattern.chainResonsibility.optimize01;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:29 上午
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
    }

    protected abstract  boolean doHandle();

}



    
