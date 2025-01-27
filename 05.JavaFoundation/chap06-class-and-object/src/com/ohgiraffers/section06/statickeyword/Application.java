package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        /* static 키워드에 대해 이해할 수 있다. */

        StaticFieldTest sft1 = new StaticFieldTest();
        System.out.println("non-static field : " + sft1.getNonStaticCount());  // 0
        System.out.println("static field : " + sft1.getStaticCount());  // 0

        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println("non-static field : " + sft1.getNonStaticCount()); // 1
        System.out.println("static field : " + sft1.getStaticCount()); // 1

        StaticFieldTest sft2 = new StaticFieldTest();
        System.out.println("non-static field : " + sft2.getNonStaticCount()); // 0
        System.out.println("static field : " + sft2.getStaticCount());  // 1 하나의 값을 공유하기 때문에 값이 유지된다.
        /* 인스턴스(객체 nonStaticCount) 변수의 경우 sft1와 sft2 두 개의 인스턴스가 생성 될 때마다 새로운 공간이 heap 영역에 할당 되어
        *  0으로 초기화 된다. static 변수의 경우 sft1와 sft2가 모두 static 영역에 할당 된 하나의 공간을 공유하므로
        *  증가된 값 1로 출력된다.
        * */

        /* static 메소드 호출 */
        StaticMethodTest.staticMethod();

        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();
        // steak sft1 , heap(동적) nonStaticCount 객체 생성될 때마다 할당되는 , static(정적) staticCount 프로그램 시작할때 할당되는 고정된 값
    }
}
