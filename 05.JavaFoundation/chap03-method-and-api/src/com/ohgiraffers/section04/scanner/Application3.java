package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* next()로 문자열을 입력받은 후, 정수/실수/논리값을 입력받는 경우 */
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.next();  //문자열에 공백이거나 문자열이 아닌경우 Exception in thread "main" java.util.InputMismatchException 오류 발생
        System.out.println("str : " + str);

        sc.nextLine();  // 오류를 방지하고 다음 입력을 받을 수 있게 해준다.

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println("num : " + num);

        /* 정수/실수/논리값을 입력받은 후, nextLine()으로 문자열을 입력받는 경우 */
        System.out.print("다시 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 : " + num2);

        sc.nextLine();

        System.out.print("공백을 포함한 문자열을 입력해 주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 : " + str2);
    }
}
