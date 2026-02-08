import java.util.Scanner;

public class GradeEvaluator {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student score: ");
        int score = scanner.nextInt();
        System.out.println("Result: " + getGrade(score));
        scanner.close();
    }

    public static String getGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "Grade A";
        } else if (score >= 80) {
            return "Grade B";
        } else if (score >= 70) {
            return "Grade C";
        } else if (score >= 60) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }
}
