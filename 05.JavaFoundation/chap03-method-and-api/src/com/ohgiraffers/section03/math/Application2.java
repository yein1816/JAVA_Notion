package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application2 {
    public static void main(String[] args) {
        /*
        * [java.util.Random]
        * nextInt(int bound) : 0부터 매개변수로 젼달받은 정수 범위까지의 난수를 발생시켜 정수 형태로 반환
        *
        * [원하는 범위의 난수를 구하는 공식]
        * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        Random random = new Random();

        /* 1~10 난수 발생 */
        int random1 = random.nextInt(10) + 1;
        System.out.println("1~10사이의 난수 발생  : "+ random1);
    }
}
