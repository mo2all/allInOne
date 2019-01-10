package interview;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/28 8:49
 * @Version 1.0
 **/
public class Node {

    Node(int value) {
        this.value = value;
        next = null;
    }
    private final int value;
    private Node next;

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return Node.class.getName() + "[value = "+value +"]";
    }
}
