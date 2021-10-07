package com.dytedance.design.threadLocal;

/**
 * @author jiazhiyuan
 * @date 2021/10/3 12:49 下午
 */
public class ThreadLocalMain {

    static ThreadLocal<String> localVar = new ThreadLocal<>();



    static void print(String str) {
        System.out.println(str +":" + localVar.get());
        localVar.remove();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            localVar.set("localVar1");
            print("thread1");
            System.out.println("after remove: " + localVar.get());
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                localVar.set("localVar2");
                print("thread2");
                System.out.println("after remove: " + localVar.get());
            }

        });

        t1.start();
        t2.start();
    }
}



    
