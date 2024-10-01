// 4c. Program to create and use string class methods.
public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("Substring from index 5 to 11: " + str.substring(5, 11));
        System.out.println("Does string contain 'Programming'? " + str.contains("Programming"));
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());
    }
}
/* 
Output:
Length of the string: 16
Character at index 5: P
Substring from index 5 to 11: Progra
Does string contain 'Programming'? true
String in uppercase: JAVA PROGRAMMING
String in lowercase: java programming
*/
