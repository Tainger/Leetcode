package com.dytedance.design.iteratorpattern.basic;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 4:46 下午
 */
public interface Iterator <E>{

    boolean hasNext();

    void next();

    E currentItem();

}



    
