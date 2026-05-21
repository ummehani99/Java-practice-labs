import java.util.Scanner;
public class Array_T2 {
//    //Write a program that finds the minimum, maximum, sum, and average of an array of 7 numbers 
// entered by the user 
public static void main(String[] args) {
    int[] number = new int[7];
Scanner sc= new Scanner(System.in);
for(int i= 0;i<7;i++){
number[i]=sc.nextInt();

}
//for average
int sum=0;
int max =number[0];
int min=number[0];
for(int n : number){
sum+=n;
if (n>max) {
   max=n; 
}
if (n<min) {
    min=n;
}

}
double average = (double) sum / 7;
System.out.printf("sum: %d%nMax: %d%nMin: %d%nAverage: %f%n",sum,max,min,average);
  sc.close();
}
}
