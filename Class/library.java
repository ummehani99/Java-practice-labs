//Create a class 'Library' with book title, author, year, and isAvailable flag. Add methods: 
//checkout(), returnBook(), displayStatus(). //
public class library {
   String bookTitle;
   String author;
   int year;
   boolean isAvailable;
public void checkout(){
    if (isAvailable== true) {
        isAvailable= false;
        System.out.println("book leli");
        
    }
    else{
        System.out.println("book available nh hai");
    }


}

public void returnBook() {
    isAvailable = true;
    System.out.println("Book wapas aa gayi!");
}
public void displayStatus(){

    System.out.println("Title: " + bookTitle);
    System.out.println("Author: " + author);
    System.out.println("Year: " + year);
    if(isAvailable) {
        System.out.println("Status: Available ");
    } else {
        System.out.println("Status: Not Available ");
    }

}
public static void main(String[] args) {
    library book1 = new library();
    book1.isAvailable=true;
    book1.author="Meer taqi meer";
    book1.year=1880;
    book1.bookTitle="gham";
    book1.checkout();
    book1.displayStatus();
   
}
}

