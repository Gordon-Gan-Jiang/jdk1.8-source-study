package com.test.executor;

/**
 * @author Gordon.Gan
 */

public class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
