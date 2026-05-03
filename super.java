class A {
    A() {
        System.out.print("A ");
    }
}

class B extends A {
    B() {
        this(10);
        System.out.print("B ");
    }

    B(int x) {
        System.out.print(x + " ");
    }
}

public class super {
    public static void main(String[] args) {
        new B();
    }
}