package base.blockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * @Description 使用BlockingQueue实现消费者模式
 * @Author Skye
 * @Date 2019/3/9 11:20
 * @Version 1.0
 **/
public class Consumer implements Runnable {

    BlockingQueue<Message> queue;
    Message msg;
    public Consumer(BlockingQueue<Message> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            while ((msg = queue.take()).getMsg() != "exit"){
                Thread.sleep(10);
                System.out.println("Consumed " + msg.getMsg());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
