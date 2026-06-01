abstract class Car {
    void start() {
    }

    void stop() {
    }
    abstract void accelerate();
    abstract void drive();
    abstract void combustion();
}

class Maruti800 extends Car {
    void accelerate() {
        System.out.println("Maruti800 accelerates slowly");
    }

    void drive() {
        System.out.println("Driving Mar");
    }

    void combustion() {
        System.out.println("racing");
    }
}
class Innova extends Car {
    void accelerate() {
        System.out.println("Innova accelerates");
    }

    void drive() {
        System.out.println("Driving Innova");
    }

    void combustion() {
        System.out.println("hit and kill gamemode ");
    }
}

class Ferrari extends Car {

    void accelerate() {
        System.out.println("Ferrari accelerates");
    }

    void drive() {
        System.out.println("Driving ferrari");
    }

    void combustion() {
        System.out.println("Write 300 Lines of essay");
    }
}

public class Main {

    static void permit(Car rf) {

        rf.start();
        rf.accelerate();
        rf.drive();
        rf.combustion();
        rf.stop();

        System.out.println("car collection");
    }

    public static void main(String[] args) {

        Car c1 = new Maruti800();
        Car c2 = new Innova();
        Car c3 = new Ferrari();

        permit(c1);
        permit(c2);
        permit(c3);
    }
}