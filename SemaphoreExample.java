import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    static Semaphore semaphore = new Semaphore(3);

    static class myThreads extends Thread {

        public void run() {
            try {
                semaphore.acquire();
                System.out.println("acquired!");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                // locks need to be released!
            }
        }
    }

    public static void main(String[] args) {
        myThreads t1 = new myThreads();
        t1.start();
        myThreads t2 = new myThreads();
        t2.start();
        myThreads t3 = new myThreads();
        t3.start();
        myThreads t4 = new myThreads();
        t4.start();
        myThreads t5 = new myThreads();
        t5.start();
    }

}