/*Create a class 'Student' with attributes: name, rollNo, marks[3] (for 3 subjects). Add methods: 
total(), average(), displayGrade(). Create objects for 3 students. */
public class student {
    String name;
    int rollno;
    int[] subjects = new int[3];
    double total;
    double average;
    public double total(){
        total = subjects[0]+subjects[1]+subjects[2];
        System.out.println("Total marks"+total);
        return total;
    }
public double average(){
    average=total/3;
     System.out.println("Total average"+average);
        return average;
}
public void displayGrade(){
    String grade;
        if(average >= 90) {
            grade = "A+";
        } else if(average >= 80) {
            grade = "A";
        } else if(average >= 70) {
            grade = "B";
        } else if(average >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }
    System.out.println("--Student Grade--");
    System.out.println("Name: "+name);
    System.out.println("Roll no/Id: "+rollno);
    System.out.println("Total: "+total);
    System.out.println("Average: "+average);
    System.out.println("Grade: "+ grade);
}
public static void main(String[] args) {
    student s1 = new student();
    s1.name="Hani";
    s1.rollno=48;
    s1.subjects[0]=92;
    s1.subjects[1]=89;
    s1.subjects[2]=67;
    s1.total();
    s1.average();
s1.displayGrade();
student s2 = new student();
    s2.name="Mubarik";
    s2.rollno=49;
    s2.subjects[0]=52;
    s2.subjects[1]=59;
    s2.subjects[2]=77;
    
s2.total();
    s2.average();
    s2.displayGrade();
    student s3 = new student();
    s3.name="Namira";
    s3.rollno=50;
    s3.subjects[0]=84;
    s3.subjects[1]=82;
    s3.subjects[2]=91;
     s3.total();
    s3.average();
    s3.displayGrade();
   
}

    }


