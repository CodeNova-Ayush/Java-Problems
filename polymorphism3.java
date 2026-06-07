class Animal {

    static void type() {
        System.out.println("This is an Animal");
    }
}

class Dog extends Animal {

    static void type() {
        System.out.println("This is a Dog");
    }
}

public class polymorphism3 {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.type();

        Dog d = new Dog();

        d.type();
        System.out.println("hello namaste duniya");
    }
}