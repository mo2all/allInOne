/**
 * @Description 测试线程的两种创建方式
 * @Author Skye
 * @Date 2018/12/18 11:35
 * @Version 1.0
 **/
public class testThread {
    class primeClass extends Thread{
        @Override
        public void run() {
            System.out.println("线程primeClass运行,"+Thread.currentThread().toString());
            try {
                sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class primeRunnable implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程primeRunnable运行," + Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        testThread.primeClass innerPrimeClass = new testThread().new primeClass();
        innerPrimeClass.run();
        testThread.primeRunnable innerPrimeRunnable = new testThread.primeRunnable();
        innerPrimeRunnable.run();
    }
}
