
class Order {
    static void order(Customer2 customer, Product3 product, int pices) {
        int totalPrice = product.price * pices;

        if (product.pcs >= pices && totalPrice <= customer.cash) {
            product.pcs -= pices;
            customer.cash -= totalPrice;
            System.out.println("주문 완료! (" + product.product_name + " " + pices + "개)");
            customer.order_record.add(new Order_Record(product,pices));
            
        } 
        else if (product.pcs < pices && totalPrice <= customer.cash) {
            System.out.println("재고가 부족합니다. 현재 재고: " + product.pcs);
        } 
        else if (totalPrice > customer.cash && product.pcs >= pices) {
            System.out.print("잔액이 부족합니다. ");
            Money2.check_inquiry(customer);
        } 
        else {
            System.out.println("재고와 잔액이 부족합니다. 현재 재고: " + product.pcs);
            Money2.check_inquiry(customer);
        }
    }
}
