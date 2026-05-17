public class Vehicle {
    String brand;
    int speed;
    String fuel;

    // Constructor 1 — Default
    // calls Constructor 2
    public Vehicle() {
        this("Unknown");  // Constructor 2 ko call kiya
        System.out.println("Default constructor called");
    }

    // Constructor 2 — brand only
    // calls Constructor 3
    public Vehicle(String brand) {
        this(brand, 0);  // Constructor 3 ko call kiya
        System.out.println("One-param constructor called");
    }

    // Constructor 3 — all values
    // actual values set hoti hain yahan
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.fuel  = "Petrol";
        System.out.println("Full constructor called");
    }

    public void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Fuel  : " + fuel);
    }

    public static void main(String[] args) {

        System.out.println("--- Object 1 (Default) ---");
        Vehicle v1 = new Vehicle();
        v1.display();

        System.out.println("\n--- Object 2 (Brand only) ---");
        Vehicle v2 = new Vehicle("Toyota");
        v2.display();

        System.out.println("\n--- Object 3 (Full) ---");
        Vehicle v3 = new Vehicle("toyota", 120);
        v3.display();
    }
}