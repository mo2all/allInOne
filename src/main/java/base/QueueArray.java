package base;

import java.util.Iterator;

/**
 * @Description 使用数组实现队列，队列的容量是数组的长度-1
 * @Author Skye
 * @Date 2019/3/9 17:05
 * @Version 1.0
 **/
public class QueueArray implements Iterable<Integer>{
    @Override
    public Iterator iterator() {
        return new Iterator() {
            int h = head;
            int t = tail;
            @Override
            public boolean hasNext() {
                return h% n != t;
            }

            @Override
            public Object next() {
                int res = nums[h];
                h = (h + 1)%n;
                return res;
            }
        };
    }

    int[] nums;
    int n,head,tail;
    QueueArray(int n){
        nums = new int[n];
        this.n = n;
        head = 0;
        tail = 0;
    }
    public boolean enqueue(int num){
        if ((tail+1)%n == head){
            return false;
        }
        nums[tail] = num;
        tail = (tail+1)%n;
        return true;
    }
    public int dequeue(){
        if (tail == head){
            try {
                throw new Exception("队列为空");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int res = nums[head];
        head = (head+1)%n;
        return res;
    }


    public static void main(String[] args) {
        QueueArray queue = new QueueArray(6);
        queue.enqueue(3);
        queue.enqueue(8);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(1);
//        queue.enqueue(9);
        for (int num :
             queue) {
            System.out.println(num);
        }
    }
}
