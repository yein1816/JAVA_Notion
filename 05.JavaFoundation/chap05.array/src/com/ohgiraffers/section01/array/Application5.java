package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {

        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 1 2 3 4 3 2 1
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 8
         *
         * -- 출력 예시 --
         * 양수 혹은 홀수만 입력해야 합니다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 점수를 입력하세요 : ");
        int odd = sc.nextInt();  // 홀수인 양의 점수

        if (odd <= 0 || odd % 2 == 0) {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }else {
            int[] oddArray = new int[odd];  //배열 생성
            int mid = odd/2;  //입력한 숫자를 반으로 나눠서 중간을 만들어

            for(int i = 0; i <= mid; i++){ // 중간까지해서 오름차순 해
                oddArray[i] = i+1;  // 1부터 1씩 증가
//                System.out.println(oddArray[i]);

            }
            //중간숫자 기점으로 숫자 1씩 줄어들게
            for(int i = mid+1; i < odd; i++){  // 중간
                oddArray[i] = odd-i;
//                System.out.println(oddArray[i]);
            }

            for(int i =0; i<odd; i++){  //배열 출력
                System.out.print(oddArray[i] + " ");
            }
            System.out.println();


//            int i = mid + 1;
//            mid은 배열의 중간 인덱스를 의미 예를 들어, 배열의 크기가 7이라면 mid은 7 / 2 = 3
//            mid + 1은 중간 인덱스 바로 다음 인덱스를 의미 즉, 배열의 중간 이후에 값을 채우기 시작해야 하므로 mid + 1로 시작.
//            예를 들어, 배열 크기가 7이면 mid은 3이므로 mid + 1은 4가 된다.  즉, 4번 인덱스부터 값을 넣기 시작
//            i < odd;
//            i < odd은 루프가 배열의 끝까지 진행되도록 하는 조건 odd은 배열의 크기이고, i는 현재 인덱스 이 조건이 true일 때만 루프가 계속 실행
//            배열 크기가 7이면 i가 4부터 시작해서 6까지 값이 할당
//              내림차순으로 해야되니까 배열의 크기에서 현재 인덱스를 빼야함


        }

    }
}
