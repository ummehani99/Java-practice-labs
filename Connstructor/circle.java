public class circle {
    double radius;
//parametrized constructor
public circle(double radius){
    this.radius=radius;
}

public double area(){
    return Math.PI*radius*radius;

}
public double circumference(){
return 2*Math.PI*radius;
}
public void display(){
    System.out.printf("Radius: %f%nArea: %f%nCircumference: %f%n%n",radius,area(),circumference());
}
public static void main(String[] args) {
    circle c1= new circle(4.90);
    circle c2= new circle(7.0);
    circle c3= new circle(6.2);
  
     c1.display();
     
     c2.display();
    
     c3.display();
  
}
}
