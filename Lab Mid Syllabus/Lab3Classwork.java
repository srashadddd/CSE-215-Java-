import java.util.Scanner;

public class Lab3Classwork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task 1: Check if name starts with uppercase vowel
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        char firstChar = name.charAt(0);

        if ("AEIOU".indexOf(firstChar) != -1) {
            System.out.println("My name starts with a vowel");
        } else {
            System.out.println("My name starts with a consonant");
        }

        // Task 2: Summation using while loop
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int sum = 0, i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Summation from 0 to " + n + " = " + sum);
    }
}
