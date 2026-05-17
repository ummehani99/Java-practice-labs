

public class rectangle {
    double length;
    double width;
    double calculate;
    public double area(double length,double width){
       calculate= length*width;
        System.out.println("Area of rectangle: "+ calculate);
        return calculate;

    }
    public double parimeter(double length,double width){
        calculate=2*(length+width);
        System.out.println("Perimeter of rectangle: "+calculate);
        return calculate;
    }
   public boolean isSquare(double length, double width) {
    if(length == width) {
        return true;
    } else {
        return false;
    }
}
    
    public static void main(String[] args) {
        rectangle newRectangle= new rectangle();
        newRectangle.area(98.00,87.00);
        newRectangle.parimeter(4.2, 9.08);
      System.out.println("isSquare: "+newRectangle.isSquare(9.0,9.0));
    }
}
