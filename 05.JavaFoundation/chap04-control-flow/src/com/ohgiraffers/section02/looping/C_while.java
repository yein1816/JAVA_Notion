package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
    public void simpleWhileStatement(){
        /*
        * [while문 표현식]
        * 초기식;
        * while(조건식){
        *   조건을 만족할 때 수행할 구문(= 반복할 구문);
        *   증감식;
        * }
        * */

        int i =1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }
    public void testWhileSample1(){
        /*
        * [1부터 10까지 더해서 출력하기]
        * while문을 사용해 1부터 10까지 더해서 출력한다.
        * */

        //for문
//        int sum = 0;
//        for(int i = 1; i <= 10; i++) {
//            sum+=i;
//        }
//        System.out.println(sum);

        //while문
        int i = 1;
        int sum = 0;
        while(i <= 10){
            sum += i;
        }
        System.out.println(sum);
    }
    public void testWhileSample2(){
        /*
        * [구구단]
        * 중첩된 while문을 활용하여 구구단을 출력한다.
        * */

//        for(int dan = 2; dan < 10; dan++) {
//            System.out.println("=====" + dan + "단 =====");
//
//            for(int su = 1; su < 10; su++){
//                System.out.println(dan + "*"+ su + "=" + (dan * su));
//            }
//            System.out.println("구구단 끝!");
//        }

        int dan = 2;

        while (dan < 10){
            System.out.println("=====" + dan + "단 =====");

            int su = 1;
            while (su < 10){
                System.out.println(dan + "*"+ su + "=" + (dan * su));
                su++;
            }
            System.out.println();
            dan++;
        }
        System.out.println("구구단 끝!");
    }

    public void testWhileSample3(){
        /*
        * [문자열을 문자형으로 쪼개어 출력하기]
        * 1. Scanner를 이용하여 문자열을 입력받는다.
        * 2. 입력한 문자열의 인덱스를 활용하여 한 글자씩 문자형으로 출력한다.
        * (참고) 문자열에서 인덱스에 해당하는 문자형을 반환하는 기능 charAt(인덱스)를 사용하고,
        * 문자열의 길이를 정수형으로 반환하는 기능 length()를 사용하면 된다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String inputString = sc.nextLine();  //입력받은 문자열

        int length = inputString.length(); // 입력받은 문자열의 길이

        //for문
//        for(int i = 0; i<length; i++){
//            char charInput = inputString.charAt(i);
//            System.out.println(charInput);
//        }

        //while문
        int i = 0;
        while (i < length){
            char charInput = inputString.charAt(i);   //입력받은 문자열을 문자형으로 반환해서 변수에 넣어주고
            i++;
            System.out.print(charInput + ", ");
        }

    }
}
