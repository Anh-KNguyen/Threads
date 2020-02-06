public class MyClass extends Thread {
    private String name;
    private MyObject myObj;

    public MyClass(MyObject obj, String n) {
        name = n;
        myObj = obj;
    }

    public void run() {
        myObj.foo(name);
    }

    // // difference references so both threads are able to call MyObject.foo()
    // public static void main(String[] args) {
    //     MyObject obj1 = new MyObject();
    //     MyObject obj2 = new MyObject();
    //     MyClass thread1 = new MyClass(obj1, "1");
    //     MyClass thread2 = new MyClass(obj2, "2");
    //     thread1.start();
    //     thread2.start();
    // }

    // same reference to obj, 1 can call foo and the other has to wait
    public static void main(String[] args) {
        MyObject obj = new MyObject();
        MyClass thread1 = new MyClass(obj, "1");
        MyClass thread2 = new MyClass(obj, "2");
        thread1.start();
        thread2.start();
    }
}