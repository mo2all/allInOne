package niuke.offer;

import java.util.Stack;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/9 20:26
 * @Version 1.0
 **/
public class Solution5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    private boolean isPush = false;
    private boolean isPop = false;
    public void push(int node) {
        while(isPop && !stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        isPop = false;
        isPush = true;
        stack1.push(node);
    }

    public int pop() {

        while(isPush && !stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        isPop = true;
        isPush = false;
        return stack2.pop();

    }
}
