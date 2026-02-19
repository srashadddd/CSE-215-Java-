public class Student {
    
    private String name;
    private String id;
    private double gpa;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.id = "0000";
        this.gpa = 0.0;
    }

    // Parameterized constructor
    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student CGPA: " + gpa);
        System.out.println();
    }
}
