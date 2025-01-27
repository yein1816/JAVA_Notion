package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {
    private int count;

    public void nonStaticMethod(){
        this.count++;
        System.out.println("nonStaticMethod 호출 됨");
    }
    public static void staticMethod(){
        /* static 메소드는 인스턴스(객체)를 생성하지 않고 사용하는 메소드이기 때문에 this에 주소가 담길 수 없다. */
//        this.count++;
        System.out.println("staticMethod 호출 됨");
    }
}
