package com.dytedance.design.threadLocal;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiazhiyuan
 * @date 2021/10/3 1:28 下午
 */
public class NormalReference {

    public static void main(String[] args) throws IOException {

        demo();
        System.gc();

        System.in.read();
    }

    private static void demo() {
        Map<String, Main> map = new HashMap<>();
        Main m  = new Main();
        map.put("hello", m);
    }
}



    
