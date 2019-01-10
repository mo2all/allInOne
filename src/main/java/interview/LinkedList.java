package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 将list<integer>转换成linkedList
 * @Author Skye
 * @Date 2018/12/27 20:05
 * @Version 1.0
 **/
public class LinkedList {
    public  Node createLinkedList(List<Integer> list){
        if (list.isEmpty()) return null;
        Node head = new Node(list.get(0));
        Node headOfSublist = createLinkedList(list.subList(1,list.size()));
        head.setNext(headOfSublist);
        return head;
    }
    public void  print(Node head){
        Node node = head;
        while (node != null){
            System.out.print(node.getValue()+" ");
            node = node.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.print(linkedList.createLinkedList(Arrays.asList(1,2,3,4)));
    }
}
