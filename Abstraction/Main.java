//Create an abstract class 'Animal' with abstract methods sound() and move(). Create concrete 
//classes Dog, Cat, Bird that extend it. Create an array of Animals and call each method. //
abstract class Animal{
    abstract void sound();
    abstract void move();
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog says: woof woof!");
    }
    @Override
    public void move(){
        System.out.println("Dogs run!");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat says: Meoww!");
    }
    @Override
    public void move(){
        System.out.println("Cat run!");
    }
}
class Bird extends Animal{
    @Override
    public void sound(){
        System.out.println("Birds says: tweet!");
    }
    @Override
    public void move(){
        System.out.println("Bird flies!");
    }
}
class duck extends Animal{
    public void sound(){
        System.out.println("Duck says: quack quack!");
    }
    public void move(){
        System.out.println("duck swim");
    }
}
public class Main{
//     public static void main(String[] args) {
//         Animal[] animals = new Animal[4];
//         animals[0]= new Dog();
//          animals[1]= new Cat();
//           animals[2]= new Bird();
// animals[3]= new duck();

//           animals[0].move();
//           animals[0].sound();
//           System.out.printf("%n");
//             animals[1].move();
//           animals[1].sound();
//              System.out.printf("%n");
//             animals[2].move();
//           animals[2].sound();
//            System.out.printf("%n");
//             animals[3].move();
//           animals[3].sound();
public static void main(String[] args) {
    Animal[] animals = {new Dog(), new Cat(), new Bird(), new duck()};
    for(Animal a: animals){
        a.move();
       
        a.sound();
         System.out.printf("%n");
    }
}
}
