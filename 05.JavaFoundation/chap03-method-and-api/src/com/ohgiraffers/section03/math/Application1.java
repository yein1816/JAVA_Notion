package com.ohgiraffers.section03.math;

public class Application1 {
    public static void main(String[] args) {
        /*
        * [java.lang.Math]
        * 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스이다.
        * 모든 메소드는 static 메소드로 작성되어 있다.
        * (객체의 상태를 관리하지 않고 기능만 제공하는 경우, 메모리를 효율적으로 사용하기 위해 자주 사용되는 기법이다.)
        * */

        /* 절대값 출력 */
        System.out.println("-7의 절대값 : " + java.lang.Math.abs(-7));
        System.out.println("-1.21의 절대값 : " + Math.abs(-1.21));

        /* 최대값, 최소값 출력 */
        System.out.println("더 큰 값 : " + Math.max(12,18));
        System.out.println("더 작은 값 : " + Math.min(1,21));

        /* 난수 출력 */
        System.out.println("난수 발생 : " + Math.random());

        /*
        * [원하는 범위의 난수를 구하는 공식]
        * (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        /* 1 ~ 10까지의 난수 발생 */
        int random1 = (int) (Math.random() * 10) + 1;
        System.out.println("1~10 사이의 난수 : " + random1);
    }
}
