class Lab5Classwork {
    // Overloaded calculate methods
    static int calculate(int a, int b) { return a + b; }
    static int calculate(int a, int b, int c) { return a * b * c; }
    static double calculate(double num, String operator) {
        if (operator.equals("square")) return num * num;
        else if (operator.equals("cube")) return num * num * num;
        else return -1;
    }
    static double calculate(double a, double b, String op) {
        switch (op) {
            case "add": return a + b;
            case "subtract": return a - b;
            case "multiply": return a * b;
            case "divide": return a / b;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + calculate(5, 10));
        System.out.println("Product: " + calculate(2, 3, 4));
        System.out.println("Square: " + calculate(3.0, "square"));
        System.out.println("Addition: " + calculate(4.5, 2.5, "add"));
    }
}
