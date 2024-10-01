// 5b. Program to find the 2nd largest and smallest element in an array.
import java.util.Arrays;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        Arrays.sort(array);

        int secondSmallest = array[1];
        int secondLargest = array[array.length - 2];

        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Second largest element: " + secondLargest);
    }
}
/* 
Output:
Second smallest element: 1
Second largest element: 34
*/
