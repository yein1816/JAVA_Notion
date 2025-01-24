package com.ohgiraffers.section03.copy;

public class Application1 {
    public static void main(String[] args) {
        /*
        * [ 얕은 복사 (shallow copy) ]
        * stack의 주소값만 복사한다.
        * 따라서 두 개의 레퍼런스 변수가 동일한 배열의 주소값을 가지므로,
        * 하나의 래퍼런스 변수에 저장된 주소값으로 배열의 내용을 수정하면
        * 다른 래퍼런스 변수로 배열에 접근했을 때도 변경 사항이 반영된 값을 받는다.
        * */

        int[] originArr = {1,2,3,4,5};

        int[] copyArr = originArr;  // 얕은 복사

        System.out.println(originArr.hashCode());  //1283928880
        System.out.println(copyArr.hashCode());    //1283928880

        System.out.println("originArr[4] (before update) : " + originArr[4]);  // 5
        System.out.println("copyArr[4] (before update) : " + copyArr[4]);      // 5

        copyArr[4] = 90;    // 주소값을 복사해온거기 때문에 값을 변경하면 원본과 복사한거 둘다 같이 변경
        System.out.println("originArr[4] (after update) : " + originArr[4]);   // 90
        System.out.println("copyArr[4] (after update) : " + copyArr[4]);       // 90

        /*
        * [ 얕은복사의 활용 ]
        * 주로 메소드 호출 시 인자로 사용하는 경우와
        * 리턴값으로 동일한 배열을 반환하고 싶은 경우 사용한다.
        * */

        String[] team = {"김동현","강태민","황재용","진보경"};

        /* 인자와 매개변수로 활용 */
        System.out.println("team 배열 hashCode : " + team.hashCode());
        printArr(team);
        printArr(team);

        /* 리턴값으로 활용 */
        String[] arrFromMethod = getArr();
        System.out.println("getArr()로 반환받은 배열 hashCode() : " + arrFromMethod.hashCode());
        System.out.println();
    }
    public static void printArr(String[] arr){  //문자열 타입의 arr 배열을 선언  ,, void 반환값 x
        System.out.println("PrintArr() 매개변수 hashCode() : " + arr.hashCode());

        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
            arr[i] += "님";
        }
        System.out.println();
    }

    public static String[] getArr() {  //static 반환값 o
        String[] lunch = new String[] {"김치찌개","공기밥","물"};
        System.out.println("getArr()의 배열 hashCode() : " + lunch.hashCode());
        ;
        return lunch;
    }
}
