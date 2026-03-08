public class Lab4Homework {
    // Task 1: Sum of squares
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    // Task 2: Factorial using while loop
    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    // Task 3: Sum of digits using do-while
    public static int sumOfDigits(int num) {
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);
        return sum;
    }

    // Task 4: Prime check using while loop
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Sum of squares up to 5: " + sumOfSquares(5));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Sum of digits of 1234: " + sumOfDigits(1234));
        System.out.println("Is 17 prime? " + isPrime(17));
    }
}
