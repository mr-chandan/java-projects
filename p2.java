// 2. Write a java program to read a matrix and find the largest and smallest value in the matrix and interchange their positions.
import java.util.Scanner;

public class MatrixMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minRow = 0, minCol = 0, maxRow = 0, maxCol = 0;

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minRow = i;
                    minCol = j;
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Swap max and min
        int temp = matrix[minRow][minCol];
        matrix[minRow][minCol] = matrix[maxRow][maxCol];
        matrix[maxRow][maxCol] = temp;

        System.out.println("Matrix after swapping largest and smallest elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
/* 
Sample Output:
Enter the number of rows and columns:
2 2
Enter the matrix elements:
1 3
2 4
Matrix after swapping largest and smallest elements:
4 3
2 1
*/
