import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        int result = 1;
        // Multiply x by itself n times
        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        System.out.println(x + "^" + n + " = " + result);
        sc.close();
    }
}
