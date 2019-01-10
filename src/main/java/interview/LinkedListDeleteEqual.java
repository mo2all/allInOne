package interview;

import java.util.Arrays;

/**
 * @Description 删除链表中的某一个值
 * @Author Skye
 * @Date 2018/12/28 9:58
 * @Version 1.0
 **/
public class LinkedListDeleteEqual {

    public static Node delEqual(Node head, int value){
        //在设置prev前检查头节点的值是否包含value，如果包含则将其删除，以便维持循环不变式的成立
        while (head != null && head.getValue() == value){
            head = head.getNext().getNext();
        }
        if (head == null){
            return null;
        }
        Node prev = head;
        //循环不变式成立，如果循环体中prev的next的引用的的value等于value则将其删除，否则将next指向next.next
        while (prev.getNext() != null){
            if ( prev.getNext().getValue() == value){
                prev.setNext(prev.getNext().getNext());
            }
            else prev = prev.getNext();
        }
        return head;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.print(LinkedListDeleteEqual.delEqual(linkedList.createLinkedList(Arrays.asList(1,2,2,2,3,4,2,4,2)),2));
    }
}
