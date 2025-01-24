package com.ohgiraffers.section04.overflow;

public class Application {
    public static void main(String[] args) {
        /*
        * 오버플로우
        * 자료형별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리 하고 sign bit를 반전시켜 최소값으로 순환시킴
        * */

        byte num1 = 127;   // byte -128 ~ 127 (범위)  byte의 최대 저장 범위

        num1++;  // 1 증가
        System.out.println("num1 overflow : " + num1);  // -128 : byte의 최소 저장 범위

        // 언더플로우
        // 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 (반전시킴)

        byte num2 = -128;

        num2--; // 1 감소
        System.out.println("num2 underflow : " + num2);  // 127

        int firstNum = 1000000;  //100만
        int secondNum = 700000;  //70만

        int multi = firstNum * secondNum;   // 7천억이 나올것을 기대
        System.out.println("firstNum * secondNum : " + multi);  // -79669248가 나온다.

        long longMulti = firstNum * secondNum;  //이미 오버플로우가 된 값을 long에 담아봤자 똑같다.
        System.out.println("longMulti : " + longMulti); // -79669248가 나온다.

        // 강제형변환 이용
        long result = (long)firstNum * secondNum;
        System.out.println("result : " + result);
    }
}
