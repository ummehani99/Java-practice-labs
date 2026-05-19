//Create a class 'Password' with a private String password. Write a setter that only accepts 
//passwords with 8+ characters. Write a method checkPassword(String input) that returns 
//true/false without exposing the actual password. 
public class Password {
    private String password;

    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
    if(password.length() < 8) {
 System.out.println("Error: Password must be 8+ characters");
} else {
    this.password = password;
}
}
public boolean checkPassword(String input) {
    return input.equals(password);
}
public static void main(String[] args) {
     Password p = new Password();

    p.setpassword("hi");        // ❌ too short
    p.setpassword("hani12345");  // ✅ valid

    System.out.println(p.checkPassword("hani12345")); // true
    System.out.println(p.checkPassword("wrong09878"));    // false
    System.out.println(p.checkPassword("hi"));
}
}


