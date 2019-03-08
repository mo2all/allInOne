package concurrent.chapter4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Description 在同一个时刻只允许两个线程访问，超过两个线程的访问将会被阻塞
 * @Author Skye
 * @Date 2019/1/27 19:47
 * @Version 1.0
 **/
public class TwinsLock implements Lock {

    private final Sync sync = new Sync(2);

    private static final class Sync extends AbstractQueuedSynchronizer {

        Sync(int count) {
            if (count <= 0) {
                throw new IllegalArgumentException("count must be large than zero");
            }
            setState(count);
        }
        @Override
        protected int tryAcquireShared(int reduceCount) {
            for (;;){
                int curCount = getState();
                int newCount = curCount - reduceCount;
                if (newCount < 0 || compareAndSetState(curCount,newCount)) {
                    return newCount;
                }
            }
        }

        @Override
        protected boolean tryReleaseShared(int returnCount) {
            for (;;) {
                int curCount = getState();
                int newCount = curCount + returnCount;
                if (compareAndSetState(curCount,newCount)){
                    return true;
                }
            }
        }
    }
    @Override
    public void lock() {
        sync.acquireShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }


    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.releaseShared(1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
