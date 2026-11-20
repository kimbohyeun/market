import java.util.*;
import java.lang.*;
import java.io.*;

class Inventory_List {
    static List<Product3> inventory_list = new ArrayList<>();

    static void stockIn(String name, int price, int pcs) {
        // 1. 기존에 같은 이름의 상품이 있는지 찾기
        for (Product3 product : inventory_list) {
            if (product.product_name.equals(name)) {
                // 2-A. 있으면 새로 add 하지 않고 수량만 변경
                product.pcs += pcs;
                return;
            }
        }

        // 2-B. 없으면 새 객체 생성 후 리스트에 추가
        Product3 newProduct = new Product3(name, price, pcs);
        inventory_list.add(newProduct);
    }

    static void inventory_view() {
        for (Product3 product : inventory_list) {
            System.out.println(
                product.product_name + " | 가격: " + product.price + " | 재고: " + product.pcs
            );
        }
    }
}
