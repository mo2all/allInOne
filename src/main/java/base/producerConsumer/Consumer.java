package base.producerConsumer;

/**
 * @Description 使用对象锁实现消费者
 * @Author Skye
 * @Date 2019/3/10 14:23
 * @Version 1.0
 **/
public class Consumer implements Runnable {
    private LockObject lockObject;
    public Consumer(LockObject lockObject){
        this.lockObject = lockObject;
    }
    @Override
    public void run() {
        synchronized (lockObject){
            while (lockObject.isEmpty()){
                try {
                    lockObject.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep((int)(Math.random()*100));

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" 消费者成功消费了！！！");
            lockObject.setEmpty(true);
            lockObject.notifyAll();
            System.out.println("消费线程 "+Thread.currentThread().getName()+" exit");
        }
    }
}
