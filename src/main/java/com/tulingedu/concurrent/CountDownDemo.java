package com.tulingedu.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @Description 倒计时计数器
 * @Author Skye
 * @Date 2018/12/18 10:42
 * @Version 1.0
 **/
public class CountDownDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("任务1执行中..." + Thread.currentThread().toString());
                    Thread.sleep((long)(Math.random()*10000));
                    System.out.println("任务1执行完毕..." +Thread.currentThread().toString());
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("任务2执行中..." + Thread.currentThread().toString());
                    Thread.sleep((long)(Math.random()*10000));
                    System.out.println("任务2执行完毕..." + Thread.currentThread().toString());
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("主线程等待任务一和任务2的执行...." + Thread.currentThread().toString());
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("任务1和2执行完毕，开始执行主线程..." + Thread.currentThread().toString());
            }
        }).start();

    }
}
