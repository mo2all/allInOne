package base;

import java.util.Random;

/**
 * @Description 线程测试
 * @Author Skye
 * @Date 2019/3/8 21:22
 * @Version 1.0
 **/
public class ThreadTest {
    public static void main(String[] args)  {
        for (int i = 0; i < 10000; i ++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep((int)(Math.random()*4000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程"+Thread.currentThread().getName()+"开始运行");
                    try {
                        Thread.sleep((int)(Math.random()*5000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程"+Thread.currentThread().getName()+"结束运行");
                }
            },Integer.toString(i));
            thread.start();

//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(i);
        }
    }
}
