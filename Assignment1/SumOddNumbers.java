import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // check if odd
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers = " + sum);
        sc.close();
    }
}
