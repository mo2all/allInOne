package interview;

import java.util.Arrays;

/**
 * @Description 反转数组链表
 * @Author Skye
 * @Date 2018/12/27 20:04
 * @Version 1.0
 **/
public class ReverseLinkedList {

    public static Node reverse(Node head){
        if (head.getNext() == null){
            return head;
        }
        Node newHead = reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.print(ReverseLinkedList.reverse(linkedList.createLinkedList(Arrays.asList(1,2,3,4))));
    }

}
