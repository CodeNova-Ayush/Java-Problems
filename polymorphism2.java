class Parent {

    static void display() {
        System.out.println("Static method of Parent");
    }
}

class Child extends Parent {

    static void display() {
        System.out.println("Static method of Child");
    }
}

public class polymorphism2 {

    public static void main(String[] args) {

        Parent p = new Child();

        p.display();
    }
}