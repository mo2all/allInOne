package base;

/**
 * @Description 死锁的代码
 * @Author Skye
 * @Date 2019/3/11 10:22
 * @Version 1.0
 **/
public class DeadLock {
    public synchronized void lockA(){
        try {
            Thread.sleep(50);

        }catch (InterruptedException e) {
            e.printStackTrace();

        }
        lockB();
    }
    public synchronized void lockB(){
        try {
            Thread.sleep(50);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        lockA();
    }

    public static void main(String[] args) {
        DeadLock lock = new DeadLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lockA();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lockB();
            }
        }).start();
    }
}
