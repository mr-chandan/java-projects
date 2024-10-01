// 21. Program to create multiple threads by implementing an interface.
class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        t.start();
    }
}
/* 
Output:
Thread is running.
*/
