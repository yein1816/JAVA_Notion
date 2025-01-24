package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }
    public static String sum1to10(){
        int sum = 0;
        for(int i = 1;  i<= 10; i++){
            sum  += i;
//            System.out.println("1부터 10까지의 합 : " + sum);
        }
        return "1부터 10까지의 합 : " + sum;
    }
    public static String checkMaxNumber(int a, int b) {
        return "두 수 중 큰 수는 "+( a > b ? a : b)+"이다";
    }
    public static String minusTwoNumber(int a, int b) {
        return "10과 5의 차는 :"+(a - b);
    }
}
