// 25. Java program to create an ArrayList of integers, add five elements, sort, and display the elements.
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(30);

        System.out.println("Original list: " + list);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}
/* 
Output:
Original list: [50, 10, 40, 20, 30]
Sorted list: [10, 20, 30, 40, 50]
*/
