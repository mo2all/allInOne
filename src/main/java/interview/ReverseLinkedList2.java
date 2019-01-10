package interview;

import java.util.Arrays;

/**
 * @Description 通过循环反转链表
 * @Author Skye
 * @Date 2018/12/28 9:23
 * @Version 1.0
 **/
public class ReverseLinkedList2 {
    public static Node reverse(Node head){
        Node curHead = head;
        Node newHead = null;
        while (curHead != null){
            Node next = curHead.getNext();
            curHead.setNext(newHead);
            newHead = curHead;
            curHead = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.print(ReverseLinkedList2.reverse(linkedList.createLinkedList(Arrays.asList(1,2,3,4))));
    }
}
