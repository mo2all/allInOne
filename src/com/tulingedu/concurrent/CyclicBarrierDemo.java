package com.tulingedu.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/18 9:39
 * @Version 1.0
 **/
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("先拍照，再吃饭");
                try {
                    Thread.sleep((long) (Math.random() * 10000));
                    System.out.println("准备吃饭");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        for (int i = 0; i < 3; i ++) {
            final int user = i + 1;
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("朋友【" + user + "】" + "从家里出发到大夫山聚餐中...");
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("朋友【" + user + "】" + "到达大夫山了");
                        System.out.println("当前已到达："+(cyclicBarrier.getNumberWaiting()+1));
                        //阻塞
                        cyclicBarrier.await();
                        System.out.println("朋友【" + user + "】" + "开始吃饭...");
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("朋友【" + user + "】" + "吃好了，准备回家...");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            };
            threadPool.execute(r);
        }
        threadPool.shutdown();

    }
}
