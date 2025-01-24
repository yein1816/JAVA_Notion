package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("월 급여 입력 : ");
        int salary = sc.nextInt();  //월 급여액

        System.out.print("매출액 입력 : ");
        int sale = sc.nextInt(); // 월 매출액

        double bonusRate = 0; //보너스율
        int bonus = 0;  //보너스금액

        //보너스율을 적용하여 출력되도록
        //총급여 = 월급여 + (매출액 * 보너스율 )

        if(sale >= 50000000) {
            bonusRate = 5 ;
            bonus = (int)(sale * (bonusRate/100)) ;
        }else if(sale >= 30000000){
            bonusRate = 3;
            bonus = (int)(sale * (bonusRate/100));
        }else if(sale >= 10000000){
            bonusRate = 1;
            bonus = (int)(sale * (bonusRate/100));
        }else {
            bonus = 0;
        }
        int total = salary + bonus;
        System.out.println("매출액 : " + sale + " 보너스율 : "+ (int)bonusRate + "% 월 급여 : " + salary + " 보너스 금액 : "+ bonus + " 총 급여 " + total );
    }
}
