/*Create a class 'Employee' with name, employeeID, hourlyRate, hoursWorked. Add a method 
calculateSalary() that also deducts 5% tax if salary > 50000. */
public class employee{
    int empid;
    double hourlyRate;
    double hoursWorked;
    double Salary;
    public double calculateSalary(){
        Salary= hourlyRate*hoursWorked;
        if (Salary>50000) {
            double tax = Salary * 0.05;       // 5%
    double netSalary = Salary - tax;
    System.out.println("Tax: " + tax);
    System.out.println("Net Salary: " + netSalary);
    return netSalary;
        }else{
          double netSalary= Salary;
          System.out.println("Net Salary: " + netSalary);
          return netSalary;

        }

    }
    public static void main(String[] args) {
        employee emp1 = new employee();
        emp1.empid=1;
        emp1.hourlyRate=800;
        emp1.hoursWorked=90;
        emp1.calculateSalary();

    }
}