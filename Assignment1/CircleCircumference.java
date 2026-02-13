import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        // Formula: 2 * π * r (π approximated as 3.1416)
        double circumference = 2 * 3.1416 * r;
        System.out.println("Circumference = " + circumference);

        sc.close();
    }
}
