import java.util.Scanner;

public class Lab2Classwork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task 1: Summation
        System.out.println("Enter 4 integers:");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), d = input.nextInt();
        int sum = a + b + c + d;
        System.out.println("Summation = " + sum);

        // Task 2: Product
        System.out.println("Enter 3 float numbers:");
        float f1 = input.nextFloat(), f2 = input.nextFloat(), f3 = input.nextFloat();
        float product = f1 * f2 * f3;
        System.out.println("Product = " + product);

        // Task 3: Difference
        float difference = sum - product;
        System.out.println("Difference = " + difference);

        // Task 4: Average and square
        float avg = (sum + product) / 2;
        System.out.println("Square of average = " + (avg * avg));

        // Task 5: Max, Min, Average
        System.out.println("Enter 3 scores:");
        int s1 = input.nextInt(), s2 = input.nextInt(), s3 = input.nextInt();
        int max = Math.max(s1, Math.max(s2, s3));
        int min = Math.min(s1, Math.min(s2, s3));
        double avgMinMax = (max + min) / 2.0;
        System.out.println("Average of Max and Min = " + avgMinMax);

        // Task 6: Salary calculation
        System.out.println("Enter salaries for Feb, Mar, Apr:");
        double feb = input.nextDouble(), mar = input.nextDouble(), apr = input.nextDouble();
        double maxSalary = Math.max(feb, Math.max(mar, apr));
        double minSalary = Math.min(feb, Math.min(mar, apr));
        double roundedMax = Math.round(maxSalary);
        double result = roundedMax + (minSalary / 2);
        System.out.println("Final Salary Calculation = " + result);
    }
}
