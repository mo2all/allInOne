package base.producerConsumer;

/**
 * @Description 使用对象锁实现生产和消费者模式
 * @Author Skye
 * @Date 2019/3/10 14:15
 * @Version 1.0
 **/
public class Producer implements Runnable{
    LockObject lockObject;
    Producer(LockObject lockObject){
        this.lockObject = lockObject;
    }
    @Override
    public void run() {
        synchronized (lockObject){
            while (!lockObject.isEmpty()){
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
            System.out.println(Thread.currentThread().getName()+" 生产者成功生产了！！！");
            lockObject.setEmpty(false);
            lockObject.notifyAll();
            System.out.println("生产线程 "+Thread.currentThread().getName()+" exit");
        }

    }

}
