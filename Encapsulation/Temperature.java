//Create a class 'Temperature' with a private field celsius. Add a setter that validates temperature 
//> -273.15 (absolute zero). Add getters that return: getCelsius(), getFahrenheit(), getKelvin().
public class Temperature {
    private double Celsius;
    public double getCelsius(){
        return Celsius;
    }
    public void setCelsius(double Celsius){
        if (Celsius<-273.15) {
            throw new IllegalArgumentException(
            "Error: Temperature cannot be below absolute zero (-273.15)!"
        );
            
        }
        else{
            this.Celsius=Celsius;
        }
    }
        public double getFahrenheit(){
            return (Celsius * 9.0/5.0) + 32;
        }
        public double getKelvin() {
    return Celsius + 273.15;
}


    
    public static void main(String[] args) {
        Temperature T1 = new Temperature();
        Temperature T2= new Temperature();
        T1.setCelsius(45.90);
        T2.setCelsius(-300.00);
        System.out.println("Celsius degree: "+T1.getCelsius());
        System.out.println("Fahrenhiet: "+T1.getFahrenheit());
           System.out.println("Fahrenhiet: "+T1.getKelvin());

            System.out.println("Celsius degree: "+T2.getCelsius());
        System.out.println("Fahrenhiet: "+T2.getFahrenheit());
           System.out.println("Fahrenhiet: "+T2.getKelvin());
    }
    
}

