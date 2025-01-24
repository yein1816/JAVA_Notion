package ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /*
        * [논리 연산자의 우선순위]
        * && : 11위
        * || : 12위
        * */

        /*
        * 1 <= x <= 100 (x)
        * x >=1 && x <= 100 (o)
        * */

        int num1 =77;
        System.out.println("1부터 100사이의 수니?"+(1 <= num1 && num1 <= 100)); //true

        /*영어 대문자인지 확인*/
        char ch1 = 'J';
        char ch2 = 'j';
        System.out.println("ch1이 영어 대문자가 맞니"+(ch1>='A' && ch1<='Z')); //true
        System.out.println("ch2이 영어 대문자가 맞니"+(ch2>='A' && ch2<='Z')); //false

        /*대소문자 상관 없이 영문자 y인지 확인*/
        char ch3 = 'Y';
        char ch4 = 'y';
        System.out.println("ch3이 영문자 y가 맞니?"+(ch3>='y' || ch3<='Y')); //true
        System.out.println("ch4는 영문자 y가 맞니?"+(ch4=='y' || ch4=='Y')); //true

        /*영문자 확인*/
        char ch5 = 'q';
        char ch6 = 'Q';
        char ch7 = '$';
        System.out.println("ch5는 영문자니?"+((ch5>='A' && ch5<='Z') || (ch5>='a' && ch5<='z'))); //true
        System.out.println("ch6는 영문자니?"+((ch6>='A' && ch6<='Z') || (ch6>='a' && ch6<='z'))); //true
        System.out.println("ch7는 영문자니?"+((ch7>='A' && ch7<='Z') || (ch7>='a' && ch7<='z'))); //false
    }
}
