package niuke.offer;

import designPattern.chapter12.Main;
import org.w3c.dom.NodeList;

import java.util.List;

/**
 * @Description 反转链表
 * @Author Skye
 * @Date 2019/1/10 16:54
 * @Version 1.0
 **/
public class ReverseListSolution {


    private ListNode newHead = null;
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) {
            newHead = head;
            return newHead;
        }
        ReverseList(head.next);
        head.next.next = head.next;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        long start =  System.currentTimeMillis();
        ReverseListSolution reverseList = new ReverseListSolution();
        ListNode head = new ListNode(1);
        head.add(2).add(3).add(4).add(5);
        head = reverseList.ReverseList(head);
        System.out.println(head.val);
        for (int i = 0; i < 1000; i++);
        System.out.println((System.currentTimeMillis() - start));
    }
}
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
    public ListNode add(int nextVal){
        ListNode node = new ListNode(nextVal);
        this.next = node;
        return node;
    }
}
