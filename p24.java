// 24. Explain yield() and sleep() method in Thread class and simulate delay using sleep().
class SleepExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
                System.out.println("Running thread " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        t1.start();
    }
}
/* 
Output:
Running thread 1
Running thread 2
Running thread 3
Running thread 4
Running thread 5
*/
