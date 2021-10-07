package com.dytedance.design.threadLocal;

import java.lang.ref.SoftReference;

/**
 * @author jiazhiyuan
 * @date 2021/10/3 2:43 下午
 */
public class SoftReferenceDemo {


    public static void main(String[] args) {

        SoftReference m = new SoftReference<byte[]>(new byte[1024 * 1024 * 10]);

        System.out.println(m.get());

        System.gc();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(m.get());

        byte[]  b = new byte[1024* 1024 * 15];

        System.out.println(m.get());
    }
}



    
