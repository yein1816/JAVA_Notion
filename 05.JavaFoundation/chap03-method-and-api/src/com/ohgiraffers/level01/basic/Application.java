package com.ohgiraffers.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

       calculator.checkMethod();
       System.out.println(Calculator.sum1to10());
       System.out.println(Calculator.checkMaxNumber(10,20));
       System.out.println(Calculator.minusTwoNumber(10,5));

    }

}
