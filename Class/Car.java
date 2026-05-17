public class Car {
    String brand;
    String model;
    int year;
    double speed;
    public void displayinfo(){
        System.out.println("Information of car");
        System.out.println("Brand :"+ brand);
        System.out.println("Model :"+model);
        System.out.println("Year :"+ year);
        System.out.println("Speed :"+speed);
    }
    public double accelerate(double amount){

 speed =speed+amount;
 System.out.println("car is begin with speed: "+ speed);
 return speed;
    }
    public double brake(double amount){
speed=speed - amount;
System.out.println("Car is stoped with speed: "+ speed);
return speed;
    }
    public static void main(String[] args) {
        Car myCar = new Car();
       myCar.brand="Toyotta";
       myCar.model="Corolla";
       myCar.speed=125.00;
       myCar.year=2025;
myCar.displayinfo();
myCar.accelerate(9.11);
myCar.brake(80.00);


    }

}
