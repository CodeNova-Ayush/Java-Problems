class Vehicle {

    String brand = "Toyota";

    void showVehicle() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {

    String model = "Fortuner";

    void showCar() {
        System.out.println("Car Model: " + model);
    }
}

public class inheritance {

    public static void main(String[] args) {

        Car c = new Car();

        c.showVehicle();
        c.showCar();
    }
}