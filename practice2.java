class Student{
    String name;
    String favcricketer;
    int age;
    int salary;
    void display(){
        System.out.println(name + " " + favcricketer + " " + age + " " + salary );
    }
}

public class practice2 {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "virat";
        s.favcricketer = "sachin";
        s.age =20;
        s.salary=10000000;

        s.display();

    }
    
}
