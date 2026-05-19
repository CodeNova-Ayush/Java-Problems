class Employee {

    void salary() {
        System.out.println("Employee Salary: 30000");
    }
}

class Manager extends Employee {

    @Override
    void salary() {
        System.out.println("Manager Salary: 70000");
    }
}

public class employee_salary {

    public static void main(String[] args) {

        Employee e = new Manager();

        e.salary();
    }
}