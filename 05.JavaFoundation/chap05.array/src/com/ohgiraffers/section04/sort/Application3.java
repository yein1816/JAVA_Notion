package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /*
        * [ 선택 정렬 ]
        * 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
        * 데이터의 양이 적을 때 좋은 성능을 나타낸다(교환횟수가 적음)
        * 배열을 전부 탐색하여 최소값을 찾아야 하기 때문에 100개 이상의 자료에서는 급격하게 속도가 저하된다.
        *  */

        int[] iarr = {2,5,4,6,1,3};
//        Arrays.sort(iarr);
//        System.out.println("sort 메소드 사용" + Arrays.toString(iarr));

        int min;                   // 최소값을 가진 데이터의 인덱스 저장 변수
        int temp;                  // 값을 임시로 저장할 변수


        for(int i = 0; i < iarr.length-1; i++ ){
            min = i;  // 0번째가 최소값을 가지고 있다고 임시로 설정하고 비교

            /* 해당 인덱스 다음 인덱스부터 끝까지 반복한다.*/    // i + 1 은 1번째인 5랑 비교  즉, 다음요소랑 비교한다는 뜻
            for(int j = i + 1; j < iarr.length; j++){   // j는 그냥 다음요소 중에서 제일 작은값을 찾아서 min한테 주는거다.
                /* i의 인덱스보다 작은 값이 있는 인덱스의 경우 min을 변경한다.*/
                if(iarr[min] > iarr[j]){
                    min = j;
                }
            }
            /* 작은 값을 시작 인덱스와 교환한다.*/
            temp = iarr[min];
            iarr[min] = iarr[i];
            iarr[i] = temp;
//            System.out.println(Arrays.toString(iarr));
        }
        System.out.println(Arrays.toString(iarr));
    }
}
