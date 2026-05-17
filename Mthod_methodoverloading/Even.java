 public class Even{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Even newEven = new Even();
        System.out.println(newEven.isEven(4));
        System.out.println(newEven.isEven(8));
        System.out.println(newEven.isEven(5));
        System.out.println(newEven.isEven(0));
        System.out.println(newEven.isEven(9));
    }
 }