//Create a class 'Inventory' with productName, quantity (private), price (private). Validate: 
//quantity >= 0, price > 0. Add methods restock(int qty), sell(int qty) with appropriate validation.
public class Inventory {
    private String productName;
    private int qty;
    private double price;

    public String getproductName(){
        return productName;
    }
    public double getprice(){
return price;
    }
    public int getQty() {
    return qty;
}
public void setproductName(String productName){
    this.productName=productName;

}
public void setQty(int qty) {
    if (qty<0) {
        System.out.println("error!");
        
    }
    else{
    this.qty = qty;
    }
  
    }

public void setPrice(double price) {
    if (price<=0) {
       System.out.println("error!"); 
        
    }
    else{
 this.price = price;
    }
   
}
//methods
public void restock(int qty) {
    this.qty = this.qty + qty;
    System.out.println("Restocked!") ;
}
public void sell(int qty) {
    if (qty > this.qty) {
        System.out.println("no stock!");
    } 
    else{
    this.qty = this.qty - qty;
    } 
}
public static void main(String[] args) {
    Inventory i= new Inventory();
    i.setproductName("Pen");
    i.setQty(50);
    i.setPrice(10.0);
    
    i.sell(30);
    
    System.out.println("Product : " + i.getproductName());
    System.out.println("Quantity: " + i.getQty());
    System.out.println("Price   : " + i.getprice());
    i.restock(20);
    System.out.println("After restock: " + i.getQty()); 
     i.sell(30);
    System.out.println("After sell: " + i.getQty()); 

}

}
