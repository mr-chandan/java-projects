// 23. Program to create two threads: one for even numbers, one for odd numbers.
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}
/* 
Output:
Even: 2
Odd: 1
Even: 4
Odd: 3
Even: 6
Odd: 5
...
*/
