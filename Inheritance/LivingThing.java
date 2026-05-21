//Create a single inheritance hierarchy: class 'LivingThing' with breathe(), grow(). Child class 
//'Plant' that adds photosynthesize() and waterNeeded(). Test all methods
public class LivingThing {
    
    public void breathe(){
System.out.println("Breathing");
    }
    public void grow(){
       System.out.println("growing"); 
    }
}
class plant extends LivingThing{
    public void photosynthesize(){
        System.out.println("photosyntheszing....");
    }
    public void waterNeeded(){
        System.out.println("water exxential");
    }
    public static void main(String[] args) {
        plant p= new plant();
        p.breathe();
        p.grow();
        p.photosynthesize();
        p.waterNeeded();
    }
}
