class Test {
    int x;
}

public class prblm2 {
    static void change(Test t) {
        t.x = 100;
    }

    public static void main(String[] args) {
        Test t = new Test();

        change(t);

        System.out.println(t.x);
    }
}