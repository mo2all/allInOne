package base.blockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * @Description 使用阻塞队列生成生产者模式
 * @Author Skye
 * @Date 2019/3/9 11:19
 * @Version 1.0
 **/
public class Producer implements Runnable {
    BlockingQueue<Message> queue;
    public Producer(BlockingQueue<Message> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        for (int i = 0; i <100; i++){
            try {
                Thread.sleep(i);
                Message msg = new Message(""+i);
                queue.put(msg);
                System.out.println("Produced "+ msg.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        queue.add(new Message("exit"));
    }
}
