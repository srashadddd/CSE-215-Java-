import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int m = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int n = scanner.nextInt();
        System.out.println("Maximum is: " + max(m, n));
        scanner.close();
    }

    public static int max(int m, int n) {
        if (m > n) {
            return m;
        } else {
            return n;
        }
    }
}
