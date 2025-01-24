package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */

        Scanner sc = new Scanner(System.in);

        int[] secretNumber = new int[4]; // 랜덤 4자리
        boolean[] checked = new boolean[10]; // 중복체크 배열

        // 4자리 생성 랜덤으로  중복되지 않게
        for (int i = 0; i < 4; i++) {
            int num;  // 랜덤 숫자가 담을 변수
            do {
                num = (int) (Math.random() * 10); // 0~9번 숫자 랜덤으로
            } while (checked[num]);  // 중복 방지

            secretNumber[i] = num;
            checked[num] = true; // 해당 숫자 사용 표시
        }

        int count = 0;  //기회
        int maxCount = 10;  // 총 기회 10번
        boolean correct = false;  // 정답 맞췄는지

        System.out.println("4자리 숫자를 맞추는 게임입니다.");
        System.out.println("숫자와 자리가 모두 맞으면 스트라이크, 숫자는 맞지만 자리는 맞지 않으면 볼입니다.");

        while (count < maxCount && !correct) {  // 입력한 수와 랜덤 수랑 틀리다면
            System.out.print((count + 1) + "번째 시도: ");
            String input = sc.nextLine().trim();

            //4자리의 정수를 입력하지 않은 경우
            if (input.length() != 4 || input.matches("[0-9]")) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }
            ;

            // 입력된 문자를 숫자 배열로
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = Character.getNumericValue(input.charAt(i));   //getNumericValue() 가 문자를 숫자형으로
            }

            // 스트라이크와 볼 계산
            int strike = 0;
            int ball = 0;

            for (int i = 0; i < 4; i++) {
                // strike
                if (secretNumber[i] == arr[i]) {
                    strike++;

                } else {
                    // ball
                    for (int j = 0; j < 4; j++) {
                        if (i != j && secretNumber[i] == arr[j]) {
                            ball++;
                            break;
                        }
                    }
                }

                // 힌트 출력
                System.out.println(strike + "S " + ball + "B");

                //숫자와 자리가 모두 맞는 경우 스트라이크
                if (strike == 4) {
                    correct = true;
                    System.out.println("정답입니다.");
                }
                count++;  //맞춘 횟수 증가
            }
            // 기회 소진 시
            if (count == maxCount && !correct) {
                System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
            }
        }
    }
}
