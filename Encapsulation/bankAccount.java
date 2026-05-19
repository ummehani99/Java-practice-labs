public class bankAccount{
 int accountNumber;
 String ownerName;
 double balance;
 

  public String getownerName()  { 
    return ownerName; } 
    public int    getaccountNumber(){ 
        return accountNumber; } 
    public double getbalance()  { 
        return balance; 
    }

public void setownerName(String ownerName){
    this.ownerName=ownerName;
}
public void setbalance(double balance){
    if (balance<=0.00) {
        System.out.println("balancemust be non-negative");
        
    }
    else{
        this.balance= balance;
    }
}
public void setaccountNumber(int accountNumber){
    this.accountNumber=accountNumber;
}
public static void main(String[] args) {
    bankAccount b1= new bankAccount();
    b1.accountNumber=9870;
    b1.balance=90000.00;
    b1.ownerName="ANABIA FAHEEM";
System.out.printf("name: %s%nAccount no: %d%nBalance: %f%n%n",b1.getownerName(),b1.getaccountNumber(),b1.getbalance());
     bankAccount b2= new bankAccount();
    b2.accountNumber=9871;
    b2.balance=70000.00;
    b2.ownerName="ARSALAN IMRAN";
System.out.printf("Name: %s%nAccount no: %d%nBalance: %f%n",b2.getownerName(),b2.getaccountNumber(),b2.getbalance());
}

}
