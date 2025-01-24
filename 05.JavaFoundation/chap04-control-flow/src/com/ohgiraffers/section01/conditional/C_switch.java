package com.ohgiraffers.section01.conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C_switch {
    public static void main(String[] args) {
        /*
        * [ switch문 표현식 ]
        * switch(비교할변수) {
        *   case 비교값1 : 비교할변수의 값 == 비교값1 인 경우 실행할 구문; break;
        *   case 비교값2 : 비교할변수의 값 == 비교값2 인 경우 실행할 구문; break;
        *   default : 위 case에 모두 해당하지 않는 경우 실행할 구문; break;
        * }*/
    }
        public void simpleSwitchStatement(){
            Scanner sc = new Scanner(System.in);
            System.out.print("첫번째 정수 입력: ");
            int firstNum = sc.nextInt();
            System.out.print("두번째 정수 입력: ");
            int secondNum = sc.nextInt();
            System.out.println("연산 기호 입력 (+ - * / %) : ");
            char operator = sc.next().charAt(0);  //입력받은 문자열의 0번째 인덱스를 문자형으로 반환

            int result = 0;

            switch (operator){
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    result = firstNum / secondNum;
                    break;
                case '%':
                    result = firstNum % secondNum;
                    break;
                default:
                    System.out.println("잘못된 연산자를 입력하였습니다.");
                    break;
            }
            System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);
        }
    public void switchVendingMachine(){
        /*
        * <switch-case문 이용 실습>
        * 1.Scanner를 이용해 음료 이름(String)과 갯수(int)를 입력받는다.
        * 2. switch-case 문을 사용해 전체 가격을 구한다.
        * 3.['음료이름'을 '개수'개 선택하셨습니다. '가격'을 투입해주세요.]
        *   위와 같이 출력되도록 한다.
        * */
        System.out.println("==== Pandas Vending Machine ====");
        System.out.println("코카콜라    칠성사이다     피크닉    핫식스");
        /*코카콜라 1,700원 / 칠성사이다 1,500원 / 피크닉 1,000원 / 핫식스 2,100원*/
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("음료 이름 입력: ");

        String drink = sc.nextLine();  //음료 이름
        System.out.print("음료 갯수 입력: ");
        int num = sc.nextInt();   //갯수
        int price = 0;  //가격


        switch (drink){
            case "코카콜라" :
                price = 1700 * num;
                break;
            case "칠성사이다":
                price = 1500 * num;
                break;
            case "피크닉" :
                price = 1000 * num;
                break;
            case "핫식스" :
                price = 2100 * num;
                break;
            default:
                System.out.println("해당 음료는 준비되지 않았습니다. 다음에 다시 이용해 주세요.");return;

        }
        System.out.println(drink + "을" + num + "개 선택하셨습니다."+ price + "을 투입해주세요.");
    }


}
