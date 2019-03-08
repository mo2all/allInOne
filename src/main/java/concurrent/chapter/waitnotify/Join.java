package concurrent.chapter.waitnotify;

import java.util.concurrent.TimeUnit;

/**
 * @Description join方法的使用
 * @Author Skye
 * @Date 2019/1/26 22:36
 * @Version 1.0
 **/
public class Join {

    public static void main(String[] args) throws InterruptedException {
    Thread previous = Thread.currentThread();
        for(int i =0;i < 10;i++){
            Thread cur = new Thread(new Domino(previous),Integer.toString(i));
            cur.start();
            previous = cur;
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName()+" terminated");
    }
    static class Domino implements Runnable{
        Thread thread;
        Domino(Thread thread){
            this.thread = thread;
        }

        @Override
        public void run() {
            if (thread != null) {
                try {
                    thread.join();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" terminated");
            }
        }
    }
}
