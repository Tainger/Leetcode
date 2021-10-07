package com.dytedance.design.iteratorpattern.optimize;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 4:59 下午
 */
public interface Iterator <E>{
    boolean hasNext();

    E currentIndex();

    void next();
}



    
