interface drawable{
    void draw();
    void resize(double f);
    


}
class Square implements drawable{
public void draw(){
    System.out.println("Drawing square!");
}
public void resize(double f){
    System.out.println("Factor"+f);
}
public static void main(String[] args) {
    drawable d1 = new drawable() 
        d1.Square();
    
}
}