package com.dytedance.design.threadLocal;

import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jiazhiyuan
 * @date 2021/10/3 9:12 下午
 */
public class PhantomReferenceDemo {

    private static final List<Object> LIST = new LinkedList<>();

    private static final ReferenceQueue<Main> QUEUE = new ReferenceQueue();


    public static void main(String[] args) throws IOException {



        PhantomReference phantomReference = new PhantomReference(new Main(), QUEUE);

        new Thread(()->{
           while (true) {
               LIST.add(new byte[1024 * 1024 * 10]);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
                   Thread.currentThread().interrupt();
               }
               System.out.println(phantomReference.get());
           }
        }).start();



        new Thread(()->{
            while (true) {
                Reference<? extends Main> poll = QUEUE.poll();
                if(poll != null) {
                    System.out.println(poll);
                    System.out.println("------虚引用对象jvm回收了--------- " + poll);
                }
            }

        }).start();


        System.in.read();

    }

}



    
