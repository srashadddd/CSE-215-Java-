import java.util.Scanner;

public class PositiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            try {
                System.out.print("Enter positive integer: ");
                int num = sc.nextInt();
                if (num < 0) {
                    throw new Exception("Input positive integer only");
                }
                sum += num;
                count++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        System.out.println("Total Sum: " + sum);
    }
}
