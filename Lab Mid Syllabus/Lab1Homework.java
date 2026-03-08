import java.util.Scanner;

public class Lab1Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your points: ");
        int points = input.nextInt();

        System.out.print("Enter your balance: ");
        double balance = input.nextDouble();

        // Printing all variables in one line
        System.out.println("Name: " + name + ", Points: " + points + ", Balance: " + balance);
    }
}
