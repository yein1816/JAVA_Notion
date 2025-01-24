package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application6 {
    public static void main(String[] args) {

        /* 중복 제거
        *  5개 길이의 배열에 1~10 사이의 랜덤 값을 "중복 값 없이" 담기*/
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    i--;   // 같은 숫자가 있으면 멈추고 다시 위에 for문으로 가서 같은 숫자가 나왔던 자리에 숫자를 다시 뽑는다.
                    break;
                }

            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
