package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /* 순차정렬 알고리즘 */

        /* 오름차순 정렬 */
        /* 배열의 첫 인덱스부터 마지막 전 인덱스까지 반복하는 반복문
        *  마지막 인덱스는 자연스럽게 정렬되므로 처리할 필요가 없다.*/
        int[] arr = {2,5,4,6,1,3};
        for(int i = 0; i < arr.length -1; i++ ){  // 몇회전을 할건지 마지막꺼는 할 필요가 없으니까 총 5번을 회전해서 숫자 비교
            for(int j = i+1; j< arr.length; j++){  // 처음과 두번째 요소를 비교하기위해 i+1 한다.
            /* 부등호만 반대로 처리하면 내림차순 정렬이 된다. > (오름), < (내림) 에 따라 오름차순 내림차순으로 결정*/
                if(arr[i] > arr[j]) { //첫번째 요소와 다음 요소 비교 중 첫번째 요소가 더 큰 경우 둘의 숫자 위치를 바꾼다.
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(i + "번 인덱스 정렬 완료 : " + Arrays.toString(arr));  //
        }
        System.out.println("정렬 완료 : " + Arrays.toString(arr));


    }
}
