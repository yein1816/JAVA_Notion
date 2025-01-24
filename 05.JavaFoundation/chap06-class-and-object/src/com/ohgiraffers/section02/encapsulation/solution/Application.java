package com.ohgiraffers.section02.encapsulation.solution;

public class Application {
    public static void main(String[] args) {

        /* 여기서도 값을 바꾸면 바꿀 수 있어 문제가 발생할 수 있다. */

        Children children1 = new Children();
        children1.setName("조수민");
        children1.setAge(3);

        Children children2 = new Children();
        children2.setName("이민지");
        children2.setAge(5);

        Children children3 = new Children();
        children3.setName("최완수");
        children3.setAge(-7);
//        children3.age = -7;

        System.out.println("놀고 있는 어린이1 : " +children1.getName()+"(" + children1.age + "세)");
        System.out.println("놀고 있는 어린이2 : " +children2.getName()+"(" + children2.age + "세)");
        System.out.println("놀고 있는 어린이3 : " +children3.getName()+"(" + children3.age + "세)");
    }
}
