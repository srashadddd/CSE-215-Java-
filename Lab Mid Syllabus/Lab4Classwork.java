// Lab 4 Classwork: Grade calculation and max method
public class Lab4Classwork {
    // Task 1: Method to return grade based on score
    public static String getGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    // Task 2: Recreate max method without Math class
    public static int max(int m, int n) {
        if (m > n) return m;
        else return n;
    }

    public static void main(String[] args) {
        System.out.println("Grade for 85: " + getGrade(85));
        System.out.println("Max of 10 and 20: " + max(10, 20));
    }
}
