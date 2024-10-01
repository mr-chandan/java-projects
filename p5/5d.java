// 5d. Program to search a key element in an array.
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the element to search:");
        int key = scanner.nextInt();
        boolean found = false;

        for (int num : array) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(key + " is found in the array.");
        } else {
            System.out.println(key + " is not found in the array.");
        }
        scanner.close();
    }
}
/* 
Sample Output:
Enter the element to search:
30
30 is found in the array.
*/
