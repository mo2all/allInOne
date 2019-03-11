package base.producerConsumer;

/**
 * @Description
 * @Author Skye
 * @Date 2019/3/10 14:53
 * @Version 1.0
 **/
public class LockObject {
//    private Object lock;
    private boolean empty;
    LockObject(boolean flag){
//        this.lock = lock;
        this.empty = flag;
    }

//    public Object getLock() {
//        return lock;
//    }
//
//    public void setLock(Object lock) {
//        this.lock = lock;
//    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
