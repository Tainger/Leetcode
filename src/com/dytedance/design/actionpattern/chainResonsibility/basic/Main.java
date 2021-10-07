package com.dytedance.design.actionpattern.chainResonsibility.basic;


import org.junit.jupiter.api.Test;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:25 上午
 */
public class Main {






    @Test
    public void test() {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}



    
