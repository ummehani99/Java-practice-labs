public class Calculator{
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 parameters= "+calc.add(3, 7));
        System.out.println("3 parameters= "+calc.add(5,7,1));
    }
}