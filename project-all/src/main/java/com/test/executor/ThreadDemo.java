package com.test.executor;

/**
 * @author Gordon.Gan
 */
public class ThreadDemo extends Thread {
    private String name;

    private ThreadDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        //new ThreadDemo("方法调用").run();
        new ThreadDemo("线程调用").start();
    }
}
