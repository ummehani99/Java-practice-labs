//reate a class 'Employee' with name, ID, salary, department. Add a parameterized constructor. 
//Then add a 'promote' method that increases salary by 15%. Create 2 employees, promote one, 
//and display both.//
public class employee {
    String name;
    int id;
    double salary;
    String department;
    //parametrized constructor
    public employee(String name,
    int id,
    double salary,
    String department){

          this.name= name;
    this.id = id;
    this.salary = salary;
    this.department = department;
    }
public double promote(){
     salary = salary * 1.15;  // 15% increase
    System.out.println(name + " promoted! New salary: " + salary);
    return salary;
}
public void display(){
    System.out.println("Name: "+ name);
    System.out.println("ID: "+id);
    System.out.println("Salary: "+ salary);
    System.out.println( "Department:"+department);
    System.out.printf("%n");
}
public static void main(String[] args) {
    employee e1 = new employee("Hano", 48, 100000, "software engineering");
    employee e2 = new employee("Ali",  49, 150000, "Computer Science");
    e1.display();
    e2.display();
    e1.promote();
}
}
