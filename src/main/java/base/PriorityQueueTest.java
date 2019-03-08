package base;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Description 优先队列的使用
 * @Author Skye
 * @Date 2019/3/8 21:14
 * @Version 1.0
 **/
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });
        priorityQueue.add(4);
        priorityQueue.add(6);
        priorityQueue.add(3);
        priorityQueue.add(7);
        priorityQueue.add(10);
        System.out.println(priorityQueue.peek());
        if (priorityQueue.peek() < 11) priorityQueue.poll();
        priorityQueue.add(11);
        System.out.println(priorityQueue.peek());
    }
}
