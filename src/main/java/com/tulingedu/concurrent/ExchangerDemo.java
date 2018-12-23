package com.tulingedu.concurrent;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 两个线程同步交换数据
 * @Author Skye
 * @Date 2018/12/18 10:22
 * @Version 1.0
 **/
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ExecutorService threadPool = Executors.newCachedThreadPool();
        //绑架团伙
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    long time  = (long) (Math.random()*10000);
                    System.out.println("兰迟到: " + time/1000 + "s");
                    Thread.sleep(time);
                    String returnData = exchanger.exchange("柯南");
                    System.out.println("犯罪团伙利用人质柯南拿到："+returnData);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //兰
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String returnData = exchanger.exchange("1000万");
                    System.out.println("兰用1000万赎回："+returnData);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadPool.shutdown();
    }
}
