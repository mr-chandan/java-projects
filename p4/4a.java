// 4a. Program to remove all adjacent duplicates from a string.
import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbaca";
        System.out.println("Original String: " + input);
        System.out.println("After removing duplicates: " + removeDuplicates(input));
    }
}
/* 
Output:
Original String: abbaca
After removing duplicates: ca
*/
