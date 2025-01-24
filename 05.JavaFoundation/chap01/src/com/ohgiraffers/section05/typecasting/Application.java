package com.ohgiraffers.section05.typecasting;

public class Application {
    public static void main(String[] args) {
        /*
        * 데이터 형변환
        * 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * 즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.
        *
        * 자동형변환 : 컴파일러가 자동으로 수행해주는 타입 변환
        * 1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
        * 2. 정수는 실수로 자동 형변환 된다.
        * 3. 문자형은 int형으로 자동 형변환 된다.
        * 4. 논리형은 형변환 규칙에서 제외된다.
        *
        * 강제형변환(명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
        * */

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        // 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산한다.
        int num1 = 10;
        long num2 = 20;

        long result = num1 + num2;
//      int result = num1 + num2;  // 자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int에 담을 수 없다.

        float fnum = 4.0f;
        double dnum = fnum;

        // 정수형 -> 실수형 으로 형변환 (데이터 손실이 없어 에러 없이 형변환)
        long eight = 8;
        float four = eight;  //8.0으로 자동 형변환
        // 정수와 실수의 연산은 실수로 연산 결과가 반환된다.
        float result2 = eight + four;  // 8 + 8.0 = 16.0
        System.out.println(result2);

        // 문자형은 int형으로 자동 형변환 된다.
        char ch1 = 'a';
        int charNumber = ch1;
        System.out.println(charNumber); // 97

        // 논리형은 형변환 규칙에서 제외된다.
        // 어느 자료형이든 boolean을 형변환 해서 담을 수 없다.
        boolean isTrue = true;
//      byte b = isTrue;
//      int i = isTrue;
//      char c = isTrue;
    }
}
