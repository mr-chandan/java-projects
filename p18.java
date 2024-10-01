// 18. Java program to handle exceptions using Try and Multiple catch blocks.
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[5] = 10; // This will throw ArrayIndexOutOfBoundsException
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception caught.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught.");
        } catch (Exception e) {
            System.out.println("General Exception caught.");
        }
    }
}
/* 
Output:
Array Index Out of Bounds Exception caught.
*/
