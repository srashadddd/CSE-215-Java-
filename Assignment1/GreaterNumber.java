import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Use if-else loop
        if (a > b) {
            System.out.println("Greater number: " + a);
        } else {
            System.out.println("Greater number: " + b);
        }

        sc.close();
    }
}
