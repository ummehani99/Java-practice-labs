 // Write overloaded methods named area() that calculate: area of a circle (1 param: radius), area 
//of a rectangle (2 params: length, width), area of a triangle (2 params: base, height) //
public class Calculation {
    public double area(double radius){
return Math.PI*radius*radius;
    }
    public int area(int length, int width){
        return length*width;
    }
    public double area(double base, double height){
        return (base*height)/2;
    }
    
    public static void main(String[] args) {
        Calculation calculate = new Calculation();
        System.out.println("Area of a circle =" +calculate.area(9));
        System.out.println("Area of Rectangle ="+ calculate.area(2,3));
        System.out.println("Area of a triangle ="+ calculate.area(8.0,9.0));

    }
}
