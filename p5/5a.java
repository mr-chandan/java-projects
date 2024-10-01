// 5a. Program to find the number of elements in an array.
import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Number of elements in the array: " + array.length);
        scanner.close();
    }
}
/* 
Sample Output:
Enter the number of elements in the array:
5
Number of elements in the array: 5
*/
