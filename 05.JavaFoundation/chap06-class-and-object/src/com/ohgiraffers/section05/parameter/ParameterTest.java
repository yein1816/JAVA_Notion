package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimaryType(int num){
        System.out.println("매개변수로 전달 받은 값 : " + num);
        num += 10;
        System.out.println("가공된 num : " + num);
    }
    public void testPrimaryTypeArrayParameter(int[] iarr){
        System.out.println("매개변수로 전달 받은 값 : " + Arrays.toString(iarr));
        iarr[0] = 99;
        iarr[1] = 96;
        System.out.println("가공된 iarr" + Arrays.toString(iarr));
    }
    public void testClassTypeParameter(Rectangle r){
        System.out.println("매개변수로 전달 받은 넓이와 둘레");
        r.calcArea();
        r.calcRound();
        r.setHeight(100);
        r.setWidth(100);

        System.out.println("가공 후 넓이와 둘레");
        r.calcArea();
        r.calcRound();
    }
    // 매개변수가 몇개 들어올지 모를 때 자료형 뒤에 ...  , 배열처럼 활용할 수 있다.
    // 가변인자는 항상 마지막에 작성해줘야한다. 안그러면 오류가 난다.
    /* 매개 변수가 몇 개 전달 될지 알 수 없으므로 반드시 매개변수 목록의 가장 뒤에 작성해야 한다. */
    public void testVariableLengthArrayParameter(String name,String... hobby ) {
        System.out.println("이름 : " + name);
        System.out.println("취미 : " + Arrays.toString(hobby));
        System.out.println("취미의 갯수 : " + hobby.length);
    }

    // 가변인자를 오버로딩을 하면 뭐를 호출해야할지 모르겠어서 오류가 난다.
    /* 가변 인자를 사용한 메소드를 오버로딩하면 모호해지는 문제가 발생할 수 있으므로 가급적 오버로딩 하지 않는다. */
//    public void testVariableLengthArrayParameter(String...hobby){}
}
