import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Product product1 = new Product("snack",1000,10);
        Product product2 = new Product("ice_cream",500,10);
        Product product3 = new Product("juice",1000,1);

        Customer customer1 = new Customer("김보현");
        customer1.cash_charge(10000);
        customer1.order(product1, 5);
        customer1.order(product3, 3);
        customer1.order(product2, 10);
        
        
        
    }
}
