package com.dytedance.design.iteratorpattern.optimize_fail_fast;

import com.dytedance.design.iteratorpattern.optimize.Iterator;

import java.util.ArrayList;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 5:33 下午
 */
public class ArrayIterator<E> implements Iterator<E> {

    private int cursor;

    private ArrayList<E> arrayList ;

    private int expectedModCount;

    public ArrayIterator( ArrayList<E> arrayList, int expectedModCount) {
        this.cursor = 0;
        this.arrayList = arrayList;
        this.expectedModCount  = 0 ;
    }

    @Override
    public boolean hasNext() {
        return arrayList.size() == cursor;
    }

    @Override
    public E currentIndex() {
        return null;
    }

    @Override
    public void next() {

    }
}



    
