package com.ohgiraffers.section02.looping;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class D_dowhile {

    public void simpleDowhileStatement(){
        /*
        * [do-while문 표현식]
        * 초기식;
        * do {
        *   1회차에는 무조건 실행하고 이후에는 조건식을 확인하여 수행할 구문(= 반복할 구문);
        *   증감식;
        * } while(조건식);
        * */

        do {
            System.out.println("동작?!");
        }while (false);
        System.out.println("끝~!");
    }
    public void testDowhileSample() {
        /*
        * [입력받은 문자열 출력하기]
        * 1. Scanner를 이용하여 문자열을 입력받는다.
        * 2. 입력받은 문자열을 출력해준다.
        * 3. 만약 'exit'가 입력되면 프로그램을 종료한다.
        * (참고) 문자열은 == 비교가 불가능하므로 equals()를 사용한다. (자세한 내용은 뒤에서 다룰 예정)
        * ex) 입력받은 문자열.equals("비교할 문자열") -> 같으면 true, 다르면 false를 반환한다.
        * */

        Scanner sc = new Scanner(System.in);
        String text ;  // 문자열

        do{  // do는 조건 상관없이 먼저 시작하니까 먼저 시작할 구문을 작성
            System.out.print("문자열을 입력해주세요 : ");
            text = sc.nextLine();

            //입력받은 문자열과 exit와 비교해서 다르다면
            if(!text.equals("exit")){
                System.out.println("입력받은 문자열 : " + text );

            }

        }while(!text.equals("exit"));  //다를 시 계속 반복
        System.out.println("프로그램 종료합니다.");

    }
}
