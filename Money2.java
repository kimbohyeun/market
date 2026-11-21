import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Money2{

    static void moneyCharge(Customer2 customer, Scanner sc) {
        System.out.println(customer.id + "님 얼마를 충전하시겠습니까?");
        int num = sc.nextInt();

        customer.cash += num; // 대상 객체의 잔액을 직접 변경
        System.out.println(num + "원 충전되었습니다. (현재 잔액: " + customer.cash + "원)");
    }

    static void check_inquiry(Customer2 customer){
        System.out.println(customer.id + "님의 잔액은 " + customer.cash + "원입니다.");
    }
    
}
