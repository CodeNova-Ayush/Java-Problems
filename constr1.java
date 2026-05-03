class A {
    A() {
        this(10);
        System.out.print("A ");
    }

    A(int x) {
        System.out.print(x + " ");
    }
}

public class constr1 {
    public static void main(String[] args) {
        new A();
    }
}