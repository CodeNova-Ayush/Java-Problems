abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    int r = 5;

    @Override
    void area() {

        double result = 3.14 * r * r;

        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {

    int l = 10;
    int b = 5;

    @Override
    void area() {

        int result = l * b;

        System.out.println("Area of Rectangle: " + result);
    }
}

public class abstraction1 {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.area();

        Rectangle r = new Rectangle();
        r.area();
    }
}