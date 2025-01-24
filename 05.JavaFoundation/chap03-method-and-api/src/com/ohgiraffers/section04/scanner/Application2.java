package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /*
        * [ nextLine()과 next() ]
        * nextLine() : 공백을 포함한 한줄을 문자열로 반환(입력을 위한 개행문자 전까지의 문자열)
        * next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환(공백문자 미포함 문자열)
        * */

        /* Scanner 객체 생성 */
        Scanner scanner = new Scanner(System.in);

        /* nextLine() */
        System.out.print("인사말을 입력해 주세요 : ");
        String greeting1 = scanner.nextLine();
        System.out.println(greeting1);

        /* next() */
        System.out.print("인사말을 입력해 주세요 : ");
        String greeting2 = scanner.next();
        System.out.println(greeting2);
    }
}
