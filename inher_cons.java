class A {
    A() {
        System.out.print("A ");
    }
}

class B extends A {
    B() {
        System.out.print("B ");
    }
}

public class inher_cons {
    public static void main(String[] args) {
        new B();
    }
}