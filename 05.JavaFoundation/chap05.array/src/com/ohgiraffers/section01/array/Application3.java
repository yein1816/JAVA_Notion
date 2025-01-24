package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*
        * [ 점수의 합게와 평균 구하기 ]
        * 1. 길이가 5인 정수형 배열을 만든다.
        * 2. Scanner를 이용하여 학생 5명의 Java 시험 점수를 입력받아, 만든 배열에 저장한다.
        * 3. 배열의 저장한 점수의 합계(int)와 평균(double)을 구하여 출력한다.
        * */

        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;
        double avg = 0;

        System.out.println("5명의 시험 점수를 입력하세요 ");

        for(int i = 0; i < scores.length; i++){
            System.out.print((i+1) + "번째 학생 점수 : ");
            scores[i] = sc.nextInt();

            sum += scores[i];
            avg = (int)((sum/5));
        }
        System.out.println("점수의 합계 : " + sum);
        System.out.println("점수의 평균 : " + avg);


    }
}
