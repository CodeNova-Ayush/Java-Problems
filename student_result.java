class Student {

    private int id;
    private String name;
    private int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    void result() {

        if (marks >= 35) {
            System.out.println("Pass");
        }

        else {
            System.out.println("Fail");
        }
    }
}

public class student_result {

    public static void main(String[] args) {

        Student s = new Student(101, "John", 78);

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());

        s.result();
    }
}