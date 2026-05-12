import java.util.Scanner;

class Employee {

    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
        }

        else {
            System.out.println("Invalid Salary");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);

        System.out.println("\nEmployee Details");

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        sc.close();
    }
}