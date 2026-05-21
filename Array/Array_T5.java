public class Array_T5 {
//     Create a 3×3 2D array representing a marks sheet for 3 students and 3 subjects. Calculate and 
// display each student's total and averag
public static void main(String[] args) {
    


int[][] marks = {
    {85, 90, 78},  // Student 1
    {70, 65, 80},  // Student 2
    {90, 95, 88}   // Student 3
};
for(int i =0;i<3;i++){
    int total=0;
    for(int j =0;j<3;j++){
        total+=marks[i][j];
    }
    double average=total/3.0;
  System.out.println("Student " + (i+1) + " Total  : " + total);
    System.out.println("Student " + (i+1) + " Average: " + average);
    System.out.println();
}

}
}