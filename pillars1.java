abstract class Employee {

    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    abstract void calculateSalary();
}

class Manager extends Employee {

    Manager(int id, String name) {
        super(id, name);
    }

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary = 80000");
    }
}

class Developer extends Employee {

    Developer(int id, String name) {
        super(id, name);
    }

    @Override
    void calculateSalary() {
        System.out.println("Developer Salary = 50000");
    }
}

public class pillars1 {

    public static void main(String[] args) {

        Employee e;

        e = new Manager(101, "John");

        System.out.println(e.getId());
        System.out.println(e.getName());

        e.calculateSalary();

        e = new Developer(102, "Alice");

        System.out.println(e.getId());
        System.out.println(e.getName());

        e.calculateSalary();
    }
}