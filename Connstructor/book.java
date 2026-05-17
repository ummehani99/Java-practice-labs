//Create a class 'Book' with title, author, pages, price. Write all three constructor types (default, 
 //parameterized, copy). Create one object of each type and display their data//
 public class book{
    String title;
    String author;
    int pages;
    double price;
    //default constructor
 public book(){
title="Unknown";
author="Unknown";
pages=9;
price=0.00;
System.out.println("Book created with default values");
 }

 // parametrized cinstructor
public book(String t, String a, int pa, double p){
   title=t;
   author=a;
   pages=pa;
price=p;

}
// copy constructor
public book(book other) {
        title = other.title;
        author = other.author;
        pages = other.pages;
        price = other.price;
    }
public void display(){
   System.out.printf("Title= %s %nAuthor= %s %nPages= %d %nPrice=%f %n%n",title,author,pages,price);
}
public static void main(String[] args) {
   book b1= new book();
   book b2= new book("GHAM","Meer",102,200.00);
   book b3= new book(b2);
   b1.display();
    b2.display();
    b3.display();
}

}