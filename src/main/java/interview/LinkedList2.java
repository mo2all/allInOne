package interview;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @Description 实现迭代器的链表
 * @Author Skye
 * @Date 2018/12/28 20:24
 * @Version 1.0
 **/
public class LinkedList2<Item> implements Iterable<Item> {
    @Override
    public Iterator<Item> iterator() {
        return new myIterator();
    }
    class myIterator implements Iterator<Item>{
        Node current = head;
        @Override
        public boolean hasNext() {
            if (current == null){
                return false;
            }
            return true;
        }

        @Override
        public Item next() {
            if (current == null) throw  new NoSuchElementException();
            Item value = current.value;
            current = current.next;
            return value;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    class Node{
        Node(Item value){
           this.value = value;
        }
        private Item value;
        private Node next;
    }
    public void add(Item value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }


    public static void main(String[] args) {
        LinkedList2<Integer> link = new LinkedList2<>();
        for (int i = 0; i < 100; i = i+2){
            link.add(i);
        }
        for (Integer item: link
             ) {
            System.out.println(item);

        }
    }
}
