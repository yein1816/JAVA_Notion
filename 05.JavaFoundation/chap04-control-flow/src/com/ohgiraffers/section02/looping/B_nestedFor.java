package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("단을 입력하세요 : ");
//        int num1 = sc.nextInt();
//
//        int multi = 0;
//        for(int i = num1; i <= 9; i++) {
//            multi *= i;
//        }
//        System.out.println(num1 + " : ");

        public void printGugudan() {
            for(int dan = 2; dan < 10; dan++) {
                System.out.println("=====" + dan + "단 =====");

                for(int su = 1; su < 10; su++){
                    System.out.println(dan + "*"+ su + "=" + (dan * su));
                }
                System.out.println("구구단 끝!");
            }

        }

        public void printStarInputRow() {
            /*
            * [별 5개씩 찍기]
            * 1.Scanner를 이용하여 row수(int)를 입력 받는다.
            * 2.한줄에 *이 5개인 row를 입력받은 만큼 출력한다.
            * 단, 중첩 for문을 사용한다.
            * */

            Scanner sc = new Scanner(System.in);
            System.out.print("행을 입력하세요 : ");
            int row = sc.nextInt();  //row 수 입력

            for(int i = 1; i <= row; i++){  // 행수 입력한거에 따라 반복되게

                for(int s = 1; s <= 5; s++){  // * 이 5개로 나오게
                    System.out.print('*');  // 줄바꿈 안되게 print
                }
                System.out.println();  // 줄바꿈 되게 println
            }
        }

        public void printStarTraining() {
            /*
             * [갯수만큼 * 찍기]
             * 1. Scanner를 이용하여 row(int)를 입력 받는다.
             * 2. 줄마다 row수 만큼 *을 출력한다.
             * 예시) 정수를 입력하세요 : 5
             *  *
             *  **
             *  ***
             *  ****
             *  *****
             * */

            Scanner sc = new Scanner(System.in);
            System.out.print("행을 입력하세요.");
            int row = sc.nextInt();

            for(int i = 1; i <= row; i++) {  //입력한 행 갯수만큼

                for(int j = 1; j <= i; j++){ // 각 줄마다 i 갯수만큼 출력되게
                    System.out.print('*');
                }
                System.out.println();
            }

        }
  

}
