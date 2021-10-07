package com.bjmashibing.system.main;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author jiazhiyuan
 * @date 2021/10/4 5:49 下午
 */
public class Main {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        int a =  15;
        Map<String, String> mapT = new ConcurrentHashMap<>();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        int  b = Integer.parseInt("011000101101", 2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a & b);




    }
}



    
