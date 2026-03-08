class Lab5Homework {
    // Overloaded convert methods
    static String convert(int num) { return Integer.toBinaryString(num); }
    static int convert(double num) { return (int)Math.round(num); }
    static int convert(char c) { return (int)c; }

    public static void main(String[] args) {
        System.out.println("Binary of 10: " + convert(10));
        System.out.println("Rounded value of 12.7: " + convert(12.7));
        System.out.println("ASCII of 'A': " + convert('A'));
    }
}
