//Write a program that takes 10 integer values from the user, stores them in an array, and prints 
//them in reverse order. 
import java.util.Scanner;
public class Array_T1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
int[] integers=new int[10];
for(int i =0;i<10;i++){
    System.out.print("Enter integers: ");
    integers[i]=sc.nextInt();


}
for(int i=9;i>=0;i--){
    System.out.println("integers: "+integers[i]);
}
sc.close();
}
 }