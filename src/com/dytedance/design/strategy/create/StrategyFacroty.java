package com.dytedance.design.strategy.create;

import com.dytedance.design.strategy.ConcreteStrategyA;
import com.dytedance.design.strategy.ConcreteStrategyB;
import com.dytedance.design.strategy.Strategy;

/**
 * @author jiazhiyuan
 * @date 2021/9/30 8:32 下午
 */
public class StrategyFacroty {

    public static Strategy getStrategy(String type) {
        if(type == null || type.isEmpty()) {
            throw new IllegalArgumentException("they should not be empty.");
        }

       if(type.equals("A")) {
           return new ConcreteStrategyA();
       }else if(type.equals("B")) {
           return new ConcreteStrategyB();
       }
        return null;
    }
}



    
