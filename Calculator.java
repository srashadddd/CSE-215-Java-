import java.util.Scanner;

public class Calculator {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Two integers
        System.out.print("Enter two integers (a b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(calculate(a, b));

        // Three integers
        System.out.print("Enter three integers (x y z): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(calculate(x, y, z));

        // Square or cube
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        System.out.print("Enter operator (square/cube): ");
        String op = scanner.next();
        System.out.println(calculate(num, op));

        // Two doubles with operation
        System.out.print("Enter two doubles: ");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String operation = scanner.next();
        System.out.println(calculate(d1, d2, operation));

        scanner.close();
    }

    // Sum of two integers
    static String calculate(int a, int b) {
        return "Sum of " + a + " and " + b + ": " + (a + b);
    }

    // Product of three integers
    static String calculate(int a, int b, int c) {
        return "Product of " + a + ", " + b + ", and " + c + ": " + (a * b * c);
    }

    // Square or cube of the double number to be calcuated
    static String calculate(double num, String operator) {
        if (operator.equalsIgnoreCase("square")) {
            return "Square of " + num + ": " + (num * num);
        } else if (operator.equalsIgnoreCase("cube")) {
            return "Cube of the " + num + ": " + (num * num * num);
        } else {
            return "Invalid operator";
        }
    }

    // Arithmetic operations on two doubles
    static String calculate(double a, double b, String operation) {
        if (operation.equalsIgnoreCase("add")) {
            return "Addition of " + a + " and " + b + ": " + (a + b);
        } else if (operation.equalsIgnoreCase("subtract")) {
            return "Subtraction of " + a + " and " + b + ": " + (a - b);
        } else if (operation.equalsIgnoreCase("multiply")) {
            return "Multiplication of " + a + " and " + b + ": " + (a * b);
        } else if (operation.equalsIgnoreCase("divide")) {
            if (b != 0) {
                return "Division of " + a + " by " + b + ": " + (a / b);
            } else {
                return "Division by zero is not allowed";
            }
        } else {
            return "Invalid operation";
        }
    }
}
