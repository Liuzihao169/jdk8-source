package com.harry.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuzihao
 * @create 2022-01-22-16:07
 */
public class DemoMain {
    public static void main(String[] args) {
        System.out.println("sources.....main");

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(()->{
            System.out.println("hello executors");
        });
    }
}
