// 4b. Program to reverse each word in a string.
public class ReverseEachWord {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            result.append(reverseWord.reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Original String: " + input);
        System.out.println("Reversed Words String: " + reverseWords(input));
    }
}
/* 
Output:
Original String: Hello World
Reversed Words String: olleH dlroW
*/
