import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Preventing threads from multiple places to access a resource at the same time

public class locks {
    private Lock lock;

    public locks() {
        lock = new ReentrantLock();
    }

    public void lockExample1() {
        lock.lock();
        try {
            // thread executes something
            Thread.sleep(3000);
            
        }
        catch(InterruptedException e) { }
        lock.unlock();
    }

    public void lockExample2() {
        lock.lock();
        try {
            // thread executes something
            Thread.sleep(3000);
        }
        catch(InterruptedException e) { }
        lock.unlock();
    }

}