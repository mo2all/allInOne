package concurrent.chapter4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/27 20:14
 * @Version 1.0
 **/
public class TwinsLockTest {

    final Lock lock = new TwinsLock();
     class Worker extends Thread{
        @Override
        public void run() {
            while (true) {
                lock.lock();
                try{
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(1);
                }catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        for (int i =0;i < 10;i++) {
            Worker worker = new TwinsLockTest().new Worker();
            worker.setDaemon(true);
            worker.start();
        }
        for (int i = 0;i < 10;i++){

            TimeUnit.SECONDS.sleep(1);
            System.out.println();
        }
    }

}
