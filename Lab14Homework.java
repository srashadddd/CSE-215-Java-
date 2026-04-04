import java.util.Scanner;

public class Lab14Homework {
    public static void main(String[] args) {
        methodOne();
        methodTwo();
        methodThree();
    }

    public static void methodOne() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0, maxSq = 0, count = 0;
        while (count < 5) {
            try {
                System.out.print("Enter even: ");
                int n = sc.nextInt();
                if (n % 2 != 0) throw new Exception("Even integers only");
                arr[count] = n;
                sum += n;
                if (n * n > maxSq) maxSq = n * n;
                count++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        System.out.println("Sum: " + sum + " Max Square: " + maxSq);
    }

    public static void methodTwo() {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[10];
        int count = 0;
        String check = "aeiouAEIOU";
        while (count < 10) {
            try {
                System.out.print("Enter vowel: ");
                char c = sc.next().charAt(0);
                if (check.indexOf(c) == -1) throw new Exception("Vowels Only");
                v[count] = c;
                count++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for (char val : v) System.out.print(val + " ");
        System.out.println();
    }

    public static void methodThree() {
        int[] arr = new int[20];
        try {
            int x = arr[24];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is an array of size 20!");
        }
    }
}
