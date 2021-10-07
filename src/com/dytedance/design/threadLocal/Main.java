package com.dytedance.design.threadLocal;

/**
 * @author jiazhiyuan
 * @date 2021/10/3 1:25 下午
 */
public class Main {


    private String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被回收了");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                '}';
    }
}



    
