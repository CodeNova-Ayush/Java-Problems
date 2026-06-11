class Person {

    String name = "John";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    int rollNo = 101;

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
    }
}

public class pract22 {

    public static void main(String[] args) {

        Student s = new Student();

        s.displayPerson();
        s.displayStudent();
    }
}