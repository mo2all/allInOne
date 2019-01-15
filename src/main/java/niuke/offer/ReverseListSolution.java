package niuke.offer;


import org.w3c.dom.NodeList;

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
           return head;
        }
        newHead = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode ReverseList2(ListNode head) {
        ListNode newHead = null;
        ListNode currentHead = head;
        while(currentHead != null) {
            ListNode next = currentHead.next;
            currentHead.next = newHead;
            newHead = currentHead;
            currentHead = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        long start =  System.currentTimeMillis();
        ReverseListSolution reverseList = new ReverseListSolution();
        ListNode head = new ListNode(1);
        head.add(2).add(3).add(4).add(5).add(6).add(7).add(8);
        head = reverseList.ReverseList(head);
        System.out.println(head.val);
        head = reverseList.ReverseList2(head);
        System.out.println(head.val);
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
