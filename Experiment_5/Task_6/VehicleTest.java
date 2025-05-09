class Vehicle {
    protected String brand, model;
    protected double price;

    // Constructor
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    protected int seatingCapacity;
    protected String fuelType;

    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}

// ElectricCar extending Car
class ElectricCar extends Car {
    private double batteryCapacity;
    private int chargingTime;

    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, double batteryCapacity, int chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hrs");
    }
}

// Motorcycle extending Vehicle
class Motorcycle extends Vehicle {
    private int engineCapacity;
    private String type;

    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + "cc, Type: " + type);
    }
}

// Test program
public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        ElectricCar eCar = new ElectricCar("Tesla", "Model S", 80000, 5, "Electric", 100, 2);
        Motorcycle bike = new Motorcycle("Yamaha", "MT-07", 9000, 689, "Sport");

        car.displayDetails();
        System.out.println();
        eCar.displayDetails();
        System.out.println();
        bike.displayDetails();
    }
}
