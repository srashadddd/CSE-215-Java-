import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many numbers will be entered
        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        int pos = 0, neg = 0, zero = 0;

        // Loop exactly n times
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num > 0) pos++;
            else if (num < 0) neg++;
            else zero++;
        }

        // Display results
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zeros: " + zero);

        sc.close();
    }
}
