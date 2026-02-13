import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calculate average using simple arithmetic
        double avg = (a + b + c) / 3.0;
        System.out.println("Average = " + avg);

        sc.close();
    }
}
