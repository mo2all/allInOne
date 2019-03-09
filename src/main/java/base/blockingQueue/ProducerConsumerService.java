package base.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Description 测试生产消费者模式
 * @Author Skye
 * @Date 2019/3/9 11:38
 * @Version 1.0
 **/
public class ProducerConsumerService {

    public static void main(String[] args) {
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Consumer consumer = new Consumer(queue);
        Producer producer = new Producer(queue);
        //启动生产者线程
        new Thread(producer).start();
        //启动消费者线程
        new Thread(consumer).start();

        System.out.println(Thread.currentThread().getName()+"启动成功");
    }
}
