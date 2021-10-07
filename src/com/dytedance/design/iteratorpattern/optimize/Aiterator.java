package com.dytedance.design.iteratorpattern.optimize;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 4:58 下午
 */
public class Aiterator <E>implements Iterator<E>{

    private  int cursor;

    private ArrayList<E> arrayList = new ArrayList();

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    @Override
    public E currentIndex() {

        if(cursor >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }

    @Override
    public void next() {
        cursor++;
    }
}



    
