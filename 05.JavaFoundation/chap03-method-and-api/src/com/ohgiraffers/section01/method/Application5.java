package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        /*
        * [간단한 계산기 만들기]
        * 매개변수와 리턴값을 복합적으로 이용하여
        * 매개변수와 리턴값이 모두 존재하는 메소드를 만들어 보자.
        * */

        int firstNum = 20;
        int secondNum = 10;

        Application5 app5 = new Application5();  //객체 생성
        System.out.println("두 수 더하기 :" + app5.plusTwoNumbers(firstNum, secondNum));
        System.out.println("두 수 빼기 :" + app5.minusTwoNumbers(firstNum, secondNum));
        System.out.println(app5.multipleTwoNumbers(firstNum,secondNum));
        app5.divideTwoNumbers(firstNum, secondNum);

    }
    public int plusTwoNumbers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int minusTwoNumbers(int firstNum, int secondNum) {

        return firstNum - secondNum ;
    }

    public String multipleTwoNumbers(int firstNum, int secondNum) {
        return "두 수를 곱하기 :" + (firstNum * secondNum);
    }
    public void divideTwoNumbers(int firstNum, int secondNum) {
        //메서드에서 반환값이 필요 없으면 void로 선언
        System.out.println("두 수를 나눈 몫 :" + (firstNum / secondNum));
    }
}
