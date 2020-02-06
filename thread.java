// Creating threads in two ways:
//   - Implementing runnable interface
//   - Extending the thread class


// Implementing the runnable interface saves overheads of inheriting the thread class
// Also beneficial since java doesn't support multiple inheritance, we are only implementing an interface instead
class RunnableThreadExample implements Runnable { //an object from this interface is a Runnable object
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String args[]) {
        RunnableThreadExample instance = new RunnableThreadExample();
        Thread thread = new Thread(instance); //thread object has a Runnable object that implements run() menthod
        thread.start();
    }
}

// Thread example by extending the thread class
class ThreadExample extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        ThreadExample instance = new ThreadExample();
        instance.start(); //start() on the instance of the class itself
    }

}

