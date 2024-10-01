// 5c. Program to remove duplicate elements from an array.
import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
/* 
Output:
Array after removing duplicates: [1, 2, 3, 4, 5]
*/
