package com.test.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Gordon.Gan
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {
        //ExecutorService pool = Executors.newFixedThreadPool(5);
        ExecutorService pool = Executors.newCachedThreadPool();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(10));
        for (int i = 1; i < 10; i++) {
            pool.execute(new MyTask());
        }
    }
}

