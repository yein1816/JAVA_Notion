package ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /*
        * [AND 연산과 OR 연산의 특징]
        * 논리식 && 논리식2 : 논리식1의 결과가 FALSE이면 논리식2를 실행하지 않음
        * 논리식1 || 논리식2 : 논리식1의 결과가 TRUE이면 논리식2를 실행하지 않음
        * */

        /* 논리식 && 논리식
        * 조건식 두개를 모두 만족해야 TRUE를 반환하므로,
        * 앞에서 FALSE가 나오면 뒤의 조건을 확인할 필요 없이 FALSE를 반환한다.
        * 따라서 연산 횟수를 줄이기 위해 &&연산의 경우 앞에 FALSE가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
        * */

        int num1 =100;
        int num2 =200;

        int result1 = (false && ++num1 > 0)? num1 : num2;  //앞에 false가 있으므로 단축평가로 인해 뒤에 조건을 보지 않는다. ++num1 > 0 를 보지 않으므로 num2 출력
        System.out.println("&& 실행 결과 : " +result1);
        System.out.println(num1);

        /* 논리식 || 논리식
        * 조건식 둘 중 하나라도 true를 반환하면 true를 반환하므로,
        * 앞에서 true가 나오면 조건을 확인할 필요 없이 true를 반환한다.
        * 따라서 연산 횟수를 줄이기 위해서는 ||연산의 경우 앞에 true가 나올 가능성이 높은 조건ㅇ르 작성하는 편이 좋다.
        * */

        int num3 =100;
        int result2 = (true || ++num3 > 0)? num3 : num3;  // 100
        System.out.println("|| 실행 결과 : "+result2);
    }
}
