class Student {
    String name;
    int roll;

    void display() {
        System.out.println(name + " " + roll);
    }
}

public class problem1 {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Ayush";
        s.roll = 10;

        s.display();
    }
}