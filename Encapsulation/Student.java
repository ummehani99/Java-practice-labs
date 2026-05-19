//Create a class 'Student' with all private fields. Add validation in setters: CGPA (0-4), age (15
//30), marks (0-100). Try to set invalid values and confirm error messages appear
public class Student {
  private String Name;
  private int Rollno;
  private double Cgpa;
  private int Age;
  private int Marks;  
   public String getName(){
    return Name;
  }
  public int getRollno(){
    return Rollno;
  }
   public double getCgpa(){
    return Cgpa;
  }
   public int getAge(){
    return Age;
  }
   public int getMarks(){
    return Marks;
  }
  public void setCgpa(double Cgpa){
    if (Cgpa<0.00||Cgpa>4.00) {
        System.out.println("CGPA must be between (0-4)");
        
    }
    else{
        this.Cgpa=Cgpa;
    }

}
  public void setAge(int Age){
    if (Age < 15 && Age > 30) {
        System.out.println("Age must be between (15-30)");
        
    }
    else{
        this.Age=Age;
    }
}

 public void setMarks(int Marks){
    if (Marks < 0 && Marks > 100) {
        System.out.println("Marks must be between (0-100)");
        
    }
    else{
        this.Marks=Marks;
    }
 }
public static void main(String[] args) {
    Student s1= new Student();
    s1.Name="Hani";
    s1.Cgpa=3.74;
    s1.Age=19;
    s1.Marks=89;
    s1.Rollno=48;
    System.out.printf("Name: %s%nRollno/ID: %d%nAge: %d%nCgpa: %f%nMarks: %d%n%n",s1.getName(),s1.getRollno(),s1.getAge(),s1.getCgpa(),s1.getMarks());
}
  

}

