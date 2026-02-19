public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setGpa(3.5);

        Student student2 = new Student("Alice", "1234", 3.8);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
