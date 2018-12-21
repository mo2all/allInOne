package niuke.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/9 11:21
 * @Version 1.0
 **/
public class Solution3 {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

   public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
       Stack<Integer> stack = new Stack<>();
       ArrayList<Integer> resultList = new ArrayList<>();
       while (listNode != null){
           stack.push(listNode.val);
           listNode = listNode.next;
       }
       while (!stack.empty()){
           resultList.add(stack.pop());
       }
       return resultList;
    }

}
