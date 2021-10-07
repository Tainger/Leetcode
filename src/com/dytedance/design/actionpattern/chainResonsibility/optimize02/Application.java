package com.dytedance.design.actionpattern.chainResonsibility.optimize02;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:42 上午
 */
public class Application {


    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();

        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());

        chain.handle();
    }
}



    
