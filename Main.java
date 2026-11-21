import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.print("아이디를 생성하시오, id:");
        Scanner sc = new Scanner(System.in);
        Customer2 customer = new Customer2(sc.nextInt());

        while(true){

    System.out.println("계좌충전:1, 계좌조회:2, 재고 주문:3, 상품주문:4, 주문 기록:5, 종료:0");
    System.out.println("선택:");
    int menu = sc.nextInt();
        
    if (menu == 0)
    {
        System.out.println("프로그램을 종료합니다.");
        break;
    }

    switch (menu) {
        case 1:
            Money2.moneyCharge(customer, sc);
            break;
        case 2:
            Money2.check_inquiry(customer);
            break;
        case 3:
            {
                System.out.println("제품 이름:");
                String name = sc.next(); // 공백 포함 이름이면 sc.nextLine() 사용
                System.out.println("제품 가격:");
                int price = sc.nextInt();
                System.out.println("제품 수량:");
                int pcs = sc.nextInt();
                Inventory_List.stockIn(name, price, pcs);
            // 재고 주문(입고) 호출
            break;
            }
        case 4:
            System.out.println("제품 이름:");
            String name = sc.next();
            System.out.println("제품 수량:");
            int pices = sc.nextInt();
            Product3 product = null;
            for (Product3 p : Inventory_List.inventory_list) 
            {
                if (p.product_name.equals(name)) 
                {
                    product = p;
                    break;
                }
            }

            if (product == null) 
            {
                System.out.println("해당 상품이 없습니다.");
            } 
            else 
            {
                Order.order(customer, product, pices);
            }                
            // 상품 주문 호출
            break;
            
        case 5:
            Inventory_List.inventory_view();
            // 주문 기록 조회
            break;
            
        default:
            System.out.println("잘못된 입력입니다.");
    }
}
    }
}
