import java.util.*;
import java.lang.*;
import java.io.*;

class Customer{
    String id;
    int cash;
    Customer(String id){
        this.id = id;
    }

    void order(Product product, int num) {
    int totalPrice = product.product_price * num;

    if (product.product_stock >= num && totalPrice <= cash) {
        product.product_stock -= num;
        cash -= totalPrice;
        System.out.println(product.product_name + " " + num + "개 주문 완료했습니다. (남은 잔액: " + cash + "원)");
    } else {
        System.out.println("재고 또는 돈이 부족하여 상품주문이 불가합니다.");
    }
}

    void cash_charge(int charging_money){
        cash+= charging_money;
    }

    
}
