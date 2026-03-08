class Student {
    String name;
    String id;
    double gpa;

    Student() { name = "Unknown"; id = "0000"; gpa = 0.0; }
    Student(String name, String id, double gpa) {
        this.name = name; this.id = id; this.gpa = gpa;
    }

    void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student CGPA: " + gpa);
    }
}

public class Lab7Classwork {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", "1234", 3.8);

        s1.gpa = 3.5; // update GPA
        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();
    }
}
