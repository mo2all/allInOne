package com.tulingedu.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/18 8:40
 * @Version 1.0
 **/

public class SemaphoreDemo {
    class SemaphoreRunnable implements Runnable{
        private Semaphore semaphore;
        private int user;
        public SemaphoreRunnable(Semaphore semaphore, int user){
            this.semaphore = semaphore;
            this.user = user;
        }
        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("用户【"+user+"】"+"进入窗口准备买票...");
                Thread.sleep((long) (Math.random()*10000));
                System.out.println("用户【"+user+"】"+"买票完成，准备离开...");
                Thread.sleep((long) (Math.random()*10000));
                System.out.println("用户【"+user+"】"+"离开窗口");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void execute(){
        //定义窗口的个数
        final Semaphore semaphore = new Semaphore(2);
        //线程池
        ExecutorService threadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++){
            //去买票
            threadPool.execute(new SemaphoreRunnable(semaphore, i+1));
        }
        threadPool.shutdown();
    }

    public static void main(String[] args) {
        SemaphoreDemo semaphoreDemo = new SemaphoreDemo();
        semaphoreDemo.execute();
    }
}
