package com.dytedance.design.iteratorpattern.basic;

import java.util.ArrayList;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 4:52 下午
 */
public class Demo {


    public static void main(String[] args) {
        ArrayList<String>  names = new ArrayList<>();

        names.add("xzg");
        names.add("wang");
        names.add("zheng");

        Iterator<String> iterator = new ArrayIterator(names);

        while (iterator.hasNext()){
            String s = iterator.currentItem();
            System.out.println(s);
            iterator.next();
        }
     }
}



    
