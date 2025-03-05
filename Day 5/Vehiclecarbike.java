class VehicleCarBike{
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The " + year + " " + make + " " + model + " is starting.");
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    public void start() {
        System.out.println("The car " + super.year + " " + super.make + " " + super.model + " starts with a roar!");
    }
}


class Bike extends Vehicle {
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }


    public void start() {
        System.out.println("The bike " + super.year + " " + super.make + " " + super.model + " starts with a smooth purr!");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2022);
        Vehicle bike = new Bike("Honda", "CBR500R", 2023);

        car.start();  
        bike.start();     
}
}
