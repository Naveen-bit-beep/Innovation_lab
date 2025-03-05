public class Vehicle {
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

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Swift", "Mini cooper", 2023);
        vehicle.start();  // Calls the start method
    }
}
