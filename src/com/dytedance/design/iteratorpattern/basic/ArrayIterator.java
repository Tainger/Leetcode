package com.dytedance.design.iteratorpattern.basic;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 4:47 下午
 */
public class ArrayIterator<E> implements Iterator<E> {

    private int cursor;
    private ArrayList<E> arrayList;

    public ArrayIterator(ArrayList<E> arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if(cursor >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}



    
