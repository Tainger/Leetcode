package com.dytedance.design.threadLocal;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author jiazhiyuan
 * @date 2021/10/3 2:43 下午
 */
public class WeakReferenceDemo {


    public static void main(String[] args) {

        WeakReference<Main> m = new WeakReference<>(new Main());

        System.out.println(m.get());
        System.gc();
        System.out.println(m.get());

    }
}



    
