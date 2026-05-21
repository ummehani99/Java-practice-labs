public class Animal{
    String name;
    int age;
    public Animal(String name, int age){
        this.name= name;
        this.age=age;
        

    }
    public void sleep()
{
    System.out.println("zzzzzz!");
}
public void  eat(){
    System.out.println("dog ka khana");
}
}
class dogs extends Animal{
    String breed;

public dogs(String name, int age,String breed){
    super(name, age);
    this.breed = breed;
}
public void bark(){
    System.out.println(name+" says woof woof");
}
public static void main(String[] args) {
    dogs d = new dogs("max", 5, "German shehpard");
   d.eat();    // parent se mila
d.sleep();  // parent se mila
d.bark(); 
}
}

