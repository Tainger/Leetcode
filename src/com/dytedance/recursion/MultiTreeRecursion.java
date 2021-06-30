package com.dytedance.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiazhiyuan
 * @date 2021/6/20 10:33 上午
 */
public class MultiTreeRecursion {
    private Map<String, List<String>> map ;


    public MultiTreeRecursion(Map<String, List<String>> map) {
        this.map = map;
    }

    public void deepTransverse (String name) {
        if(null == name) {
            return;
        }
        System.out.println(name);
        List<String> strings = map.get(name);
        if(null == strings) {
            return;
        }
        for (String nextName : strings) {
            deepTransverse(nextName);
        }
    }


    public static void main(String[] args) {
        String num1 = "1";
        String num2 = "2";
        String num3 = "3";
        String num4 = "4";
        String num5 = "5";
        String num6 = "6";
        String num7 = "7";
        Map<String, List<String>> map = new HashMap<>();
        List<String> one = new ArrayList();
        one.add(num2);
        one.add(num3);
        one.add(num4);
        map.put(num1, one);

        List<String> two = new ArrayList();
        two.add(num6);
        two.add(num7);
        two.add(num5);
        map.put(num2,two);
        MultiTreeRecursion multiTreeRecursion = new MultiTreeRecursion(map);
        multiTreeRecursion.deepTransverse(num1);

    }
}



    
