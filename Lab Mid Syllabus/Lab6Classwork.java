import java.util.Scanner;
import java.util.Arrays;

public class Lab6Classwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Average of 10 integers
        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Average = " + (sum / 10.0));

        // Task 2: 4x4 matrix sum of rows, cols, diagonals
        int[][] matrix = {
            {4,2,7,6},
            {3,7,9,-5},
            {2,12,3,2},
            {-1,4,-3,9}
        };

        // Row sums
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) rowSum += matrix[i][j];
            System.out.println("Row " + i + " sum = " + rowSum);
        }

        // Column sums
        for (int j = 0; j < 4; j++) {
            int colSum = 0;
            for (int i = 0; i < 4; i++) colSum += matrix[i][j];
            System.out.println("Column " + j + " sum = " + colSum);
        }

        // Diagonals
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < 4; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][3 - i];
        }
        System.out.println("Main diagonal sum = " + diag1);
        System.out.println("Other diagonal sum = " + diag2);
    }
}
