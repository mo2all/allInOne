package base.producerConsumer;

/**
 * @Description 测试生产消费模式
 * @Author Skye
 * @Date 2019/3/10 14:31
 * @Version 1.0
 **/
public class Service {

    public static void main(String[] args) {
        System.out.println("主线程启动");
        LockObject lockObject = new LockObject(true);
        Consumer consumer = new Consumer(lockObject);
        Producer producer = new Producer(lockObject);

        for (int i = 0; i < 100; i++){
            new Thread(consumer,Integer.toString(i)).start();
            new Thread(producer,Integer.toString(i)).start();

        }
        System.out.println("主线程结束");
    }
}
