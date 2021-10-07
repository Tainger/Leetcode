package com.dytedance.design.actionpattern.chainResonsibility.optimize01;


import com.dytedance.design.actionpattern.chainResonsibility.basic.HandlerA;
import com.dytedance.design.actionpattern.chainResonsibility.basic.HandlerB;
import com.dytedance.design.actionpattern.chainResonsibility.basic.HandlerChain;
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



    
