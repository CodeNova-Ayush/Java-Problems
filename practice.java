class student{
    String name;
    int age;

    void display(){
        System.out.println(name + " "+ age);
    }
}
public class practice{
    public static void main(String[] args){
        student s = new student();
        s.name = "Ayush";
        s.age = 20;

        s.display();

    }
}