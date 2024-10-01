// 4d. Program to develop a palindrome checker application using JAVA String.
import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        StringBuilder reverseStr = new StringBuilder(str).reverse();
        return str.equals(reverseStr.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
}
/* 
Sample Output:
Enter a string to check if it's a palindrome:
madam
madam is a palindrome.
*/
