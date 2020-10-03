import java.util.concurrent.Semaphore;

public class MutexExample {
    static Semaphore semaphore = new Semaphore(1);

    static class myThreads extends Thread {
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("acquired!");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                // lock needs to be released!
            }
        }
    }

    public static void main(String[] arg) {
        myThreads t1 = new myThreads();
        t1.start();
        myThreads t2 = new myThreads();
        t2.start();
    }

}

