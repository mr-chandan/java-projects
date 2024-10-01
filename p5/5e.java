// 5e. Program to count the number of occurrences of an element in an array.
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 2, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the element to count occurrences:");
        int key = scanner.nextInt();
        int count = 0;

        for (int num : array) {
            if (num == key) {
                count++;
            }
        }

        System.out.println(key + " occurs " + count + " times in the array.");
        scanner.close();
    }
}
/* 
Sample Output:
Enter the element to count occurrences:
2
2 occurs 3 times in the array.
*/
