class Employee {
    private String name;
    private double salary;

    Employee() { name = "Unknown"; salary = 0.0; }
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public void setName(String n) { name = n; }
    public double getSalary() { return salary; }
    public void setSalary(double s) { salary = s; }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public double calculateBonus(double bonus) {
        return salary * bonus;
    }
}

class Manager extends Employee {
    private String department;
    private int employeeCount;

    Manager() { super(); department = "Unknown"; employeeCount = 0; }
    Manager(String name, double salary, String dept, int empCount) {
        super(name, salary);
        this.department = dept;
        this.employeeCount = empCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Employee Count: " + employeeCount);
    }

    @Override
    public double calculateBonus(double bonus) {
        return super.calculateBonus(bonus) + (500 * employeeCount);
    }
}

public class Lab10Classwork {
    public static void main(String[] args) {
        Employee e = new Employee("John", 5000);
        Manager m = new Manager("Alice", 8000, "IT", 5);

        e.displayInfo();
        System.out.println("Employee Bonus: " + e.calculateBonus(0.1));

        System.out.println();
        
        m.displayInfo();
        System.out.println("Manager Bonus: " + m.calculateBonus(0.1));
    }
}
