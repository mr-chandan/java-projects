// 22. Program to create a class extending Thread to print numbers from 1 to 10 in a separate thread.
class PrintNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class PrintThread {
    public static void main(String[] args) {
        PrintNumbers thread = new PrintNumbers();
        thread.start();
    }
}
/* 
Output:
1
2
3
4
5
6
7
8
9
10
*/
