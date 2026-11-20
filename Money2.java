import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class money{

    static void moneyCharge(Customer customer, Scanner sc) {
        System.out.println(customer.id + "님 얼마를 충전하시겠습니까?");
        int num = sc.nextInt();

        customer.cash += num; // 대상 객체의 잔액을 직접 변경
        System.out.println(num + "원 충전되었습니다. (현재 잔액: " + customer.cash + "원)");
    }

    static void check_inquiry(Customer customer){
        System.our.println(customer.id,"님의 잔액은  %d원입니다.",customer.cash);
    }
    
}
