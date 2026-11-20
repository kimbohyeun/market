import java.util.ArrayList;
import java.util.List;

class Product2 {
    static List<String> product_name = new ArrayList<>();
    static List<Integer> pcs = new ArrayList<>();
    static List<Integer> price = new ArrayList<>();

    static void add_product(String name, int count, int unitPrice) {
        if (!product_name.contains(name)) {
            product_name.add(name);
            pcs.add(count);
            price.add(unitPrice);
        } else {
            int idx = product_name.indexOf(name);
            int updatedPcs = pcs.get(idx) + count;
            pcs.set(idx, updatedPcs);
        }
    }

    static void view_product() {
        for (int i = 0; i < product_name.size(); i++) {
            System.out.println(
                product_name.get(i) + " | 재고: " + pcs.get(i) + " | 가격: " + price.get(i)
            );
        }
    }
}
