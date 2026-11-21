import java.util.ArrayList;
import java.util.List;

class Order_Record {
    Product3 product;
    int pcs;
    int unitPrice;  // 주문 당시 개당 가격
    int totalPrice; // 당시 총 결제 금액

    Order_Record(Product3 product, int pcs) {
        this.product = product;
        this.pcs = pcs;
        unitPrice = product.price;
        this.totalPrice = unitPrice * pcs;
    }
}
