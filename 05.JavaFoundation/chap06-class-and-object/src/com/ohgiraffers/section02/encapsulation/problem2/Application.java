package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        /* <문제점 2> 필드의 이름이나 자료형이 변경되면 영향범위가 크다. */
        /* 이는 유지보수에 악영향을 끼친다. (=>결합도 높아진다)*/
        /* Children에서 선언한 name을 nickname으로 바꾸면 여기서 바꿀것이 많아지는 문제를 말한다.*/

//        Children children1 = new Children();
//
//        children1.name = "유찬";
//        children1.age = 5;
//
//        Children children2 = new Children();
//        children2.name = "정예인";
//        children2.age = 6;
//
//        Children children3 = new Children();
//        children3.name = "최유진";
//        children3.age =4;
//
//        System.out.println("놀고 있는 어린이1 : " +children1.name()+"(" + children1.age + "세)");
//        System.out.println("놀고 있는 어린이2 : " +children2.name()+"(" + children2.age + "세)");
//        System.out.println("놀고 있는 어린이3 : " +children3.name()+"(" + children3.age + "세)");
    }
}
